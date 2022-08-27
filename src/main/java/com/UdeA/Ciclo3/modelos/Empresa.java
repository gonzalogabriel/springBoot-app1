package com.UdeA.Ciclo3.modelos;

import javax.persistence.*;

@Entity
@Table(name="Empresa")

//base de datos tipo objeto virtual

public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column (name="nombre")
    private String nombre;

    @Column (name="direccion")
    private String direccion;

    @Column (name="telefono")
    private String telefono;

    @Column (name="NIT")
    private String NIT;

    public Empresa() {
    }

    public Empresa(String nombre, String direccion, String telefono, String NIT) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.NIT = NIT;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNIT() {
        return NIT;
    }

    public void setNIT(String NIT) {
        this.NIT = NIT;
    }

}



