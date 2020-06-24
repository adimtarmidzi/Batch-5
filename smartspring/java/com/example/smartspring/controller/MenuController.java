package com.example.smartspring.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.smartspring.model.PasienModel;
import com.example.smartspring.service.PasienService;


@Controller
public class MenuController {
	
	
	@Autowired
	private PasienService pasienService;
	
	@RequestMapping("/menu/Menu1")

	public String menu1(HttpServletRequest request, Model model) {
		

		String mintanamaPasien = request.getParameter("namaPasien");
		model.addAttribute("namaPasienLempar", mintanamaPasien);
		
		
		String menu = "menu/Menu1";
		return menu;
	}
	
	@RequestMapping ("/pasien/create")
	public String  pasienCreate (HttpServletRequest request ,Model model)  throws ParseException{
		
		String kodePasien = request.getParameter("kodePasien");
		String namaPasien = request.getParameter("namaPasien");
		String gender = request.getParameter("gender");
		String kategoriPasien = request.getParameter("kategoriPasien");
		int biaya = Integer.parseInt(request.getParameter("biaya"));
		
		//konversi date
		String tanggalLahir =request.getParameter("tanggalLahir");
		SimpleDateFormat formateDate = new SimpleDateFormat("yyyy-MM-dd");
		Date tanggalLahirDate = formateDate.parse(tanggalLahir);
		System.out.println(tanggalLahirDate);
		
		//instance PasienModel
		
		PasienModel pasienModel = new PasienModel();
		
		// simpan ke masing2 kolom di data base
		
		pasienModel.setKodePasien(kodePasien);
		pasienModel.setNamaPasien(namaPasien);
		pasienModel.setGender(gender);
		pasienModel.setKategoriPasien(kategoriPasien);
		pasienModel.setBiaya(biaya);
		pasienModel.setTanggalLahir(tanggalLahirDate);
		
		//save
		this.pasienService.create(pasienModel);
		
		
		//List
		this.ListPasien(model);
	
		String html = "/pasien/list";
		
		return html;
		
		
	}
	//@RequestMapping ("/pasien/list")
		//void krn ga return apapun
		//model buat ambil data dari backend ke frontend
	
	
	  public void ListPasien (Model model) { 
		//kalo datanya banyak, instance pake list
		//klo 1, pake new biasa.
		  
		  
		  List<PasienModel> pasienModelList = new ArrayList<PasienModel>(); 
		//disini data udah kebaca
		  
		  
		pasienModelList = pasienService.readData();
	  model.addAttribute("pasienModelList",pasienModelList);
	  
	  }
	 
	

}
