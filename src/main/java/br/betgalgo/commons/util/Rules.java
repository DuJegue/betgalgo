package br.betgalgo.commons.util;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import br.betgalgo.commons.pojo.DogAb;
import br.betgalgo.commons.pojo.Race;
import br.betgalgo.commons.pojo.RaceDetalhe;
import br.betgalgo.commons.predicate.RacePredicate;
import br.betgalgo.commons.predicate.RulesPredicate;

public abstract class Rules {

	public static List<String> applyRules(List<Race> listRace) {

		List<String> listSelected = new ArrayList<>();
		listRace.stream()
		.filter(RacePredicate.isDistanceValid())
		.filter(RacePredicate.isValidRace())
		.forEach(p -> {
			
			RaceDetalhe raceDetalhe = p.getRaceDetalhe();
					
			List<DogAb> listDogs = new ArrayList<>();
			listDogs.add(raceDetalhe.getDogs().getDog2());
			listDogs.add(raceDetalhe.getDogs().getDog3());
			listDogs.add(raceDetalhe.getDogs().getDog4());
			listDogs.add(raceDetalhe.getDogs().getDog5());
			listDogs.add(raceDetalhe.getDogs().getDog6());

			listSelected.add(listDogs.stream()
								.filter(RulesPredicate.isNotNull())
								.filter(RulesPredicate.isChanceOfWinValid())
								.filter(RulesPredicate.isOverallValid())
								.filter(RulesPredicate.isPreviewValid())
								.map(DogAb::getName)
								.findFirst().get());
		});
		

		return listSelected;
	}

}
