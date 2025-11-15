package org.example.examen2java.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Pedido {

    private int id;
    private String nombre;
    private String telefono;
    private Pizza pizza;

}
