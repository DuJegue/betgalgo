package br.betgalgo.mvc.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.betgalgo.commons.pojo.Race;

@Controller
@RequestMapping("/")
public class DashboardController {

	@Autowired
	private ExtractRacesController controller;

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		List<Race> listRace = null;
		
		try {
			listRace = controller.extract();
		} catch (IOException e) {
			e.printStackTrace();
		}

		model.addAttribute("races", listRace);

		return "dashboard";
	}

}