package br.betgalgo;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.assertThat;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.betgalgo.commons.pojo.Analysis;
import br.betgalgo.commons.pojo.Analysis2;
import br.betgalgo.commons.pojo.Dog1;
import br.betgalgo.commons.pojo.Dog2;
import br.betgalgo.commons.pojo.Dog3;
import br.betgalgo.commons.pojo.Dog4;
import br.betgalgo.commons.pojo.Dog5;
import br.betgalgo.commons.pojo.Dog6;
import br.betgalgo.commons.pojo.Race;
import br.betgalgo.commons.pojo.RaceDetalhe;
import br.betgalgo.commons.util.Analysis2Adapter;
import br.betgalgo.commons.util.AnalysisAdapter;
import br.betgalgo.commons.util.IntegerCustom;
import br.betgalgo.commons.util.IntegerCustomTypeAdapter;

@RunWith(SpringRunner.class)
@TestPropertySource(locations = "classpath:user.properties")
@SpringBootTest
public class BetgalgoApplicationTests {

	private WebDriver driver;

	private Gson gson;

	private Map<String, Race> mapRace;

	@Autowired
	private Environment env;

	@Before
	public void init() {

		mapRace = new HashMap<>();

		gson = new GsonBuilder().registerTypeAdapter(Analysis.class, new AnalysisAdapter())
		         				.registerTypeAdapter(Analysis2.class, new Analysis2Adapter())
		         				.registerTypeAdapter(IntegerCustom.class, new IntegerCustomTypeAdapter())
		         				.setPrettyPrinting()
		         				.create();

		driver = new ChromeDriver();

		driver.get(env.getProperty("app.site"));

		WebElement inputUser = driver.findElement(By.name("username"));

		inputUser.sendKeys(env.getProperty("app.user"));

		WebElement inputPass = driver.findElement(By.name("password"));

		inputPass.sendKeys(env.getProperty("app.pass"));

		WebElement button = driver.findElement(By.cssSelector("button[type='submit'"));

		button.click();
	}

	@Test
	public void testAccess() {

		List<WebElement> links = driver.findElements(By.className("link-race"));
		List<String> listRaceId = new ArrayList<String>();

		String siteRace = env.getProperty("app.site.race");

		for (WebElement webElement : links) {
			listRaceId.add(webElement.getAttribute("data-race-id"));
		}

		for (String raceId : listRaceId) {
            
			driver.get(siteRace + raceId);
			
			try {
			
				Thread.sleep(3000);
			
				String json = driver.findElement(By.tagName("body")).getText();

				Race race = gson.fromJson(json, Race.class);

				mapRace.put(raceId, race);
	        
	            //Files.write(Paths.get(raceId + ".json"), json.getBytes());

			} catch (Exception e) {
	            e.printStackTrace();
	        }
		}

		List<String> selecionados = new ArrayList<>();
		
		for (Race rc : mapRace.values()) {

			RaceDetalhe raceDetalhe = rc.getRaceDetalhe();
			Dog1 dog1 = raceDetalhe.getDogs().getDog1();
			Dog2 dog2 = raceDetalhe.getDogs().getDog2();
			Dog3 dog3 = raceDetalhe.getDogs().getDog3();
			Dog4 dog4 = raceDetalhe.getDogs().getDog4();
			Dog5 dog5 = raceDetalhe.getDogs().getDog5();
			Dog6 dog6 = raceDetalhe.getDogs().getDog6();
            
			/*
			System.out.println("--------------Details-----------------------");
			System.out.println("FirstTitle: " + raceDetalhe.getFirstTitle());
			System.out.println("SecondTitle: " + raceDetalhe.getSecondTitle());
			System.out.println("-----------------------Dogs-----------------------");
			System.out.println("Dog 1: " + dog1.getName() + " Chance: " + dog1.getChanceOfWin());
			System.out.println("Dog 2: " + dog2.getName() + " Chance: " + dog2.getChanceOfWin());
			System.out.println("Dog 3: " + dog3.getName() + " Chance: " + dog3.getChanceOfWin());
			System.out.println("Dog 4: " + dog4.getName() + " Chance: " + dog4.getChanceOfWin());
			System.out.println("Dog 5: " + dog5.getName() + " Chance: " + dog5.getChanceOfWin());
			System.out.println("Dog 6: " + dog6.getName() + " Chance: " + dog6.getChanceOfWin());
			System.out.println("--------------------------------------------------");
		    */
			if (dog1!=null && dog2!=null && dog3!=null && dog4!=null && dog5!=null && dog6!=null &&
				dog1.getAnalysis()!=null &&	dog2.getAnalysis()!=null &&	dog3.getAnalysis()!=null &&	
				dog4.getAnalysis()!=null &&	dog5.getAnalysis()!=null &&	dog6.getAnalysis()!=null) {
				
				if (dog1.getAnalysis().getPreview()!=null && dog1.getAnalysis().getPreview().equals(6)) {
					selecionados.add(dog1.getName());
				} else if (dog2.getAnalysis().getPreview()!=null && dog2.getAnalysis().getPreview().equals(6)) {
					selecionados.add(dog2.getName()); 
				} else if (dog3.getAnalysis().getPreview()!=null && dog3.getAnalysis().getPreview().equals(6)) {
					selecionados.add(dog3.getName()); 
				} else if (dog4.getAnalysis().getPreview()!=null && dog4.getAnalysis().getPreview().equals(6)) {
					selecionados.add(dog4.getName()); 
				} else if (dog5.getAnalysis().getPreview()!=null && dog5.getAnalysis().getPreview().equals(6)) {
					selecionados.add(dog5.getName()); 
				} else if (dog6.getAnalysis().getPreview()!=null && dog6.getAnalysis().getPreview().equals(6)) {
					selecionados.add(dog6.getName()); 
				}
			}
		}
		System.out.println("------------------------------------");
		for (String str : selecionados) {
			System.out.println(str);
		}
		System.out.println("------------------------------------");
		System.out.println("Total corridas: " + mapRace.size());
		System.out.println("Selecionados: " + selecionados.size());
		
		assertThat("success", containsString("success"));
	}
}
