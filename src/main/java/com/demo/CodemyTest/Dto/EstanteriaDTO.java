package com.demo.CodemyTest.Dto;

import java.time.LocalDateTime;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EstanteriaDTO {

    private Long id;
    private String nombre;
    private String descripcion;
    private String urlImagen;
    private LocalDateTime fechaCreacion;
    private Long vistas;
    private Long cantidadLibros;
    
    
	
	
    

}
