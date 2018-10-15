package br.betgalgo.mvc.controller;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import br.betgalgo.commons.pojo.Analysis;
import br.betgalgo.commons.pojo.Analysis2;
import br.betgalgo.commons.pojo.Race;
import br.betgalgo.commons.util.Analysis2Adapter;
import br.betgalgo.commons.util.AnalysisAdapter;
import br.betgalgo.commons.util.ConfigProperties;
import br.betgalgo.commons.util.IntegerCustom;
import br.betgalgo.commons.util.IntegerCustomTypeAdapter;
import br.betgalgo.commons.util.Rules;

@Component
public class ExtractRacesController extends ConfigProperties {

	public List<Race> extract() throws IOException {
		List<Race> listRace = new ArrayList<>();

		Gson gson = new GsonBuilder().registerTypeAdapter(Analysis.class, new AnalysisAdapter())
				.registerTypeAdapter(Analysis2.class, new Analysis2Adapter())
				.registerTypeAdapter(IntegerCustom.class, new IntegerCustomTypeAdapter()).setPrettyPrinting().create();

		Stream<Path> listFile = Files.list(Paths.get(".")).filter(f -> f.getFileName().toString().endsWith(".json"));

		listFile.forEach(f -> {
			try {
				listRace.add(gson.fromJson(new InputStreamReader(new FileInputStream(f.toFile())), Race.class));
			} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
				e.printStackTrace();
			}

		});

		List<String> listSelected = Rules.applyRules(listRace);
		createFile(listSelected);
		sendEmail(listSelected);
		return listRace;
	}

	private void createFile(List<String> listGalgos) throws IOException {
		LocalDate hoje = LocalDate.now();
		StringBuilder sb = new StringBuilder();

		listGalgos.forEach(s -> {
			sb.append(s).append(" /n");
		});

		String nomeArquivo = getUserProperties().getFinalDirectory().concat(String.valueOf(hoje.getDayOfMonth()))
				.concat(".txt");
		Files.write(Paths.get(nomeArquivo), listGalgos.toString().getBytes());
	}

	private void sendEmail(List<String> listSelected) {

	}
}
