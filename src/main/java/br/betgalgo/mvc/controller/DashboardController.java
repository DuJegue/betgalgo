package br.betgalgo.mvc.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.betgalgo.commons.pojo.Analysis;
import br.betgalgo.commons.pojo.Analysis2;
import br.betgalgo.commons.pojo.DogAb;
import br.betgalgo.commons.pojo.Race;
import br.betgalgo.commons.pojo.RaceDetalhe;
import br.betgalgo.commons.util.Analysis2Adapter;
import br.betgalgo.commons.util.AnalysisAdapter;
import br.betgalgo.commons.util.IntegerCustom;
import br.betgalgo.commons.util.IntegerCustomTypeAdapter;
import br.betgalgo.commons.util.UserProperties;

@Controller
@RequestMapping("/")
public class DashboardController {
	
	private UserProperties userProperties;
	
	@Autowired
	public DashboardController() {

	}
	
	@Autowired
    public void setUserProperties(UserProperties userProperties) {
        this.userProperties = userProperties;
    }

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		
		Gson gson = new GsonBuilder().registerTypeAdapter(Analysis.class, new AnalysisAdapter())
				.registerTypeAdapter(Analysis2.class, new Analysis2Adapter())
				.registerTypeAdapter(IntegerCustom.class, new IntegerCustomTypeAdapter()).setPrettyPrinting().create();

		try {

			Stream<Path> listFile = Files.list(Paths.get(".")).filter(f -> f.getFileName().toString().endsWith(".json"));

			List<Race> listRace = new ArrayList<>();

			for (Iterator<Path> it = listFile.iterator(); it.hasNext();) {

				listRace.add(gson.fromJson(new InputStreamReader(new FileInputStream(it.next().toFile())), Race.class));
			}

			model.addAttribute("races", listRace);

			applyRules(listRace);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return "dashboard";
	}

	private void applyRules(List<Race> listRace) throws IOException {

		List<String> listSelected = new ArrayList<>();
		List<DogAb> listDogs;

		int preview = userProperties.getPreview();
		int preview2 = userProperties.getPreview2();
		int limitOverall = userProperties.getLimitOverall();
		int limitChanceOfWin = userProperties.getLimitChanceOfWin();
		int limitDistance = userProperties.getLimitDistance();

		for (Race rc : listRace) {

			RaceDetalhe raceDetalhe = rc.getRaceDetalhe();
			
			Integer distance = Integer.valueOf(raceDetalhe.getSecondTitle().substring(16).trim().substring(0,3));
			
			String raceTime = raceDetalhe.getFirstTitle().substring(15, 20);
			
			if (distance < limitDistance || !validRaceTime(raceTime)) {
				continue;				
			}
			
			listDogs = new ArrayList<>();
			listDogs.add(raceDetalhe.getDogs().getDog2());
			listDogs.add(raceDetalhe.getDogs().getDog3());
			listDogs.add(raceDetalhe.getDogs().getDog4());
			listDogs.add(raceDetalhe.getDogs().getDog5());
			listDogs.add(raceDetalhe.getDogs().getDog6());

			for (DogAb dogAb : listDogs) {

				if (dogAb != null && 
					dogAb.getAnalysis() != null && dogAb.getAnalysis().getPreview() != null && 
					(dogAb.getAnalysis().getPreview().equals(preview2) || dogAb.getAnalysis().getPreview().equals(preview)) && 
					dogAb.getAnalysis().getOverall() != null && dogAb.getAnalysis().getOverall().intValue() < limitOverall && 
					dogAb.getChanceOfWin() != null &&  dogAb.getChanceOfWin().intValue() < limitChanceOfWin) {

					listSelected.add(dogAb.getName());
					break;
				}
			}
		}
		
		StringBuilder listGalgos = new StringBuilder();
		
		for (String str : listSelected) {
			listGalgos.append(str + " \n");
		}
		
		String dia = String.valueOf(Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
		String finalDirectory = userProperties.getFinalDirectory();
		
		Files.write(Paths.get(finalDirectory + dia + ".txt"), listGalgos.toString().getBytes());
		
		System.out.println("------------------------------------");
		System.out.println("Total of Races: " + listRace.size());
		System.out.println("Selected: " + listSelected.size());
	}
	
	private boolean validRaceTime(String raceTime) {
		
		int limitHour = userProperties.getLimitHour();
		int limitMinute = userProperties.getLimitMinute();
		
		int hour = Integer.valueOf(raceTime.split(":")[0]);
		int minute = Integer.valueOf(raceTime.split(":")[1]);
		
		Calendar calRace = Calendar.getInstance();
		calRace.set(0, 0, 0, hour, minute);
		
		Calendar calLimit = Calendar.getInstance();
		calLimit.set(0, 0, 0, limitHour, limitMinute);
		
		return calRace.after(calLimit);
	}

}