package com.aday.aday.model;

import java.util.ArrayList;
import java.util.List;

public class RankingDayTotalModel {
	private String name;
	private String type;
	private long time;
	private String number;
	private String background;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getBackground() {
		return background;
	}
	public void setBackground(String background) {
		this.background = background;
	}
	
	public static List<RankingDayTotalModel> getData_Week(){
		List<RankingDayTotalModel> data = new ArrayList<RankingDayTotalModel>();
		RankingDayTotalModel model ;
		
		model = new RankingDayTotalModel();
		
		
		return data;
	}
}
