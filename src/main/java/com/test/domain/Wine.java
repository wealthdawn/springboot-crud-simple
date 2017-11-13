package com.test.domain;

import java.math.BigDecimal;
/**
 * 定义酒的容量、品牌、价格、类型
 * @author zcf-pc
 *
 */
public class Wine {
	private Long id;                            //商品编号
	private double capacity;
	private String brand;
	private BigDecimal price;
	private String type;
	
	public Wine(){}
	

	public Wine(double capacity, String brand, BigDecimal price, String type) {
		this.capacity = capacity;
		this.brand = brand;
		this.price = price;
		this.type = type;
	}


	public double getCapacity() {
		return capacity;
	}
	public void setCapacity(double capacity) {
		this.capacity = capacity;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Wine [id=" + id + ", capacity=" + capacity + ", brand=" + brand
				+ ", price=" + price + ", type=" + type + "]";
	}
	
	
}
