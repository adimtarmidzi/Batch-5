package com.example.smartspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class BerandaController {
	
	@RequestMapping("/beranda")
	public String beranda() {
		String html = "/beranda";
		return html;
	}

}

// 1.buat halaman/HTML bernama utamaOffice --> Tampilan di browser
     // a. buat form sederhana saja .ada 2 textfield dan button
// 2. buat halaman /HTML bernama penjualOffice dalam folder office:
	// a. buat table sederhana saja dengan kolom NO ,Barang ,Harga Jumlah penjualan
// 3. buat halaman/HTML bernama KaryawanOffice didalam folder Karyawan yang ada di dalam folder office. office/karyawan/..
	// a. buat Tabel sederhana daftar nama karyawan (NO,Nama, JAbatan);
