package br.betgalgo.commons.pojo;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.betgalgo.commons.util.IntegerCustom;

public abstract class DogAb {
	
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
	private IntegerCustom lastRaceDate;

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
	
	public DogAb() {
	}
	
	public DogAb(Integer dogId, String classPreview, String classPreview3, String classPreviewPanel, Double chanceOfWin,
			Double bestRecordTime, Integer topSpeed, Integer trapNumber, Integer raceId, String raceDate, String name,
			String color, String sex, String birth, Double weight, String trainerName, IntegerCustom lastRaceDate,
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

	public String getClassPreview() {
		return classPreview;
	}

	public void setClassPreview(String classPreview) {
		this.classPreview = classPreview;
	}

	public String getClassPreview3() {
		return classPreview3;
	}

	public void setClassPreview3(String classPreview3) {
		this.classPreview3 = classPreview3;
	}

	public String getClassPreviewPanel() {
		return classPreviewPanel;
	}

	public void setClassPreviewPanel(String classPreviewPanel) {
		this.classPreviewPanel = classPreviewPanel;
	}

	public Double getChanceOfWin() {
		return chanceOfWin;
	}

	public void setChanceOfWin(Double chanceOfWin) {
		this.chanceOfWin = chanceOfWin;
	}

	public Double getBestRecordTime() {
		return bestRecordTime;
	}

	public void setBestRecordTime(Double bestRecordTime) {
		this.bestRecordTime = bestRecordTime;
	}

	public Integer getTopSpeed() {
		return topSpeed;
	}

	public void setTopSpeed(Integer topSpeed) {
		this.topSpeed = topSpeed;
	}

	public Integer getTrapNumber() {
		return trapNumber;
	}

	public void setTrapNumber(Integer trapNumber) {
		this.trapNumber = trapNumber;
	}

	public Integer getRaceId() {
		return raceId;
	}

	public void setRaceId(Integer raceId) {
		this.raceId = raceId;
	}

	public String getRaceDate() {
		return raceDate;
	}

	public void setRaceDate(String raceDate) {
		this.raceDate = raceDate;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public IntegerCustom getLastRaceDate() {
		return lastRaceDate;
	}

	public void setLastRaceDate(IntegerCustom lastRaceDate) {
		this.lastRaceDate = lastRaceDate;
	}

	public Analysis getAnalysis() {
		return analysis;
	}

	public void setAnalysis(Analysis analysis) {
		this.analysis = analysis;
	}

	public Analysis2 getAnalysis2() {
		return analysis2;
	}

	public void setAnalysis2(Analysis2 analysis2) {
		this.analysis2 = analysis2;
	}

	public List<HistoryRace> getHistoryRaces() {
		return historyRaces;
	}

	public void setHistoryRaces(List<HistoryRace> historyRaces) {
		this.historyRaces = historyRaces;
	}

}
