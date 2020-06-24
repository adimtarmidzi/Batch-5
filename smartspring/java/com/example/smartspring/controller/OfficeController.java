package com.example.smartspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// controller terbagi menjadi 2 yaitu ada master/ modul 
// pembuatan controlller permaster




@Controller
@RequestMapping ("/office")
public class OfficeController {
	
	@RequestMapping ("/UtamaOffice")
	public String beranda() {
		String html = "/UtamaOffice";
		return html;
	}
	
	@RequestMapping ("/penjualan")
	public String penjualOffice() {
		String html = "/office/penjualOffice";
		return html;
	}
	
	@RequestMapping ("/karyawan")
	public String karyawan() {
		String html = "/office/karyawan/karyawanOffice";
		return html;
	}
}
