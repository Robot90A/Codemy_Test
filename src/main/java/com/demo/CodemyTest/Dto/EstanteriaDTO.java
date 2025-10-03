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
    
    public EstanteriaDTO() {
    	
    	
    }
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getUrlImagen() {
		return urlImagen;
	}
	public void setUrlImagen(String urlImagen) {
		this.urlImagen = urlImagen;
	}
	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public Long getVistas() {
		return vistas;
	}
	public void setVistas(Long vistas) {
		this.vistas = vistas;
	}
	public Long getCantidadLibros() {
		return cantidadLibros;
	}
	public void setCantidadLibros(Long cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}
	@Override
	public String toString() {
		return "EstanteriaDTO [id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", urlImagen="
				+ urlImagen + ", fechaCreacion=" + fechaCreacion + ", vistas=" + vistas + ", cantidadLibros="
				+ cantidadLibros + "]";
	}
	
	
    

}
