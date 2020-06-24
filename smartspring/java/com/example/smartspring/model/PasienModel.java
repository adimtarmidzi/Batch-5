package com.example.smartspring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/*
 * Model digunakan untuk membuat model Database
 */

@Entity
@Table (name="T_PASIEN")
public class PasienModel {
	
	@Id
	@Column(name="K_KODE_PASIEN")
	private String kodePasien;
	
	@Column(name="K_NAMA_PASIEN")
	private String namaPasien;
	
	
	@Column(name="K_GENDER")
	private String gender;
	
	@Column(name="K_KATEGORI_PASIEN")
	private String kategoriPasien;
	
	@Column(name="K_BIAYA")
	private int biaya;
	
	@Column(name="K_TANGGAL_LAHIR")
	private Date tanggalLahir;
	


	public String getKodePasien() {
		return kodePasien;
	}

	public void setKodePasien(String kodePasien) {
		this.kodePasien = kodePasien;
	}

	public String getNamaPasien() {
		return namaPasien;
	}

	public void setNamaPasien(String namaPasien) {
		this.namaPasien = namaPasien;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getKategoriPasien() {
		return kategoriPasien;
	}

	public void setKategoriPasien(String kategoriPasien) {
		this.kategoriPasien = kategoriPasien;
	}

	public int getBiaya() {
		return biaya;
	}

	public void setBiaya(int biaya) {
		this.biaya = biaya;
	}

	public Date getTanggalLahir() {
		return tanggalLahir;
	}

	public void setTanggalLahir(Date tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	
}
	
	
	
	
	