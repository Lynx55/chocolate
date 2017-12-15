/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Chocolate;
import Modelo.Modelo;
import java.util.ArrayList;

/**
 *
 * @author simon
 */
public class Control {
    private Chocolate choco;
    private ArrayList<Chocolate> lista;
    private Modelo consulta;
    public Boolean agregar(String nombre, String descripcion,int precio, int cantidad,String tipo,String marca,int azucar,String sabor){
        consulta = new Modelo();
        return consulta.Agregar(nombre, descripcion, precio, cantidad, tipo, marca, azucar,sabor);
    }
    public Boolean Modificar(String nombre, String descripcion,int precio, int cantidad,String tipo,String marca,int azucar,String sabor,int codigo){
        consulta = new Modelo();
        return consulta.Modificar(nombre, descripcion, precio, cantidad, tipo, marca, azucar,sabor, codigo);
    }
    public Boolean eliminar(int varCodigo){
        consulta = new Modelo();
        return consulta.Eliminar(varCodigo);
    }
    public ArrayList<Chocolate> buscar(int varCodigo){
        consulta = new Modelo();
        return consulta.Buscar(varCodigo);
    }
    public ArrayList<Chocolate> listar(){
        consulta = new Modelo();
        return consulta.Listar();
    }
}
