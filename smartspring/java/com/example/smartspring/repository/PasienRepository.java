package com.example.smartspring.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.smartspring.model.PasienModel;

//JpaRepository<nama tabel DB = wajib di import, type variable primarykey tabel tersebut>
public interface PasienRepository extends JpaRepository<PasienModel, String> {

	/* @Query("select p from pasienModel p") List<PasienModel>bacaData();
	 * 
	 * @Query("select p from pasienModel p where p.namaPasien like %?1%")
	 * List<PasienModel>cariNama(String namaPasien);
	 */
	@Query ("select p from PasienModel p order by p.namaPasien DESC ") 
	List<PasienModel>dataUrutNama();
	//adim
	@Query("select p from PasienModel p where p.namaPasien like '%O%'")
	List<PasienModel>cariDataYangMEngandung();
	
	//ica
	@Query ("select p from PasienModel p where p.namaPasien like 'A%' " )
	List<PasienModel>dataA();
	//irianto
	@Query("select p from PasienModel p where p.biaya >2000")
	List<PasienModel>dataBiaya();
	//jonathan
	@Query("select p from PasienModel p where p.biaya <1000 OR p.biaya>500" )
	List<PasienModel>dataBiaya2();
	
}

	
