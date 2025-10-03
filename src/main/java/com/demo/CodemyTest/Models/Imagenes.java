package com.demo.CodemyTest.Models;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "Imagenes")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Imagenes {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Lob //se utiliza para mapear campos que almacenan datos grandes
    @Column(name = "url")
    private String url;

    @CreationTimestamp //Insertar la fecha actual del sistema
    @Column(name = "fecha_subida")
    private LocalDateTime fecha_subida;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuarios usuarios;



}
