package com.demo.CodemyTest.Dto;

import java.time.LocalDateTime;
import com.demo.CodemyTest.Models.Estanterias;


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
	    private Estanterias estanteria;
	    private String titulo;
	    private String descripcion;
	    private LocalDateTime fechaCreacion;
	    
	    public LibroDTO() {
	    	
	    	
	    }
	    
	    
		public Integer getId() {
			return id;
		}
		public void setId(Integer id) {
			this.id = id;
		}
		public Estanterias getEstanteria() {
			return estanteria;
		}
		public void setEstanteria(Estanterias estanteria) {
			this.estanteria = estanteria;
		}
		public String getTitulo() {
			return titulo;
		}
		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}
		public String getDescripcion() {
			return descripcion;
		}
		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}
		public LocalDateTime getFechaCreacion() {
			return fechaCreacion;
		}
		public void setFechaCreacion(LocalDateTime fechaCreacion) {
			this.fechaCreacion = fechaCreacion;
		}
		@Override
		public String toString() {
			return "LibroDTO [id=" + id + ", estanteria=" + estanteria + ", titulo=" + titulo + ", descripcion="
					+ descripcion + ", fechaCreacion=" + fechaCreacion + "]";
		}
	    
	    
	    
	   
}
