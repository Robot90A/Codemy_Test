package com.demo.CodemyTest.Service;

import java.util.List;

import com.demo.CodemyTest.Dto.EstanteriaDTO;
import com.demo.CodemyTest.Dto.LibroDTO;
import com.demo.CodemyTest.Dto.PaginaDTO;


public interface CodemyService {
	
	List<EstanteriaDTO> obtenerTodaslasEstanterias();
	
	EstanteriaDTO obtenerEstanteriaPorID(Long id);
	
	List<LibroDTO> obtenerTodosLosLibros();
	
	LibroDTO obtenerLibroPorID(Long id);
	
	List<PaginaDTO> obtenerTodasLasPaginas();
	
	PaginaDTO obtenerPaginasPorID(Long id);

}
