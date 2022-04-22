package com.hackfse.eauction.buyer.entities;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

//@ApiModel(description="All details about the product.")
public class Product {

	private Integer id;

	private String name;
	
	private String shortDesc;
	
	private String detailedDesc;
	
	private String category;
	
	private Double startPrice;
	
	private Date bidEndDate;
	
	private Seller seller;

	

	public Product(Integer id, String name, String shortDesc, String detailedDesc, String category, Double startPrice,
			Date bidEndDate, Seller seller) {
		super();
		this.id = id;
		this.name = name;
		this.shortDesc = shortDesc;
		this.detailedDesc = detailedDesc;
		this.category = category;
		this.startPrice = startPrice;
		this.bidEndDate = bidEndDate;
		this.seller = seller;
	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getShortDesc() {
		return shortDesc;
	}

	public void setShortDesc(String shortDesc) {
		this.shortDesc = shortDesc;
	}

	public String getDetailedDesc() {
		return detailedDesc;
	}

	public void setDetailedDesc(String detailedDesc) {
		this.detailedDesc = detailedDesc;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public Double getStartPrice() {
		return startPrice;
	}

	public void setStartPrice(Double startPrice) {
		this.startPrice = startPrice;
	}

	public Date getBidEndDate() {
		return bidEndDate;
	}

	public void setBidEndDate(Date bidEndDate) {
		this.bidEndDate = bidEndDate;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", shortDesc=" + shortDesc + ", detailedDesc=" + detailedDesc
				+ ", category=" + category + ", startPrice=" + startPrice + ", bidEndDate=" + bidEndDate + "]";
	}

		


}
