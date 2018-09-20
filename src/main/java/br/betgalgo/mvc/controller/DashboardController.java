package br.betgalgo.mvc.controller;

import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
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
import br.betgalgo.commons.pojo.Race;
import br.betgalgo.commons.util.Analysis2Adapter;
import br.betgalgo.commons.util.AnalysisAdapter;
import br.betgalgo.commons.util.IntegerCustom;
import br.betgalgo.commons.util.IntegerCustomTypeAdapter;

@Controller
@RequestMapping("/")
public class DashboardController {

	@Autowired
	public DashboardController() {

	}

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {

		Gson gson = new GsonBuilder().registerTypeAdapter(Analysis.class, new AnalysisAdapter())
				.registerTypeAdapter(Analysis2.class, new Analysis2Adapter())
				.registerTypeAdapter(IntegerCustom.class, new IntegerCustomTypeAdapter()).setPrettyPrinting().create();

		try {

			Stream<Path> listFile = Files.list(Paths.get("."))
								    .filter(f -> f.getFileName().toString().endsWith(".json"));

			List<Race> listRace = new ArrayList<>();

			for (Iterator<Path> it = listFile.iterator(); it.hasNext();) {

				listRace.add(gson.fromJson(new InputStreamReader(new FileInputStream(it.next().toFile())), Race.class));
			}

			model.addAttribute("races", listRace);
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "dashboard";
	}

}