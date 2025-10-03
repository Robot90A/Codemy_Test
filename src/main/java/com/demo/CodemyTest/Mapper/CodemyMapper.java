package com.demo.CodemyTest.Mapper;

import org.mapstruct.Mapper;

import com.demo.CodemyTest.Dto.EstanteriaDTO;
import com.demo.CodemyTest.Dto.LibroDTO;
import com.demo.CodemyTest.Dto.PaginaDTO;
import com.demo.CodemyTest.Models.Estanterias;
import com.demo.CodemyTest.Models.Libro;
import com.demo.CodemyTest.Models.Pagina;

@Mapper(componentModel = "spring")
public interface CodemyMapper {
	
	EstanteriaDTO estanteDTO(Estanterias estanterias);
	
	LibroDTO libroDTO(Libro libro);
	
	PaginaDTO PaginaDTO(Pagina pagina);
	

	Estanterias toEntity(EstanteriaDTO estanteriaDTO); 
	

}
