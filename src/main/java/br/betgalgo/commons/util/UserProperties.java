package br.betgalgo.commons.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:user.properties")
public class UserProperties {

	@Value("${site.user}")
	private String user;

	@Value("${site.pass}")
	private String pass;
	
	@Value("${site.login}")
	private String siteLogin;
	
	@Value("${site.race}")
	private String siteRace;
	
	@Value("${directory.final}")
	private String finalDirectory;
	
	@Value("${directory.json}")
	private String jsonDirectory;
	
	@Value("${result.preview}")
	private int preview;
	
	@Value("${result.preview2}")
	private int preview2;
	
	@Value("${limit.overall}")
	private int limitOverall;
	
	@Value("${limit.chanceOfWin}")
	private int limitChanceOfWin;
	
	@Value("${limit.hour}")
	private int limitHour;
	
	@Value("${limit.minute}")
	private int limitMinute;
	
	@Value("${limit.distance}")
	private int limitDistance;
	
	private String command;

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getSiteLogin() {
		return siteLogin;
	}

	public void setSiteLogin(String siteLogin) {
		this.siteLogin = siteLogin;
	}

	public String getSiteRace() {
		return siteRace;
	}

	public void setSiteRace(String siteRace) {
		this.siteRace = siteRace;
	}

	public int getPreview() {
		return preview;
	}

	public void setPreview(int preview) {
		this.preview = preview;
	}

	public int getPreview2() {
		return preview2;
	}

	public void setPreview2(int preview2) {
		this.preview2 = preview2;
	}

	public int getLimitOverall() {
		return limitOverall;
	}

	public void setLimitOverall(int limitOverall) {
		this.limitOverall = limitOverall;
	}

	public int getLimitChanceOfWin() {
		return limitChanceOfWin;
	}

	public void setLimitChanceOfWin(int limitChanceOfWin) {
		this.limitChanceOfWin = limitChanceOfWin;
	}

	public int getLimitHour() {
		return limitHour;
	}

	public void setLimitHour(int limitHour) {
		this.limitHour = limitHour;
	}

	public int getLimitMinute() {
		return limitMinute;
	}

	public void setLimitMinute(int limitMinute) {
		this.limitMinute = limitMinute;
	}

	public int getLimitDistance() {
		return limitDistance;
	}

	public void setLimitDistance(int limitDistance) {
		this.limitDistance = limitDistance;
	}

	public String getFinalDirectory() {
		return finalDirectory;
	}

	public void setFinalDirectory(String finalDirectory) {
		this.finalDirectory = finalDirectory;
	}

	public String getJsonDirectory() {
		return jsonDirectory;
	}

	public void setJsonDirectory(String jsonDirectory) {
		this.jsonDirectory = jsonDirectory;
	}

}
