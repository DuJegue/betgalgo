package br.betgalgo.commons.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dog2 implements Serializable {

	@SerializedName("dog_id")
	@Expose
	private Integer dogId;

	@SerializedName("class_preview")
	@Expose
	private String classPreview;

	@SerializedName("class_preview_3")
	@Expose
	private String classPreview3;

	@SerializedName("class_preview_panel")
	@Expose
	private String classPreviewPanel;

	@SerializedName("chance_of_win")
	@Expose
	private Double chanceOfWin;

	@SerializedName("best_record_time")
	@Expose
	private Double bestRecordTime;

	@SerializedName("top_speed")
	@Expose
	private Integer topSpeed;

	@SerializedName("trap_number")
	@Expose
	private Integer trapNumber;

	@SerializedName("race_id")
	@Expose
	private Integer raceId;

	@SerializedName("race_date")
	@Expose
	private String raceDate;

	@SerializedName("name")
	@Expose
	private String name;

	@SerializedName("color")
	@Expose
	private String color;

	@SerializedName("sex")
	@Expose
	private String sex;

	@SerializedName("birth")
	@Expose
	private String birth;

	@SerializedName("weight")
	@Expose
	private Double weight;

	@SerializedName("trainer_name")
	@Expose
	private String trainerName;

	@SerializedName("last_race_date")
	@Expose
	private Integer lastRaceDate;

	@SerializedName("analysis")
	@Expose
	@Valid
	private Analysis analysis;

	@SerializedName("analysis_2")
	@Expose
	@Valid
	private Analysis2 analysis2;

	@SerializedName("history_races")
	@Expose
	@Valid
	private List<HistoryRace> historyRaces = new ArrayList<HistoryRace>();

	private final static long serialVersionUID = -6864665988694996332L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Dog2() {
	}

	/**
	 * 
	 * @param lastRaceDate
	 * @param birth
	 * @param sex
	 * @param weight
	 * @param classPreview3
	 * @param chanceOfWin
	 * @param bestRecordTime
	 * @param topSpeed
	 * @param dogId
	 * @param classPreview
	 * @param raceId
	 * @param color
	 * @param name
	 * @param trainerName
	 * @param trapNumber
	 * @param raceDate
	 * @param classPreviewPanel
	 */
	public Dog2(Integer dogId, String classPreview, String classPreview3, String classPreviewPanel, Double chanceOfWin,
			Double bestRecordTime, Integer topSpeed, Integer trapNumber, Integer raceId, String raceDate, String name,
			String color, String sex, String birth, Double weight, String trainerName, Integer lastRaceDate,
			Analysis analysis, Analysis2 analysis2, List<HistoryRace> historyRaces) {
		super();
		this.dogId = dogId;
		this.classPreview = classPreview;
		this.classPreview3 = classPreview3;
		this.classPreviewPanel = classPreviewPanel;
		this.chanceOfWin = chanceOfWin;
		this.bestRecordTime = bestRecordTime;
		this.topSpeed = topSpeed;
		this.trapNumber = trapNumber;
		this.raceId = raceId;
		this.raceDate = raceDate;
		this.name = name;
		this.color = color;
		this.sex = sex;
		this.birth = birth;
		this.weight = weight;
		this.trainerName = trainerName;
		this.lastRaceDate = lastRaceDate;
		this.analysis = analysis;
		this.analysis2 = analysis2;
		this.historyRaces = historyRaces;
	}

	public Integer getDogId() {
		return dogId;
	}

	public void setDogId(Integer dogId) {
		this.dogId = dogId;
	}

	public Dog2 withDogId(Integer dogId) {
		this.dogId = dogId;
		return this;
	}

	public String getClassPreview() {
		return classPreview;
	}

	public void setClassPreview(String classPreview) {
		this.classPreview = classPreview;
	}

	public Dog2 withClassPreview(String classPreview) {
		this.classPreview = classPreview;
		return this;
	}

	public String getClassPreview3() {
		return classPreview3;
	}

	public void setClassPreview3(String classPreview3) {
		this.classPreview3 = classPreview3;
	}

	public Dog2 withClassPreview3(String classPreview3) {
		this.classPreview3 = classPreview3;
		return this;
	}

	public String getClassPreviewPanel() {
		return classPreviewPanel;
	}

	public void setClassPreviewPanel(String classPreviewPanel) {
		this.classPreviewPanel = classPreviewPanel;
	}

	public Dog2 withClassPreviewPanel(String classPreviewPanel) {
		this.classPreviewPanel = classPreviewPanel;
		return this;
	}

	public Double getChanceOfWin() {
		return chanceOfWin;
	}

	public void setChanceOfWin(Double chanceOfWin) {
		this.chanceOfWin = chanceOfWin;
	}

	public Dog2 withChanceOfWin(Double chanceOfWin) {
		this.chanceOfWin = chanceOfWin;
		return this;
	}

	public Double getBestRecordTime() {
		return bestRecordTime;
	}

	public void setBestRecordTime(Double bestRecordTime) {
		this.bestRecordTime = bestRecordTime;
	}

	public Dog2 withBestRecordTime(Double bestRecordTime) {
		this.bestRecordTime = bestRecordTime;
		return this;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Dog2 withTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
		return this;
	}

	public Integer getTrapNumber() {
		return trapNumber;
	}

	public void setTrapNumber(Integer trapNumber) {
		this.trapNumber = trapNumber;
	}

	public Dog2 withTrapNumber(Integer trapNumber) {
		this.trapNumber = trapNumber;
		return this;
	}

	public Integer getRaceId() {
		return raceId;
	}

	public void setRaceId(Integer raceId) {
		this.raceId = raceId;
	}

	public Dog2 withRaceId(Integer raceId) {
		this.raceId = raceId;
		return this;
	}

	public String getRaceDate() {
		return raceDate;
	}

	public void setRaceDate(String raceDate) {
		this.raceDate = raceDate;
	}

	public Dog2 withRaceDate(String raceDate) {
		this.raceDate = raceDate;
		return this;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Dog2 withName(String name) {
		this.name = name;
		return this;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Dog2 withColor(String color) {
		this.color = color;
		return this;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Dog2 withSex(String sex) {
		this.sex = sex;
		return this;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Dog2 withBirth(String birth) {
		this.birth = birth;
		return this;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Dog2 withWeight(Double weight) {
		this.weight = weight;
		return this;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public Dog2 withTrainerName(String trainerName) {
		this.trainerName = trainerName;
		return this;
	}

	public Integer getLastRaceDate() {
		return lastRaceDate;
	}

	public void setLastRaceDate(Integer lastRaceDate) {
		this.lastRaceDate = lastRaceDate;
	}

	public Dog2 withLastRaceDate(Integer lastRaceDate) {
		this.lastRaceDate = lastRaceDate;
		return this;
	}

	public Analysis getAnalysis() {
		return analysis;
	}

	public void setAnalysis(Analysis analysis) {
		this.analysis = analysis;
	}

	public Dog2 withAnalysis(Analysis analysis) {
		this.analysis = analysis;
		return this;
	}

	public Analysis2 getAnalysis2() {
		return analysis2;
	}

	public void setAnalysis2(Analysis2 analysis2) {
		this.analysis2 = analysis2;
	}

	public Dog2 withAnalysis2(Analysis2 analysis2) {
		this.analysis2 = analysis2;
		return this;
	}

	public List<HistoryRace> getHistoryRaces() {
		return historyRaces;
	}

	public void setHistoryRaces(List<HistoryRace> historyRaces) {
		this.historyRaces = historyRaces;
	}

	public Dog2 withHistoryRaces(List<HistoryRace> historyRaces) {
		this.historyRaces = historyRaces;
		return this;
	}

}