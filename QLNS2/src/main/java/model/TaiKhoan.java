package model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class TaiKhoan {
	
	@Id
	private String tentaikhoan;
	private String matkhau;
	
	public String getTentaikhoan() {
		return tentaikhoan;
	}
	public void setTentaikhoan(String tentaikhoan) {
		this.tentaikhoan = tentaikhoan;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	
	public TaiKhoan() {
		super();
	}
	public TaiKhoan(String tentaikhoan, String matkhau) {
		super();
		this.tentaikhoan = tentaikhoan;
		this.matkhau = matkhau;
	}
	@Override
	public String toString() {
		return tentaikhoan;
	}
}
