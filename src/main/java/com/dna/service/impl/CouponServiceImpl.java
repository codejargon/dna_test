package com.dna.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.dna.dao.ICouponDao;
import com.dna.model.Coupon;
import com.dna.service.ICouponService;

@Service
@Transactional
public class CouponServiceImpl implements ICouponService {

	@Autowired
	private ICouponDao couponDao;

	@Override
	@Cacheable(value="couponCache" )
	public List<Coupon> getAllCoupons() {
		System.out.println("get all coupons from database."); 
		
		return couponDao.getAllCoupons();
	}

	@Override
	public Coupon findCouponById(int couponId) {
		return couponDao.findCouponById(couponId);
	}

	public Coupon findCouponByName(String couponName) {
		return couponDao.findCouponByName(couponName);
	}

	@Override
	public Coupon createCoupon(Coupon coupon) {
		if (null != couponDao.findCouponByName(coupon.getCoupon_label()))
			return null;

		return couponDao.createCoupon(coupon);
	}

	@Override
	public Coupon updateCoupon(Coupon coupon) {
		return couponDao.updateCoupon(coupon);
	}

}
