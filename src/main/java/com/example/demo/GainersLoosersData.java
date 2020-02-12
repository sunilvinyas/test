package com.example.demo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GainersLoosersData {

	@SerializedName("symbol")
	@Expose
	private String symbol;
	@SerializedName("series")
	@Expose
	private String series;
	@SerializedName("openPrice")
	@Expose
	private String openPrice;
	@SerializedName("highPrice")
	@Expose
	private String highPrice;
	@SerializedName("lowPrice")
	@Expose
	private String lowPrice;
	@SerializedName("ltp")
	@Expose
	private String ltp;
	@SerializedName("previousPrice")
	@Expose
	private String previousPrice;
	@SerializedName("netPrice")
	@Expose
	private String netPrice;
	@SerializedName("tradedQuantity")
	@Expose
	private String tradedQuantity;
	@SerializedName("turnoverInLakhs")
	@Expose
	private String turnoverInLakhs;
	@SerializedName("lastCorpAnnouncementDate")
	@Expose
	private String lastCorpAnnouncementDate;
	@SerializedName("lastCorpAnnouncement")
	@Expose
	private String lastCorpAnnouncement;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getSeries() {
		return series;
	}

	public void setSeries(String series) {
		this.series = series;
	}

	public String getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(String openPrice) {
		this.openPrice = openPrice;
	}

	public String getHighPrice() {
		return highPrice;
	}

	public void setHighPrice(String highPrice) {
		this.highPrice = highPrice;
	}

	public String getLowPrice() {
		return lowPrice;
	}

	public void setLowPrice(String lowPrice) {
		this.lowPrice = lowPrice;
	}

	public String getLtp() {
		return ltp;
	}

	public void setLtp(String ltp) {
		this.ltp = ltp;
	}

	public String getPreviousPrice() {
		return previousPrice;
	}

	public void setPreviousPrice(String previousPrice) {
		this.previousPrice = previousPrice;
	}

	public String getNetPrice() {
		return netPrice;
	}

	public void setNetPrice(String netPrice) {
		this.netPrice = netPrice;
	}

	public String getTradedQuantity() {
		return tradedQuantity;
	}

	public void setTradedQuantity(String tradedQuantity) {
		this.tradedQuantity = tradedQuantity;
	}

	public String getTurnoverInLakhs() {
		return turnoverInLakhs;
	}

	public void setTurnoverInLakhs(String turnoverInLakhs) {
		this.turnoverInLakhs = turnoverInLakhs;
	}

	public String getLastCorpAnnouncementDate() {
		return lastCorpAnnouncementDate;
	}

	public void setLastCorpAnnouncementDate(String lastCorpAnnouncementDate) {
		this.lastCorpAnnouncementDate = lastCorpAnnouncementDate;
	}

	public String getLastCorpAnnouncement() {
		return lastCorpAnnouncement;
	}

	public void setLastCorpAnnouncement(String lastCorpAnnouncement) {
		this.lastCorpAnnouncement = lastCorpAnnouncement;
	}

}