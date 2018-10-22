package br.betgalgo.schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.betgalgo.mvc.controller.ExtractRacesController;

@Component
public class Schedule {

	@Autowired
	private ExtractRacesController controller;

	private final long SEGUNDO = 1000;
	private final long MINUTO = SEGUNDO * 60;
	private final long HORA = MINUTO * 60;

	@Scheduled(fixedDelay = MINUTO)
	// @Scheduled(cron = "0 0 1 * * ")
	public void teste() {

		try {
			System.out.println(executeMavenTest());
			controller.extract();
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}

	private String executeMavenTest() throws IOException, InterruptedException {

		StringBuffer output = new StringBuffer();

		Process p = Runtime.getRuntime().exec(controller.getUserProperties().getCommand());
		p. waitFor();
		BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

		String line = "";
		while ((line = reader.readLine()) != null) {
			output.append(line + "\n");
		}

		return output.toString();

	}
}
