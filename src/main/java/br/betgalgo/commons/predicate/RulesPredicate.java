package br.betgalgo.commons.predicate;

import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;

import br.betgalgo.commons.pojo.DogAb;
import br.betgalgo.commons.util.UserProperties;

public class RulesPredicate {

	@Autowired
	private static UserProperties userProperties;

	public static Predicate<DogAb> isNotNull() {
		return p -> p != null && p.getAnalysis() != null && p.getAnalysis().getPreview() != null;
	}

	public static Predicate<DogAb> isPreviewValid() {
		return p -> p.getAnalysis().getPreview().equals(userProperties.getPreview())
				|| p.getAnalysis().getPreview().equals(userProperties.getPreview2());
	}

	public static Predicate<DogAb> isOverallValid() {
		return p -> p.getAnalysis().getOverall() != null
				&& p.getAnalysis().getOverall().intValue() < userProperties.getLimitOverall();
	}

	public static Predicate<DogAb> isChanceOfWinValid() {
		return p -> p.getChanceOfWin() != null && p.getChanceOfWin().intValue() < userProperties.getLimitChanceOfWin();
	}

}
