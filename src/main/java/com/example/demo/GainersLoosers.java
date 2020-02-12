package com.example.demo;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GainersLoosers {

	@SerializedName("time")
	@Expose
	private String time;
	@SerializedName("data")
	@Expose
	private List<GainersLoosersData> data = null;

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public List<GainersLoosersData> getData() {
		return data;
	}

	public void setData(List<GainersLoosersData> data) {
		this.data = data;
	}
	
	public void addToList(List<GainersLoosersData> data) {
		this.data.addAll(data);
	}

}