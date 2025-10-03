package com.demo.CodemyTest.Models;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Vistas")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vistas {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	
	@Column(name = "entidad", length = 50)
	private String entidad; 
	
	@Column(name = "entidad_id")
	private long entidadID;
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "usuario_id")
	private Usuarios usuario;
	
	@CreationTimestamp
	@Column(name = "fecha_registro", updatable = false)
	private LocalDateTime fechaRegistro;
	

	
	
	
	

}
