package com.springmvc.qlcb.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

//@Entity
public class Quyen implements java.io.Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int MaQuyen;
	
	private String TenQuyen;
	
	@ManyToMany(mappedBy="quyens")
	private List<Taikhoan> taikhoans;
	
	public Quyen(){}

	public Quyen(int maQuyen, String tenQuyen, List<Taikhoan> taikhoans) {
		super();
		this.MaQuyen = maQuyen;
		this.TenQuyen = tenQuyen;
		this.taikhoans = taikhoans;
	}

	public int getMaQuyen() {
		return MaQuyen;
	}

	public void setMaQuyen(int maQuyen) {
		this.MaQuyen = maQuyen;
	}

	public String getTenQuyen() {
		return TenQuyen;
	}

	public void setTenQuyen(String tenQuyen) {
		this.TenQuyen = tenQuyen;
	}

	public List<Taikhoan> getTaikhoans() {
		return taikhoans;
	}

	public void setTaikhoans(List<Taikhoan> taikhoans) {
		this.taikhoans = taikhoans;
	}
	
	
}
