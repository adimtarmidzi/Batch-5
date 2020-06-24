package com.example.smartspring.service;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.result.UpdateCountOutput;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import com.example.smartspring.model.PasienModel;
import com.example.smartspring.repository.PasienRepository;

@Service
@Transactional

public class PasienService {
	
	@Autowired // digunakan untuk mengambil fungsi2   yang ada di class lain
	
	private PasienRepository pasienRepository;// membuatkan variabel baru dari class PasienRepository
	
public void create(PasienModel pasienModel) {
	this.pasienRepository.save(pasienModel);
	
}
	
	  public List<PasienModel> readData() { 
		  
		  return this.pasienRepository.findAll();
	  }
	 //update
	 public void Update(PasienModel pasienModel) {
		 this.pasienRepository.save(pasienModel);
	 }
	 
	 //delete
	 public void remove(String kodePasien) {
		this.pasienRepository.deleteById(kodePasien);
		 
	 }
	
	 // Tampilkan data berdasarkan nama dari urutan terbesar hingga terkecil (Z-A)
	 
	 public List<PasienModel> urut(){
		 return this.pasienRepository.dataUrutNama();
	 }
	 
	 public List<PasienModel> hurufA(){
		 return this.pasienRepository.dataA();
	 }
	 
	 public List<PasienModel> biaya(){
		 return this.pasienRepository.dataBiaya();
	 }
	 public List<PasienModel> biaya2(){
		 return this.pasienRepository.dataBiaya2();
	 
	 }
	 public List<PasienModel>cariDataMengandung(){
		 return this.pasienRepository.cariDataYangMEngandung();
	 }
	
}
