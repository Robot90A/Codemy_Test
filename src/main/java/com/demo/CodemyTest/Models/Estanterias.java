package com.demo.CodemyTest.Models;

import java.time.LocalDateTime;
import java.util.List;
import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Estanterias")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Estanterias {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;
	
	@Column(name = "descripcion")
	private String descripcion;
	
	@Column(name = "url_imagen")
	private String url_imagen;
	
	@CreationTimestamp
	@Column(name = "fecha_creacion", updatable = false)
	private LocalDateTime fechaCreacion;
	
	@Column(name = "vistas")
	private Long vistas;
	
	@Column(name = "cantidad_libros")
	private Long cantidadLibros;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "estanteria")
	@JsonManagedReference
	private List<Libro> listaLibros;
	
	


    
}
