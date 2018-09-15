package br.betgalgo.commons.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dashboard implements Serializable {

	@SerializedName("success")
	@Expose
	private Boolean success;
	
	@SerializedName("data")
	@Expose
	@Valid
	private List<Datum> data = new ArrayList<Datum>();
	
	@SerializedName("message")
	@Expose
	private String message;
	
	private final static long serialVersionUID = -3769793018855209944L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Dashboard() {
	}

	/**
	 * 
	 * @param message
	 * @param data
	 * @param success
	 */
	public Dashboard(Boolean success, List<Datum> data, String message) {
		super();
		this.success = success;
		this.data = data;
		this.message = message;
	}

	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}

	public Dashboard withSuccess(Boolean success) {
		this.success = success;
		return this;
	}

	public List<Datum> getData() {
		return data;
	}

	public void setData(List<Datum> data) {
		this.data = data;
	}

	public Dashboard withData(List<Datum> data) {
		this.data = data;
		return this;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Dashboard withMessage(String message) {
		this.message = message;
		return this;
	}

	@Override
	public String toString() {
		return "Race [success=" + success + ", data=" + data + ", message=" + message + "]";
	}

}
