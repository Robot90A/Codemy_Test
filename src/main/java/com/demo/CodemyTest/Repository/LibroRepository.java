package com.demo.CodemyTest.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.demo.CodemyTest.Models.Libro;

public interface LibroRepository extends JpaRepository<Libro, Long> {
	
	
	

}
