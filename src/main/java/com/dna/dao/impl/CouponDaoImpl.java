package com.dna.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.dna.dao.ICouponDao;
import com.dna.model.Coupon;

@Repository
@Transactional
public class CouponDaoImpl implements ICouponDao{
	
	@PersistenceContext
	private EntityManager emf;

	@Override
	public List<Coupon> getAllCoupons() {
		List<Coupon> coupon = emf.unwrap(Session.class).createCriteria(Coupon.class).list();
		return coupon;
	}

	@Override
	public Coupon findCouponById(int couponId) {
		Coupon coupon = emf.find(Coupon.class, couponId);
		return coupon;
	}

	@Override
	public Coupon createCoupon(Coupon coupon) {
		emf.persist(coupon);
		return coupon;
	}

	@Override
	public Coupon updateCoupon(Coupon coupon) {
		emf.persist(coupon);
		return coupon;
		
	}

	@Override
	public Coupon findCouponByName(String couponName) {
				
		Criteria createCriteria = emf.unwrap(Session.class).createCriteria(Coupon.class);
		createCriteria.add(Restrictions.eq("coupon_label", couponName));
		return (Coupon) createCriteria.uniqueResult();
	}

}
