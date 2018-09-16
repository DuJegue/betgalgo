package br.betgalgo.commons.pojo;

import java.io.Serializable;

import com.google.gson.annotations.JsonAdapter;

import br.betgalgo.commons.util.AnalysisAdapter;

@JsonAdapter(AnalysisAdapter.class)
public class Analysis extends AnalysisAb implements Serializable {

	private static final long serialVersionUID = -4160716070458249666L;
	
	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Analysis() {
		super();
	}

	/**
	 * 
	 * @param result
	 * @param ratingAverageTime
	 * @param ratingAverageFinalBreakTime
	 * @param ratingTopTime
	 * @param lastTime
	 * @param averagePlace
	 * @param averageRecovery
	 * @param ratingAverageBreakTime
	 * @param averageBreakTime
	 * @param preview
	 * @param ratingAveragePlace
	 * @param ratingAverageFinalTime
	 * @param averageTime
	 * @param topTime
	 * @param overall
	 * @param ratingLastTime
	 * @param averageFinalTime
	 * @param averageFinalBreakTime
	 * @param ratingTopBreakTime
	 * @param topBreakTime
	 */
	public Analysis(Double topTime, Integer overall, Integer preview, String result, Integer ratingTopTime,
			Double averagePlace, Integer ratingAveragePlace, Double lastTime, Integer ratingLastTime,
			Double averageTime, Integer ratingAverageTime, Double topBreakTime, Integer ratingTopBreakTime,
			Double averageBreakTime, Integer ratingAverageBreakTime, Double averageRecovery, Double averageFinalTime,
			Integer ratingAverageFinalTime, Double averageFinalBreakTime, Integer ratingAverageFinalBreakTime) {
		super();
	}
}