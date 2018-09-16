package br.betgalgo.commons.pojo;

import java.io.Serializable;

import com.google.gson.annotations.JsonAdapter;

import br.betgalgo.commons.util.Analysis2Adapter;

@JsonAdapter(Analysis2Adapter.class)
public class Analysis2 extends AnalysisAb implements Serializable {

	private final static long serialVersionUID = -804285853206099694L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Analysis2() {
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
	public Analysis2(Double topTime, Integer overall, Integer preview, String result, Integer ratingTopTime,
			Double averagePlace, Integer ratingAveragePlace, Double lastTime, Integer ratingLastTime,
			Double averageTime, Integer ratingAverageTime, Double topBreakTime, Integer ratingTopBreakTime,
			Double averageBreakTime, Integer ratingAverageBreakTime, Double averageRecovery, Double averageFinalTime,
			Integer ratingAverageFinalTime, Double averageFinalBreakTime, Integer ratingAverageFinalBreakTime) {
		super();
	}
}