package com.example.smartspring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="RUMAH_SAKIT")

public class RumahSakitModel {
	
	@Id
	@Column(name ="No_Kamar")
	private int noKamar ;
	
	@Column(name ="Nama_Pasien")
	private String namaPasien;
	
	@Column(name="Harga_Kamar")
	private int hargaKamar;

	public int getNoKamar() {
		return noKamar;
	}

	public void setNoKamar(int noKamar) {
		this.noKamar = noKamar;
	}

	public String getNamaPasien() {
		return namaPasien;
	}

	public void setNamaPasien(String namaPasien) {
		this.namaPasien = namaPasien;
	}

	public int getHargaKamar() {
		return hargaKamar;
	}

	public void setHargaKamar(int hargaKamar) {
		this.hargaKamar = hargaKamar;
	}
	
	
}
