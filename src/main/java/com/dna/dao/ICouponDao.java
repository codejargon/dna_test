package com.dna.dao;

import java.util.List;

import com.dna.model.Coupon;

public interface ICouponDao{
   Coupon findCouponById(int couponId);
	
   List<Coupon> getAllCoupons();
   
   Coupon createCoupon(Coupon coupon);
   Coupon updateCoupon(Coupon coupon);

Coupon findCouponByName(String couponName);
}
