package org.example.examen2java.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pizza {
    private String nombre;
    private String  tamaño;
    private String precio;
}
