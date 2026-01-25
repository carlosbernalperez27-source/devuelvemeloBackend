package com.devuelvemelo.devuelvemelo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Column;

@Entity //Tabla en la base de datos
@Table(name = "usuarios")
@Data // Crea los Getters, Setters, equals, canEqual, hashCode y toString automáticamente
@NoArgsConstructor // Crea el constructor vacío 
@AllArgsConstructor // Crea un constructor con todos los atributos
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Id llave primaria autogenerada
    @Column(unique = true) // Evita que se registren dos usuarios con el mismo email
    private Long id;
    private String rut;
    private String nombre;
    private String apellido;
    private String codPais;
    private Integer telefonoCelular;
    private String email;
    private String password;
}