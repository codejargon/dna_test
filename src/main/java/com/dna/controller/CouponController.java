package com.dna.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dna.model.BaseResponseModel;
import com.dna.model.Coupon;
import com.dna.service.ICouponService;

@RestController
@RequestMapping(value = "/api/coupon")
public class CouponController extends BaseController {

	@Autowired
	private ICouponService couponService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	ResponseEntity<BaseResponseModel> getAllCoupons() {

		List<Coupon> coupons = couponService.getAllCoupons();

		return getResponseModel(coupons, HttpStatus.OK, null);

	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	ResponseEntity<BaseResponseModel> createCoupon(@Valid @RequestBody Coupon coupon) {

		Coupon couponCreated = couponService.createCoupon(coupon);

		if (null != couponCreated)
			return getResponseModel(couponCreated, HttpStatus.OK, "Your coupon has been saved successfully.");

		return getResponseModel(null, HttpStatus.OK, "Sorry coupon already exist.");
	}

	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	ResponseEntity<BaseResponseModel> updateCoupon(@RequestBody Coupon coupon) {

		Coupon updateCoupon = couponService.updateCoupon(coupon);

		return getResponseModel(updateCoupon, HttpStatus.OK, "Your coupon has been updated successfully.");

	}

}
