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
public class LibroDTO {
	
	    private Integer id;
	    private String titulo;
	    private String descripcion;
	    private LocalDateTime fechaCreacion;
	    
	    
	    
	    
	   
}
