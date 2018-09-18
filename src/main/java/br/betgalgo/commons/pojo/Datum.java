package br.betgalgo.commons.pojo;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import br.betgalgo.commons.util.DateFormatter;

public class Datum implements Serializable, Comparable<Datum> {

	private static final long serialVersionUID = -4390073911730610456L;

	@SerializedName("id")
	@Expose
	private Integer id;
	
	@SerializedName("stadium_id")
	@Expose
	private Integer stadiumId;
	
	@SerializedName("lay_list")
	@Expose
	private Integer layList;
	
	@SerializedName("grade")
	@Expose
	private String grade;
	
	@SerializedName("date")
	@Expose
	private String date;
	
	@SerializedName("distance")
	@Expose
	private Integer distance;
	
	@SerializedName("created_at")
	@Expose
	private String createdAt;
	
	@SerializedName("updated_at")
	@Expose
	private String updatedAt;
	
	@SerializedName("deleted_at")
	@Expose
	private Object deletedAt;
	
	public Datum() {
	}

	/**
	 * 
	 * @param updatedAt
	 * @param id
	 * @param stadiumId
	 * @param distance
	 * @param free
	 * @param createdAt
	 * @param layList
	 * @param deletedAt
	 * @param grade
	 * @param date
	 */
	public Datum(Integer id, Integer stadiumId, Integer layList, String grade, String date,
			Integer distance, String createdAt, String updatedAt, Object deletedAt) {
		super();
		this.id = id;
		this.stadiumId = stadiumId;
		this.layList = layList;
		this.grade = grade;
		this.date = date;
		this.distance = distance;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.deletedAt = deletedAt;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Datum withId(Integer id) {
		this.id = id;
		return this;
	}

	public Integer getStadiumId() {
		return stadiumId;
	}

	public void setStadiumId(Integer stadiumId) {
		this.stadiumId = stadiumId;
	}

	public Datum withStadiumId(Integer stadiumId) {
		this.stadiumId = stadiumId;
		return this;
	}
	public Integer getLayList() {
		return layList;
	}

	public void setLayList(Integer layList) {
		this.layList = layList;
	}

	public Datum withLayList(Integer layList) {
		this.layList = layList;
		return this;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Datum withGrade(String grade) {
		this.grade = grade;
		return this;
	}

	public String getDate() {
		return date;
	}
	
	public Date getDateOrder() {
		
		Date retorno = null;
		
		try {
			retorno = new DateFormatter().parse(getDate(), Locale.getDefault());
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return retorno; 
	}
	
	public String getDateHoraBR() {
		
		DateFormatter format = new DateFormatter();
		Calendar cal = Calendar.getInstance();
		
		try {
			Date dateUK = format.parse(getDate(), Locale.getDefault());
			cal.setTime(dateUK);
			cal.add(Calendar.HOUR, -4);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		return format.printHora(cal.getTime());
	}
	
	public String getDateHoraUK() {
		return getDate().substring(10).substring(0,6);
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Datum withDate(String date) {
		this.date = date;
		return this;
	}

	public Integer getDistance() {
		return distance;
	}

	public void setDistance(Integer distance) {
		this.distance = distance;
	}

	public Datum withDistance(Integer distance) {
		this.distance = distance;
		return this;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(String createdAt) {
		this.createdAt = createdAt;
	}

	public Datum withCreatedAt(String createdAt) {
		this.createdAt = createdAt;
		return this;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
	}

	public Datum withUpdatedAt(String updatedAt) {
		this.updatedAt = updatedAt;
		return this;
	}

	public Object getDeletedAt() {
		return deletedAt;
	}

	public void setDeletedAt(Object deletedAt) {
		this.deletedAt = deletedAt;
	}

	public Datum withDeletedAt(Object deletedAt) {
		this.deletedAt = deletedAt;
		return this;
	}

	@Override
	public String toString() {
		return "Datum [id=" + id + ", stadiumId=" + stadiumId + ", layList=" + layList + ", grade="
				+ grade + ", date=" + date + ", distance=" + distance + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", deletedAt=" + deletedAt + "]";
	}

	@Override
	public int compareTo(Datum o) {
		return this.getDateOrder().compareTo(o.getDateOrder());
	}

}