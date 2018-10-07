package br.betgalgo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"br.betgalgo.mvc.controller","br.betgalgo.commons.util"})
public class BetgalgoApplication {

	public static void main(String[] args) {
		SpringApplication.run(BetgalgoApplication.class, args);
	}
}
