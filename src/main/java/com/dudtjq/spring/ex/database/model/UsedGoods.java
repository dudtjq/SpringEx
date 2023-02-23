package com.dudtjq.spring.ex.database.model;

import java.util.Date;

// Entity : 테이블 컬럼 이름과 정확히 일치하는 멤버 변수를 가진 클래스
public class UsedGoods {

	private int id;
	private int sellerId;
	private String title;
	private int price;
	private String descripton;
	private String picture;
	private Date createdAt;
	private Date updatedAt;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getSellerId() {
		return sellerId;
	}
	
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String getDescripton() {
		return descripton;
	}
	
	public void setDescripton(String descripton) {
		this.descripton = descripton;
	}
	
	public String getPicture() {
		return picture;
	}
	
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	public Date getCreatedAt() {
		return createdAt;
	}
	
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
}
