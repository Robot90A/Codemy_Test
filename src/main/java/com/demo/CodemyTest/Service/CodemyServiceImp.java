package com.demo.CodemyTest.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.CodemyTest.Dto.EstanteriaDTO;
import com.demo.CodemyTest.Dto.LibroDTO;
import com.demo.CodemyTest.Dto.PaginaDTO;
import com.demo.CodemyTest.Mapper.CodemyMapper;
import com.demo.CodemyTest.Models.Estanterias;
import com.demo.CodemyTest.Models.Libro;
import com.demo.CodemyTest.Models.Pagina;
import com.demo.CodemyTest.Repository.LibroRepository;
import com.demo.CodemyTest.Repository.PaginaRepository;
import com.demo.CodemyTest.Repository.EstanteRepository;



@Service
public class CodemyServiceImp implements CodemyService {
	
	@Autowired
	private EstanteRepository EstanteRepository;
	
	@Autowired
	private LibroRepository libroRepository;
	
	@Autowired
	private PaginaRepository paginaRepository;
	
	@Autowired
	private CodemyMapper codemyMapper;
	
	

	@Override
	public List<EstanteriaDTO> obtenerTodaslasEstanterias() {
		
		List<Estanterias> entidad = EstanteRepository.findAll(); 
		List<EstanteriaDTO> estanteriaDTOs = new ArrayList<>(); 
		
		for(Estanterias estanterias2: entidad) {
			
			EstanteriaDTO dto = codemyMapper.estanteDTO(estanterias2);
			estanteriaDTOs.add(dto);

			
		}
		
		return estanteriaDTOs;
	}

	@Override
	public EstanteriaDTO obtenerEstanteriaPorID(Long id) {
		
		Estanterias estanteriasID = EstanteRepository.findById(id).orElse(null);
		
		if(estanteriasID != null) {
			
			return codemyMapper.estanteDTO(estanteriasID);
			
		}
		
		return null;
	}


	@Override
	public List<LibroDTO> obtenerTodosLosLibros() {
		
		List<Libro> listaLibros = libroRepository.findAll();
		List<LibroDTO> listalibrosDTO = new ArrayList<>();
		
		for(Libro miLibro: listaLibros) {
			
			LibroDTO libroDTO = codemyMapper.libroDTO(miLibro);
			listalibrosDTO.add(libroDTO);


			
		
		}
		
		return listalibrosDTO;
	}


	@Override
	public LibroDTO obtenerLibroPorID(Long id) {
		
		Libro librosID = libroRepository.findById(id).orElse(null);
		
		if(librosID != null) {
			
			return codemyMapper.libroDTO(librosID);
		}
		
		return null;
	}

	@Override
	public List<PaginaDTO> obtenerTodasLasPaginas() {
		
		List<Pagina> listapaginaEntidad = paginaRepository.findAll();
		ArrayList<PaginaDTO> listapaginaDTO = new ArrayList<>();
		
		for(Pagina Listpagina: listapaginaEntidad ) {
			
			PaginaDTO paginaDTO = codemyMapper.PaginaDTO(Listpagina);
			listapaginaDTO.add(paginaDTO);


			
		}
		
		return listapaginaDTO;
	}
	
	

	@Override
	public PaginaDTO obtenerPaginasPorID(Long id) {
		
		Pagina PaginaID = paginaRepository.findById(id).orElse(null);
		
		if(PaginaID != null) {
			
			return codemyMapper.PaginaDTO(PaginaID);
		}
		
		return null;
	}

}
