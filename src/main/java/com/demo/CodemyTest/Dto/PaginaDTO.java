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
public class PaginaDTO {
	
    private Long id;
    private String titulo;
    private String markdown;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private Long vistas;
    
    
    

}
