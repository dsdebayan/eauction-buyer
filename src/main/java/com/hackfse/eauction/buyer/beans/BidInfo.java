package com.hackfse.eauction.buyer.beans;

import java.util.Date;
import java.util.List;

public class BidInfo {

	private String buyerName;
	
	private String email;
	
	private Integer phone;
	
	private Double bidAmount;

	public BidInfo(String buyerName, String email, Integer phone, Double bidAmount) {
		super();
		this.buyerName = buyerName;
		this.email = email;
		this.phone = phone;
		this.bidAmount = bidAmount;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public Double getBidAmount() {
		return bidAmount;
	}

	public void setBidAmount(Double bidAmount) {
		this.bidAmount = bidAmount;
	}

	@Override
	public String toString() {
		return "BidInfo [buyerName=" + buyerName + ", email=" + email + ", phone=" + phone + ", bidAmount=" + bidAmount
				+ "]";
	}
	
	
	
}
