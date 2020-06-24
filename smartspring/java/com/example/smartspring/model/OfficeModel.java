package com.example.smartspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="T_OFFICE")

public class OfficeModel {
	
	@Id
	@Column(name = "Nomor_Office")
	private int nomorOffice;
	
	@Column(name = "Nama_Office")
	private String namaOffice;
	
	@Column (name ="Total_Penjualan")
	private int totalPenjualan;
	
	public int getNomorOffice() {
		return nomorOffice;
	}
	public void setNomorOffice(int nomorOffice) {
		this.nomorOffice = nomorOffice;
	}
	public String getNamaOffice() {
		return namaOffice;
	}
	public void setNamaOffice(String namaOffice) {
		this.namaOffice = namaOffice;
	}
	public int getTotalPenjualan() {
		return totalPenjualan;
	}
	public void setTotalPenjualan(int totalPenjualan) {
		this.totalPenjualan = totalPenjualan;
	}
	

}
