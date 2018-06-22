package com.dna.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Future;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.dna.model.validators.IUniqueCoupon;



@Entity
@Table(name ="coupon")
public class Coupon implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long coupon_id;
	
	
	@Size(min=2, max=240)
	@NotNull
	@IUniqueCoupon
	private String coupon_label;
	
	@Future
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date start_date;
	
	@Future
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date end_date;
	
	@Min(1)
	@Max(3)
	private int max_usage;
	
	
	private float discount;
	
	public long getCoupon_id() {
		return coupon_id;
	}
	public void setCoupon_id(long coupon_id) {
		this.coupon_id = coupon_id;
	}
	public String getCoupon_label() {
		return coupon_label;
	}
	public void setCoupon_label(String coupon_label) {
		this.coupon_label = coupon_label;
	}
	public Date getStart_date() {
		return start_date;
	}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;
	}
	public Date getEnd_date() {
		return end_date;
	}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;
	}
	public int getMax_usage() {
		return max_usage;
	}
	public void setMax_usage(int max_usage) {
		this.max_usage = max_usage;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	
	
	
}