package com.dna.service;

import java.util.List;

import com.dna.model.Coupon;

public interface ICouponService {

	List<Coupon> getAllCoupons();

	Coupon findCouponById(int couponId);
	
	Coupon createCoupon(Coupon coupon);

	Coupon updateCoupon(Coupon coupon);
}
