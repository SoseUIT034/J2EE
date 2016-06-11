package com.springmvc.qlcb.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.springmvc.qlcb.model.Taikhoan;

@Repository
public class TaiKhoanDAOImpl extends HibernateUtils implements TaiKhoanDAO {

	@Override
	public void saveUser(Taikhoan tk) {
		 getSession().save(tk);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Taikhoan> listUser() {
		return getSession().createCriteria(Taikhoan.class).list();
	}

	@Override
	public Taikhoan getTaiKhoan(Taikhoan tk) {
		String hsql = "from Taikhoan as tk where tk.tenDangNhap=? and tk.matKhau=?";
		Query query = getSession().createQuery(hsql);
		query.setParameter(0, tk.getTenDangNhap());
		query.setParameter(1, tk.getMatKhau());
		
		return (Taikhoan) query.uniqueResult();
	}

	@Override
	public void deleteUser(Taikhoan tk) {
		getSession().delete(getTaiKhoan(tk));
	}

	@Override
	public void addTaiKhoan(Taikhoan taikhoan) {
		getSession().save(taikhoan);
	}

	@Override
	public void updateTaiKhoan(Taikhoan taikhoan) {
		getSession().update(taikhoan);
	}

	@Override
	public Taikhoan getTaiKhoanByName(String tenDangNhap) {
		return (Taikhoan) getSession().createCriteria(Taikhoan.class).add(Restrictions.eq("TenDangNhap", tenDangNhap));
	}
}
