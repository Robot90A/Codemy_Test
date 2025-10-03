package com.demo.CodemyTest.Dto;

import java.time.LocalDateTime;
import com.demo.CodemyTest.Models.Libro;
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
    private Libro libro;
    private String titulo;
    private String markdown;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaActualizacion;
    private Long vistas;
    
    public PaginaDTO() {
    	
    	
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Libro getLibro() {
		return libro;
	}

	public void setLibro(Libro libro) {
		this.libro = libro;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMarkdown() {
		return markdown;
	}

	public void setMarkdown(String markdown) {
		this.markdown = markdown;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public LocalDateTime getFechaActualizacion() {
		return fechaActualizacion;
	}

	public void setFechaActualizacion(LocalDateTime fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}

	public Long getVistas() {
		return vistas;
	}

	public void setVistas(Long vistas) {
		this.vistas = vistas;
	}

	@Override
	public String toString() {
		return "PaginaDTO [id=" + id + ", libro=" + libro + ", titulo=" + titulo + ", markdown=" + markdown
				+ ", fechaCreacion=" + fechaCreacion + ", fechaActualizacion=" + fechaActualizacion + ", vistas="
				+ vistas + "]";
	}
    
    

}
