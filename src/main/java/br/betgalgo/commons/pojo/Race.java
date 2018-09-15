package br.betgalgo.commons.pojo;

import java.io.Serializable;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Race implements Serializable {

	@SerializedName("success")
	@Expose
	private Boolean success;
	
	@SerializedName("data")
	@Expose
	@Valid
	private RaceDetalhe raceDetalhe;
	
	@SerializedName("message")
	@Expose
	private String message;
	
	private final static long serialVersionUID = 8225642085003993529L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Race() {
	}

	/**
	 * 
	 * @param message
	 * @param data
	 * @param success
	 */
	public Race(Boolean success, RaceDetalhe data, String message) {
		super();
		this.success = success;
		this.raceDetalhe = data;
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Race withSuccess(Boolean success) {
		this.success = success;
		return this;
	}

	public RaceDetalhe getRaceDetalhe() {
		return raceDetalhe;
	}

	public void setRaceDetalhe(RaceDetalhe data) {
		this.raceDetalhe = data;
	}

	public Race withRaceDetalhe(RaceDetalhe data) {
		this.raceDetalhe = data;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Race withMessage(String message) {
		this.message = message;
		return this;
	}

}