package br.betgalgo.schedule;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import br.betgalgo.commons.util.UserProperties;
import br.betgalgo.mvc.controller.ExtractRacesController;

@Component
public class GerateJsonSchedule {

    @Autowired
    private ExtractRacesController controller;

    @Autowired
    private UserProperties userProperties;

    private final long SEGUNDO = 1000;
    private final long MINUTO = SEGUNDO * 60;
    private final long HORA = MINUTO * 60;

    @Scheduled(fixedDelay = MINUTO)
    // @Scheduled(cron = "0 0 1 * * ")
    public void teste() {

        try {
            executeMavenTest();
            controller.extract();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void executeMavenTest() throws IOException, InterruptedException {

        StringBuffer output = new StringBuffer();

        ProcessBuilder builder = new ProcessBuilder("cmd.exe", "/c", userProperties.getCommand());
        builder.redirectErrorStream(true);
        Process p = builder.start();
        BufferedReader reader = new BufferedReader(new InputStreamReader(p.getInputStream()));

        String line = "";
        while ((line = reader.readLine()) != null) {
            output.append(line + "\n");
        }
        System.out.println(output.toString());
    }
}
