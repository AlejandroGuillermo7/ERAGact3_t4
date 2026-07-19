package com.enriquez.act3t4.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;


@Entity
@Table(name="camionetas")
public class Camioneta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String modelo;
    private int anio;
    private double precio;
    private String categoria;


    @ManyToOne
    @JoinColumn(name="marca_id")
    @JsonIgnoreProperties({"camionetas"})

    private Marca marca;

    public Camioneta(){
    }
    public Camioneta(Long id, String modelo, int anio, double precio, String categoria, Marca marca){
        this.id= id;
        this.modelo= modelo;
        this.anio= anio;
        this.precio= precio;
        this.categoria= categoria;
        this.marca= marca;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnio() {
        return anio;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public Marca getMarca() {
        return marca;
    }
    public void setMarca(Marca marca) {
        this.marca = marca;
    }
}
