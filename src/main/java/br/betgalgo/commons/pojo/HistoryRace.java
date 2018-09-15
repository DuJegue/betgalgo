package br.betgalgo.commons.pojo;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class HistoryRace implements Serializable {

	@SerializedName("date")
	@Expose
	private String date;
	
	@SerializedName("distance")
	@Expose
	private Integer distance;
	
	@SerializedName("trap_number")
	@Expose
	private Integer trapNumber;
	
	@SerializedName("weight")
	@Expose
	private Double weight;
	
	@SerializedName("break_time")
	@Expose
	private Double breakTime;
	
	@SerializedName("bends_positions")
	@Expose
	private Integer bendsPositions;
	
	@SerializedName("recup")
	@Expose
	private String recup;
	
	@SerializedName("position")
	@Expose
	private Integer position;
	
	@SerializedName("comments")
	@Expose
	private String comments;
	
	@SerializedName("grade")
	@Expose
	private String grade;
	
	@SerializedName("has_grade")
	@Expose
	private String hasGrade;
	
	@SerializedName("final_time")
	@Expose
	private Double finalTime;
	
	@SerializedName("final_time_corrected")
	@Expose
	private Double finalTimeCorrected;
	
	private final static long serialVersionUID = 4836394419395167121L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public HistoryRace() {
	}

	/**
	 * 
	 * @param position
	 * @param weight
	 * @param finalTimeCorrected
	 * @param hasGrade
	 * @param date
	 * @param finalTime
	 * @param distance
	 * @param breakTime
	 * @param bendsPositions
	 * @param grade
	 * @param trapNumber
	 * @param recup
	 * @param comments
	 */
	public HistoryRace(String date, Integer distance, Integer trapNumber, Double weight, Double breakTime,
			Integer bendsPositions, String recup, Integer position, String comments, String grade, String hasGrade,
			Double finalTime, Double finalTimeCorrected) {
		super();
		this.date = date;
		this.distance = distance;
		this.trapNumber = trapNumber;
		this.weight = weight;
		this.breakTime = breakTime;
		this.bendsPositions = bendsPositions;
		this.recup = recup;
		this.position = position;
		this.comments = comments;
		this.grade = grade;
		this.hasGrade = hasGrade;
		this.finalTime = finalTime;
		this.finalTimeCorrected = finalTimeCorrected;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public HistoryRace withDate(String date) {
		this.date = date;
		return this;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public HistoryRace withDistance(Integer distance) {
		this.distance = distance;
		return this;
	}

	public Integer getTrapNumber() {
		return trapNumber;
	}

	public void setTrapNumber(Integer trapNumber) {
		this.trapNumber = trapNumber;
	}

	public HistoryRace withTrapNumber(Integer trapNumber) {
		this.trapNumber = trapNumber;
		return this;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public HistoryRace withWeight(Double weight) {
		this.weight = weight;
		return this;
	}

	public Double getBreakTime() {
		return breakTime;
	}

	public void setBreakTime(Double breakTime) {
		this.breakTime = breakTime;
	}

	public HistoryRace withBreakTime(Double breakTime) {
		this.breakTime = breakTime;
		return this;
	}

	public Integer getBendsPositions() {
		return bendsPositions;
	}

	public void setBendsPositions(Integer bendsPositions) {
		this.bendsPositions = bendsPositions;
	}

	public HistoryRace withBendsPositions(Integer bendsPositions) {
		this.bendsPositions = bendsPositions;
		return this;
	}

	public String getRecup() {
		return recup;
	}

	public void setRecup(String recup) {
		this.recup = recup;
	}

	public HistoryRace withRecup(String recup) {
		this.recup = recup;
		return this;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public HistoryRace withPosition(Integer position) {
		this.position = position;
		return this;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public HistoryRace withComments(String comments) {
		this.comments = comments;
		return this;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public HistoryRace withGrade(String grade) {
		this.grade = grade;
		return this;
	}

	public String getHasGrade() {
		return hasGrade;
	}

	public void setHasGrade(String hasGrade) {
		this.hasGrade = hasGrade;
	}

	public HistoryRace withHasGrade(String hasGrade) {
		this.hasGrade = hasGrade;
		return this;
	}

	public Double getFinalTime() {
		return finalTime;
	}

	public void setFinalTime(Double finalTime) {
		this.finalTime = finalTime;
	}

	public HistoryRace withFinalTime(Double finalTime) {
		this.finalTime = finalTime;
		return this;
	}

	public Double getFinalTimeCorrected() {
		return finalTimeCorrected;
	}

	public void setFinalTimeCorrected(Double finalTimeCorrected) {
		this.finalTimeCorrected = finalTimeCorrected;
	}

	public HistoryRace withFinalTimeCorrected(Double finalTimeCorrected) {
		this.finalTimeCorrected = finalTimeCorrected;
		return this;
	}

}