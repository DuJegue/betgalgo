package br.betgalgo.commons.pojo;

import java.io.Serializable;
import javax.validation.Valid;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Dogs implements Serializable {

	@SerializedName("1")
	@Expose
	@Valid
	private Dog1 dog1;

	@SerializedName("2")
	@Expose
	@Valid
	private Dog2 dog2;

	@SerializedName("3")
	@Expose
	@Valid
	private Dog3 dog3;

	@SerializedName("4")
	@Expose
	@Valid
	private Dog4 dog4;

	@SerializedName("5")
	@Expose
	@Valid
	private Dog5 dog5;

	@SerializedName("6")
	@Expose
	@Valid
	private Dog6 dog6;

	private final static long serialVersionUID = 8238989955464433225L;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public Dogs() {
	}

	public Dogs(Dog1 dog1, Dog2 dog2, Dog3 dog3, Dog4 dog4, Dog5 dog5, Dog6 dog6) {
		super();
		this.dog1 = dog1;
		this.dog2 = dog2;
		this.dog3 = dog3;
		this.dog4 = dog4;
		this.dog5 = dog5;
		this.dog6 = dog6;
	}

	public Dog1 getDog1() {
		return dog1;
	}

	public void setDog1(Dog1 dog1) {
		this.dog1 = dog1;
	}

	public Dog2 getDog2() {
		return dog2;
	}

	public void setDog2(Dog2 dog2) {
		this.dog2 = dog2;
	}

	public Dog3 getDog3() {
		return dog3;
	}

	public void setDog3(Dog3 dog3) {
		this.dog3 = dog3;
	}

	public Dog4 getDog4() {
		return dog4;
	}

	public void setDog4(Dog4 dog4) {
		this.dog4 = dog4;
	}

	public Dog5 getDog5() {
		return dog5;
	}

	public void setDog5(Dog5 dog5) {
		this.dog5 = dog5;
	}

	public Dog6 getDog6() {
		return dog6;
	}

	public void setDog6(Dog6 dog6) {
		this.dog6 = dog6;
	}

}