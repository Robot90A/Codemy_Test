package com.demo.CodemyTest.Models;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@Table(name = "Usuarios")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuarios  {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "correo")
    private String correo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rol_id")
    private Roles roles;

    
    @Column(name = "fecha_creacion", nullable = false, updatable = false)
    private LocalDate fecha_creacion;

    @Column(name = "fecha_actualizacion")
    private LocalDate fecha_actualizacion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "usuario")
    private List<Vistas> listaVista;
    
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private List<Auditoria> ListaAuditoria;

    
}
