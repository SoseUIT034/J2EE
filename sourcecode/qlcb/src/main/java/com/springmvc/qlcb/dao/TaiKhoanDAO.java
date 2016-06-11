package com.springmvc.qlcb.dao;

import java.util.List;

import com.springmvc.qlcb.model.Taikhoan;


public interface TaiKhoanDAO {
	public void saveUser(Taikhoan user);

	public List<Taikhoan> listUser();

	public Taikhoan getTaiKhoan(Taikhoan taikhoan);

	public void deleteUser(Taikhoan user);
	
	public void addTaiKhoan(Taikhoan taikhoan);
	
	public void updateTaiKhoan(Taikhoan taikhoan);
	
	public Taikhoan getTaiKhoanByName(String tenDangNhap);
}
