package com.demo.CodemyTest.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.CodemyTest.Dto.EstanteriaDTO;
import com.demo.CodemyTest.Service.CodemyService;

@RequestMapping("/estanteria")
@RestController
public class EstanteriaController {

	private final CodemyService codemyService;

	public EstanteriaController(CodemyService codemyService) {

		this.codemyService = codemyService;
	}

	@GetMapping("/listaEstantes")
	public ResponseEntity<List<EstanteriaDTO>> ListaEstanteriasDTO() {

		return ResponseEntity.ok(codemyService.obtenerTodaslasEstanterias());
	}

	@GetMapping("/buscarEstantePorID/{id}")
	public ResponseEntity<EstanteriaDTO> BuscarEstanteriaPorID(@PathVariable Long id) {

		return ResponseEntity.ok(codemyService.obtenerEstanteriaPorID(id));
	}

}
