package com.springmvc.qlcb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springmvc.qlcb.dao.TaiKhoanDAO;
import com.springmvc.qlcb.model.Taikhoan;

@Service
public class TaiKhoanServiceImpl implements TaiKhoanService {
	@Autowired
	private TaiKhoanDAO userDAO;

	public void saveUser(Taikhoan user) {
		
	}

	public List<Taikhoan> listUser() {
		return null;
	}

	@Transactional
	public Taikhoan getUser(Taikhoan taikhoan) {
		return userDAO.getTaiKhoan(taikhoan);
	}
	public void deleteUser(Taikhoan user) {
		
	}
	
	
}
