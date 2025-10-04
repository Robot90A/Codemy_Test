package com.demo.CodemyTest.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.CodemyTest.Dto.LibroDTO;
import com.demo.CodemyTest.Service.CodemyService;

@RequestMapping("/libro")
@RestController
public class LibroController {

	private final CodemyService codemyService;

	public LibroController(CodemyService codemyService) {

		this.codemyService = codemyService;
	}

	@GetMapping("/listaLibros")
	public ResponseEntity<List<LibroDTO>> ListarLibrosDTO() {

		return ResponseEntity.ok(codemyService.obtenerTodosLosLibros());

	}

	@GetMapping("/buscarLibrosPorID/{id}")
	public ResponseEntity<LibroDTO> BuscarLibrosPorID(@PathVariable Long id) {

		return ResponseEntity.ok(codemyService.obtenerLibroPorID(id));

	}

}
