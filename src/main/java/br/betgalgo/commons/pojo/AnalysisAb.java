/**
 * 
 */
package br.betgalgo.commons.pojo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public abstract class AnalysisAb {

	@SerializedName("top_time")
	@Expose
	private Double topTime;
	@SerializedName("overall")
	@Expose
	private Integer overall;
	@SerializedName("preview")
	@Expose
	private Integer preview;
	@SerializedName("result")
	@Expose
	private String result;
	@SerializedName("rating_top_time")
	@Expose
	private Integer ratingTopTime;
	@SerializedName("average_place")
	@Expose
	private Double averagePlace;
	@SerializedName("rating_average_place")
	@Expose
	private Integer ratingAveragePlace;
	@SerializedName("last_time")
	@Expose
	private Double lastTime;
	@SerializedName("rating_last_time")
	@Expose
	private Integer ratingLastTime;
	@SerializedName("average_time")
	@Expose
	private Double averageTime;
	@SerializedName("rating_average_time")
	@Expose
	private Integer ratingAverageTime;
	@SerializedName("top_break_time")
	@Expose
	private Double topBreakTime;
	@SerializedName("rating_top_break_time")
	@Expose
	private Integer ratingTopBreakTime;
	@SerializedName("average_break_time")
	@Expose
	private Double averageBreakTime;
	@SerializedName("rating_average_break_time")
	@Expose
	private Integer ratingAverageBreakTime;
	@SerializedName("average_recovery")
	@Expose
	private Double averageRecovery;
	@SerializedName("average_final_time")
	@Expose
	private Double averageFinalTime;
	@SerializedName("rating_average_final_time")
	@Expose
	private Integer ratingAverageFinalTime;
	@SerializedName("average_final_break_time")
	@Expose
	private Double averageFinalBreakTime;
	@SerializedName("rating_average_final_break_time")
	@Expose
	private Integer ratingAverageFinalBreakTime;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public AnalysisAb() {
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
	public AnalysisAb(Double topTime, Integer overall, Integer preview, String result, Integer ratingTopTime,
			Double averagePlace, Integer ratingAveragePlace, Double lastTime, Integer ratingLastTime,
			Double averageTime, Integer ratingAverageTime, Double topBreakTime, Integer ratingTopBreakTime,
			Double averageBreakTime, Integer ratingAverageBreakTime, Double averageRecovery, Double averageFinalTime,
			Integer ratingAverageFinalTime, Double averageFinalBreakTime, Integer ratingAverageFinalBreakTime) {
		super();
		this.topTime = topTime;
		this.overall = overall;
		this.preview = preview;
		this.result = result;
		this.ratingTopTime = ratingTopTime;
		this.averagePlace = averagePlace;
		this.ratingAveragePlace = ratingAveragePlace;
		this.lastTime = lastTime;
		this.ratingLastTime = ratingLastTime;
		this.averageTime = averageTime;
		this.ratingAverageTime = ratingAverageTime;
		this.topBreakTime = topBreakTime;
		this.ratingTopBreakTime = ratingTopBreakTime;
		this.averageBreakTime = averageBreakTime;
		this.ratingAverageBreakTime = ratingAverageBreakTime;
		this.averageRecovery = averageRecovery;
		this.averageFinalTime = averageFinalTime;
		this.ratingAverageFinalTime = ratingAverageFinalTime;
		this.averageFinalBreakTime = averageFinalBreakTime;
		this.ratingAverageFinalBreakTime = ratingAverageFinalBreakTime;
	}

	public Double getTopTime() {
		return topTime;
	}

	public void setTopTime(Double topTime) {
		this.topTime = topTime;
	}

	public AnalysisAb withTopTime(Double topTime) {
		this.topTime = topTime;
		return this;
	}

	public Integer getOverall() {
		return overall;
	}

	public void setOverall(Integer overall) {
		this.overall = overall;
	}

	public AnalysisAb withOverall(Integer overall) {
		this.overall = overall;
		return this;
	}

	public Integer getPreview() {
		return preview;
	}

	public void setPreview(Integer preview) {
		this.preview = preview;
	}

	public AnalysisAb withPreview(Integer preview) {
		this.preview = preview;
		return this;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public AnalysisAb withResult(String result) {
		this.result = result;
		return this;
	}

	public Integer getRatingTopTime() {
		return ratingTopTime;
	}

	public void setRatingTopTime(Integer ratingTopTime) {
		this.ratingTopTime = ratingTopTime;
	}

	public AnalysisAb withRatingTopTime(Integer ratingTopTime) {
		this.ratingTopTime = ratingTopTime;
		return this;
	}

	public Double getAveragePlace() {
		return averagePlace;
	}

	public void setAveragePlace(Double averagePlace) {
		this.averagePlace = averagePlace;
	}

	public AnalysisAb withAveragePlace(Double averagePlace) {
		this.averagePlace = averagePlace;
		return this;
	}

	public Integer getRatingAveragePlace() {
		return ratingAveragePlace;
	}

	public void setRatingAveragePlace(Integer ratingAveragePlace) {
		this.ratingAveragePlace = ratingAveragePlace;
	}

	public AnalysisAb withRatingAveragePlace(Integer ratingAveragePlace) {
		this.ratingAveragePlace = ratingAveragePlace;
		return this;
	}

	public Double getLastTime() {
		return lastTime;
	}

	public void setLastTime(Double lastTime) {
		this.lastTime = lastTime;
	}

	public AnalysisAb withLastTime(Double lastTime) {
		this.lastTime = lastTime;
		return this;
	}

	public Integer getRatingLastTime() {
		return ratingLastTime;
	}

	public void setRatingLastTime(Integer ratingLastTime) {
		this.ratingLastTime = ratingLastTime;
	}

	public AnalysisAb withRatingLastTime(Integer ratingLastTime) {
		this.ratingLastTime = ratingLastTime;
		return this;
	}

	public Double getAverageTime() {
		return averageTime;
	}

	public void setAverageTime(Double averageTime) {
		this.averageTime = averageTime;
	}

	public AnalysisAb withAverageTime(Double averageTime) {
		this.averageTime = averageTime;
		return this;
	}

	public Integer getRatingAverageTime() {
		return ratingAverageTime;
	}

	public void setRatingAverageTime(Integer ratingAverageTime) {
		this.ratingAverageTime = ratingAverageTime;
	}

	public AnalysisAb withRatingAverageTime(Integer ratingAverageTime) {
		this.ratingAverageTime = ratingAverageTime;
		return this;
	}

	public Double getTopBreakTime() {
		return topBreakTime;
	}

	public void setTopBreakTime(Double topBreakTime) {
		this.topBreakTime = topBreakTime;
	}

	public AnalysisAb withTopBreakTime(Double topBreakTime) {
		this.topBreakTime = topBreakTime;
		return this;
	}

	public Integer getRatingTopBreakTime() {
		return ratingTopBreakTime;
	}

	public void setRatingTopBreakTime(Integer ratingTopBreakTime) {
		this.ratingTopBreakTime = ratingTopBreakTime;
	}

	public AnalysisAb withRatingTopBreakTime(Integer ratingTopBreakTime) {
		this.ratingTopBreakTime = ratingTopBreakTime;
		return this;
	}

	public Double getAverageBreakTime() {
		return averageBreakTime;
	}

	public void setAverageBreakTime(Double averageBreakTime) {
		this.averageBreakTime = averageBreakTime;
	}

	public AnalysisAb withAverageBreakTime(Double averageBreakTime) {
		this.averageBreakTime = averageBreakTime;
		return this;
	}

	public Integer getRatingAverageBreakTime() {
		return ratingAverageBreakTime;
	}

	public void setRatingAverageBreakTime(Integer ratingAverageBreakTime) {
		this.ratingAverageBreakTime = ratingAverageBreakTime;
	}

	public AnalysisAb withRatingAverageBreakTime(Integer ratingAverageBreakTime) {
		this.ratingAverageBreakTime = ratingAverageBreakTime;
		return this;
	}

	public Double getAverageRecovery() {
		return averageRecovery;
	}

	public void setAverageRecovery(Double averageRecovery) {
		this.averageRecovery = averageRecovery;
	}

	public AnalysisAb withAverageRecovery(Double averageRecovery) {
		this.averageRecovery = averageRecovery;
		return this;
	}

	public Double getAverageFinalTime() {
		return averageFinalTime;
	}

	public void setAverageFinalTime(Double averageFinalTime) {
		this.averageFinalTime = averageFinalTime;
	}

	public AnalysisAb withAverageFinalTime(Double averageFinalTime) {
		this.averageFinalTime = averageFinalTime;
		return this;
	}

	public Integer getRatingAverageFinalTime() {
		return ratingAverageFinalTime;
	}

	public void setRatingAverageFinalTime(Integer ratingAverageFinalTime) {
		this.ratingAverageFinalTime = ratingAverageFinalTime;
	}

	public AnalysisAb withRatingAverageFinalTime(Integer ratingAverageFinalTime) {
		this.ratingAverageFinalTime = ratingAverageFinalTime;
		return this;
	}

	public Double getAverageFinalBreakTime() {
		return averageFinalBreakTime;
	}

	public void setAverageFinalBreakTime(Double averageFinalBreakTime) {
		this.averageFinalBreakTime = averageFinalBreakTime;
	}

	public AnalysisAb withAverageFinalBreakTime(Double averageFinalBreakTime) {
		this.averageFinalBreakTime = averageFinalBreakTime;
		return this;
	}

	public Integer getRatingAverageFinalBreakTime() {
		return ratingAverageFinalBreakTime;
	}

	public void setRatingAverageFinalBreakTime(Integer ratingAverageFinalBreakTime) {
		this.ratingAverageFinalBreakTime = ratingAverageFinalBreakTime;
	}

	public AnalysisAb withRatingAverageFinalBreakTime(Integer ratingAverageFinalBreakTime) {
		this.ratingAverageFinalBreakTime = ratingAverageFinalBreakTime;
		return this;
	}

}
