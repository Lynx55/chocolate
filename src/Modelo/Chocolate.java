/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author simon
 */
public class Chocolate {

    private Integer codigo, precio, cantidad, azucar;
    private String nombre, descripciom,tipo,marca,sabor;

    public Chocolate() {
    }

    public Chocolate(Integer codigo, Integer precio, Integer cantidad, Integer azucar, String nombre, String descripciom, String tipo, String marca,String sabor) {
        this.codigo = codigo;
        this.precio = precio;
        this.cantidad = cantidad;
        this.azucar = azucar;
        this.nombre = nombre;
        this.descripciom = descripciom;
        this.tipo = tipo;
        this.marca = marca;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getAzucar() {
        return azucar;
    }

    public void setAzucar(Integer azucar) {
        this.azucar = azucar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripciom() {
        return descripciom;
    }

    public void setDescripciom(String descripciom) {
        this.descripciom = descripciom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
            }
