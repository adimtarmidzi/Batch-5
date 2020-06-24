package com.example.smartspring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.smartspring.service.SayurService;

@Controller
@RequestMapping(value="sayur")
public class SayurController {
	// DI - Dependency Injection
	@Autowired
	private SayurService ss;
	
	
	
	//panggil file html tsb agar muncul di browser
	@RequestMapping(value="beranda.do") // ini ada urlnya di browser
	public String methodWelcome(Model model) { // ada inputan
		String html = "sayur/welcome"; // ada di folder sayur, filenya welcome.html
		
		String buah1Backend = "Mangga Arum Manis";
		model.addAttribute("buah1Frontend", buah1Backend);
		
		//instance kelas sayurservice bisa digantikan dengan DI - Dependency Injection
		//SayurService ss = new SayurService();
		String impor1 = ss.buahImpor();
		model.addAttribute("impor1Frontend", impor1);
		
		return html;
	}
	
	@RequestMapping(value="lanjut.do")
	public String methodNext(HttpServletRequest request, Model model) {
		String html = "sayur/next";
		
		String buah2Backend = request.getParameter("buah2Frontend");
		model.addAttribute("buah2FrontendNext", buah2Backend);
		
		
		//SayurService ss = new SayurService();
		String impor1 = ss.buahImpor();
		model.addAttribute("impor1Frontend", impor1);
		
		return html;
	}
	
}
