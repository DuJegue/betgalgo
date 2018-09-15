package br.betgalgo.mvc.controller;

import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.betgalgo.commons.pojo.Dashboard;

@Controller
@RequestMapping("/")
public class DashboardController {
	
	@Autowired
	public DashboardController() {
		
	}

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
    	//String fileDataDashBoard = new String(Files.readAllBytes(Paths.get("dashboard.json")));

		Reader fileDashboard;

		try {
			
			fileDashboard = new InputStreamReader(getClass().getResourceAsStream("/static/dashboard.json"));
			
			Dashboard dashboard = gson.fromJson(fileDashboard, Dashboard.class);
			
			Collections.sort(dashboard.getData());
			
			model.addAttribute("races", dashboard.getData());

		} catch (Exception e) {
			e.printStackTrace();
		} 

		return "dashboard";
	}
	   
}