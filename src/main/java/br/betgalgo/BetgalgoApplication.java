package br.betgalgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@ComponentScan(basePackages = {"br.betgalgo.mvc.controller","br.betgalgo.commons.util", "br.betgalgo.schedule"})
@EnableScheduling
public class BetgalgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetgalgoApplication.class, args);
	}
}
