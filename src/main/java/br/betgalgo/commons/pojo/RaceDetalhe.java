package br.betgalgo.commons.pojo;

import java.io.Serializable;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RaceDetalhe implements Serializable {

	@SerializedName("full")
	@Expose
	private Boolean full;

	@SerializedName("race_id")
	@Expose
	private Integer raceId;

	@SerializedName("wheater")
	@Expose
	private String wheater;

	@SerializedName("comments")
	@Expose
	private String comments;

	@SerializedName("third_title")
	@Expose
	private String thirdTitle;

	@SerializedName("fourth_title")
	@Expose
	private String fourthTitle;

	@SerializedName("fifth_title")
	@Expose
	private String fifthTitle;

	@SerializedName("sixth_title")
	@Expose
	private String sixthTitle;

	@SerializedName("seventh_title")
	@Expose
	private String seventhTitle;

	@SerializedName("first_title")
	@Expose
	private String firstTitle;

	@SerializedName("second_title")
	@Expose
	private String secondTitle;

	@SerializedName("dogs")
	@Expose
	@Valid
	private Dogs dogs;

	private final static long serialVersionUID = 7798141982488982864L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public RaceDetalhe() {
	}

	/**
	 * 
	 * @param dogs
	 * @param firstTitle
	 * @param wheater
	 * @param thirdTitle
	 * @param secondTitle
	 * @param fourthTitle
	 * @param sixthTitle
	 * @param raceId
	 * @param previousButton
	 * @param full
	 * @param fifthTitle
	 * @param seventhTitle
	 * @param comments
	 */
	public RaceDetalhe(Boolean full, Integer raceId, String wheater, String comments, String thirdTitle, String fourthTitle,
			String fifthTitle, String sixthTitle, String seventhTitle, String firstTitle, String secondTitle, Dogs dogs) {
		super();
		this.full = full;
		this.raceId = raceId;
		this.wheater = wheater;
		this.comments = comments;
		this.thirdTitle = thirdTitle;
		this.fourthTitle = fourthTitle;
		this.fifthTitle = fifthTitle;
		this.sixthTitle = sixthTitle;
		this.seventhTitle = seventhTitle;
		this.firstTitle = firstTitle;
		this.secondTitle = secondTitle;
		this.dogs = dogs;
	}

	public Boolean getFull() {
		return full;
	}

	public void setFull(Boolean full) {
		this.full = full;
	}

	public RaceDetalhe withFull(Boolean full) {
		this.full = full;
		return this;
	}

	public Integer getRaceId() {
		return raceId;
	}

	public void setRaceId(Integer raceId) {
		this.raceId = raceId;
	}

	public RaceDetalhe withRaceId(Integer raceId) {
		this.raceId = raceId;
		return this;
	}

	public String getWheater() {
		return wheater;
	}

	public void setWheater(String wheater) {
		this.wheater = wheater;
	}

	public RaceDetalhe withWheater(String wheater) {
		this.wheater = wheater;
		return this;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public RaceDetalhe withComments(String comments) {
		this.comments = comments;
		return this;
	}

	public String getThirdTitle() {
		return thirdTitle;
	}

	public void setThirdTitle(String thirdTitle) {
		this.thirdTitle = thirdTitle;
	}

	public RaceDetalhe withThirdTitle(String thirdTitle) {
		this.thirdTitle = thirdTitle;
		return this;
	}

	public String getFourthTitle() {
		return fourthTitle;
	}

	public void setFourthTitle(String fourthTitle) {
		this.fourthTitle = fourthTitle;
	}

	public RaceDetalhe withFourthTitle(String fourthTitle) {
		this.fourthTitle = fourthTitle;
		return this;
	}

	public String getFifthTitle() {
		return fifthTitle;
	}

	public void setFifthTitle(String fifthTitle) {
		this.fifthTitle = fifthTitle;
	}

	public RaceDetalhe withFifthTitle(String fifthTitle) {
		this.fifthTitle = fifthTitle;
		return this;
	}

	public String getSixthTitle() {
		return sixthTitle;
	}

	public void setSixthTitle(String sixthTitle) {
		this.sixthTitle = sixthTitle;
	}

	public RaceDetalhe withSixthTitle(String sixthTitle) {
		this.sixthTitle = sixthTitle;
		return this;
	}

	public String getSeventhTitle() {
		return seventhTitle;
	}

	public void setSeventhTitle(String seventhTitle) {
		this.seventhTitle = seventhTitle;
	}

	public RaceDetalhe withSeventhTitle(String seventhTitle) {
		this.seventhTitle = seventhTitle;
		return this;
	}

	public String getFirstTitle() {
		return firstTitle;
	}

	public void setFirstTitle(String firstTitle) {
		this.firstTitle = firstTitle;
	}

	public RaceDetalhe withFirstTitle(String firstTitle) {
		this.firstTitle = firstTitle;
		return this;
	}

	public String getSecondTitle() {
		return secondTitle;
	}

	public void setSecondTitle(String secondTitle) {
		this.secondTitle = secondTitle;
	}

	public RaceDetalhe withSecondTitle(String secondTitle) {
		this.secondTitle = secondTitle;
		return this;
	}

	public Dogs getDogs() {
		return dogs;
	}

	public void setDogs(Dogs dogs) {
		this.dogs = dogs;
	}

	public RaceDetalhe withDogs(Dogs dogs) {
		this.dogs = dogs;
		return this;
	}
}