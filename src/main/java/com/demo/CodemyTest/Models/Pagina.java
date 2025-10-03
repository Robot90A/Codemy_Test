package com.demo.CodemyTest.Models;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "Paginas")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Pagina {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "libro_id")
    private Libro libro;

    @Column(name = "titulo", nullable = false, length = 150)
    private String titulo;

    @Column(name = "markdown", columnDefinition = "TEXT")
    private String markdown;
    
    @CreationTimestamp
    @Column(name = "fecha_creacion")
    private LocalDateTime fechaCreacion;
    
    @UpdateTimestamp
    @Column(name = "fecha_actualizacion")
    private LocalDateTime fechaActualizacion;

    @Column(name = "vistas")
    private Long vistas;
}
