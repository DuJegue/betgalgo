package br.betgalgo.commons.predicate;

import java.util.Calendar;
import java.util.function.Predicate;

import org.springframework.beans.factory.annotation.Autowired;

import br.betgalgo.commons.pojo.Race;
import br.betgalgo.commons.util.UserProperties;

public class RacePredicate {
	
	@Autowired
	private static UserProperties userProperties;

	public static Predicate<Race> isDistanceValid() {
		return p -> Integer.valueOf(p.getRaceDetalhe().getSecondTitle().substring(16).trim().substring(0, 3)) > userProperties.getLimitDistance();
	}

	public static Predicate<Race> isValidRace() {
		return p -> validRace(p.getRaceDetalhe().getFirstTitle());
	}
	
	private static boolean validRace(String race) {
		String raceTime = race.substring(15, 20);

		int limitHour = userProperties.getLimitHour();
		int limitMinute = userProperties.getLimitMinute();

		int hour = Integer.valueOf(raceTime.split(":")[0]);
		int minute = Integer.valueOf(raceTime.split(":")[1]);

		Calendar calRace = Calendar.getInstance();
		calRace.set(0, 0, 0, hour, minute);

		Calendar calLimit = Calendar.getInstance();
		calLimit.set(0, 0, 0, limitHour, limitMinute);

		return calRace.after(calLimit);
	}
}
