package com.example.smartspring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.OrderBy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.smartspring.model.PasienModel;
import com.example.smartspring.service.PasienService;

@RestController
@RequestMapping("/api/pasien")
public class PasienAPI {
	
	@Autowired
	private PasienService pasienService;
	
	@PostMapping("/post")
	@ResponseStatus(code = HttpStatus.CREATED)
	
	public Map<String, Object> postMaping(@RequestBody PasienModel pasienModel){
		Map<String, Object> map = new HashMap<String,Object>();
		
		map.put("succes", Boolean.TRUE);
		map.put("pasien", "datanya sudah masuk");
		return map;
	}
	// GET || READ
	@GetMapping("/get")
	@ResponseStatus(code = HttpStatus.OK)
	public List<PasienModel>getMapping(){
		
		List<PasienModel>pasienModelList= new ArrayList<PasienModel>();
		pasienModelList = this.pasienService.readData();
		return pasienModelList;
	}
	
	// PUT || UPDATE
	@PutMapping("/put")
	@ResponseStatus(code =HttpStatus.OK)
	public Map<String, Object> putMapping(@RequestBody PasienModel pasienModel){
		this.pasienService.Update(pasienModel);
		Map<String, Object> map = new HashMap<String,Object>();
		map.put("succes", Boolean.TRUE);
		map.put("pasien", "data berhasil di update");
		
		
		return map;
	}
	
	//DELETE
	@DeleteMapping("/delete/{kodePasien}")
	
	public Map<String, Object> remove(@PathVariable String kodePasien){
		
		this.pasienService.remove(kodePasien);
		Map<String, Object> map = new HashMap<String,Object>();
		
		map.put("succes", Boolean.TRUE);
		map.put("delete", "data terhapus");
		
		return map;
	}
	
	//urut angka
	@GetMapping("/urut")
	@ResponseStatus(code = HttpStatus.OK)
	public List<PasienModel>urutMapping(){
		
		List<PasienModel>pasienModelList= new ArrayList<PasienModel>();
		pasienModelList = this.pasienService.urut();
		return pasienModelList;
	}
	
	@GetMapping("/getNamaMengandung")
	@ResponseStatus(code = HttpStatus.OK)
	public List<PasienModel>getNamaMengandung(){
		
		List<PasienModel>pasienModelList= new ArrayList<PasienModel>();
		pasienModelList = this.pasienService.cariDataMengandung();
		return pasienModelList;
	}
	//HurufA
	@GetMapping("/huruf")
	@ResponseStatus(code = HttpStatus.OK)
	public List<PasienModel>hurufMapping(){
		
		List<PasienModel>pasienModelList= new ArrayList<PasienModel>();
		pasienModelList = this.pasienService.hurufA();
		return pasienModelList;
	}
	
	//biaya
	@GetMapping("/b")
	@ResponseStatus(code = HttpStatus.OK)
	public List<PasienModel>biayaMapping(){
		
		List<PasienModel>pasienModelList= new ArrayList<PasienModel>();
		pasienModelList = this.pasienService.biaya();
		return pasienModelList;
	}
	
	// biaya2
	
		@GetMapping("/ba")
		@ResponseStatus(code = HttpStatus.OK)
		public List<PasienModel>biayaMapping2(){
			
			List<PasienModel>pasienModelList= new ArrayList<PasienModel>();
			pasienModelList = this.pasienService.biaya2();
			return pasienModelList;
		}
		
	
	

}
