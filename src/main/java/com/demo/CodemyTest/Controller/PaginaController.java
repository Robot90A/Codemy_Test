package com.demo.CodemyTest.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.CodemyTest.Dto.PaginaDTO;
import com.demo.CodemyTest.Service.CodemyService;

@RequestMapping("/pagina")
@RestController
public class PaginaController {
	
	private final CodemyService codemyService;
	
	public PaginaController(CodemyService codemyService) {
		
		this.codemyService = codemyService;
	}
	
	
	@GetMapping("/listaPaginas")
	public ResponseEntity<List<PaginaDTO>> listaPaginaDTO(){
		
		return ResponseEntity.ok(codemyService.obtenerTodasLasPaginas());
		
	}
	
	
	@GetMapping("/buscarPaginaPorID/{id}")
	public ResponseEntity<PaginaDTO> BuscarPaginaPorID(@PathVariable Long id){
		
		return ResponseEntity.ok(codemyService.obtenerPaginasPorID(id));
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
