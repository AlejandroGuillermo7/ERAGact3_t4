package com.enriquez.act3t4.entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="marcas")
public class Marca {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nombre;
    private String pais;

    @OneToMany(mappedBy="marca", cascade = CascadeType.ALL)

    private List<Camioneta> camionetas;

    public Marca(){
    }

    public Marca(String nombre, String pais){
        this.nombre = nombre;
        this.pais = pais;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public List<Camioneta> getCamionetas() {
        return camionetas;
    }

    public void setCamionetas(List<Camioneta> camionetas) {
        this.camionetas = camionetas;
    }


    

}
