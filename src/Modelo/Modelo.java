/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import accesoBD.acceso;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author simon
 */
public class Modelo {
    private Chocolate choco;
    private ArrayList<Chocolate> lista;
    public Boolean Agregar(String nombre, String descripcion,int precio, int cantidad,String tipo,String marca,int azucar,String sabor){
        try {
            String sql = "insert into chocolate (codigo,nombre,descripcion,precio,cantidad,tipo,marca,azucar,sabor) " +
                    "values (seq_codigo.nextval,?,?,?,?,?,?,?,?)";
            PreparedStatement preparedStatement = acceso.obtenerInstancia().prepareStatement(sql);
            preparedStatement.setString(1,nombre);
            preparedStatement.setString(2,descripcion);
            preparedStatement.setInt(3,precio);
            preparedStatement.setInt(4,cantidad);
            preparedStatement.setString(5,tipo);
            preparedStatement.setString(6,marca);
            preparedStatement.setInt(7,azucar);
            preparedStatement.setString(8,sabor);
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public Boolean Eliminar(int varCodigo){
        try {
            String sql="delete chocolate where codigo=?";
            PreparedStatement preparedStatement = acceso.obtenerInstancia().prepareStatement(sql);
            preparedStatement.setInt(1,varCodigo);
            preparedStatement.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public Boolean Modificar(String nombre, String descripcion,int precio, int cantidad,String tipo,String marca,int azucar,String sabor,int codigo){
        try {
            int a = 0;
            //String sql = "update un_alumno set rut=?, dv=?,nombre=?,apellido=? where id_alumno=?";
            StringBuffer linea = new StringBuffer();
            linea.append("update chocolate set ");
            if (!nombre.isEmpty()){
                linea.append("nombre="+ nombre);
                a++;
                System.out.println("modifico nombre");
            }if (!descripcion.isEmpty()){
                if (a>0){
                    linea.append(", ");
                    a++;
                }
                linea.append("descipcion= '"+descripcion+"'");
                System.out.println("modifico descripcion");
            }if (precio>0){
                if (a>0){
                    linea.append(", ");
                    a++;
                }
                linea.append("precio= "+precio);
                System.out.println("modifico precio");
            }if (cantidad>0){
                if (a>0){
                    linea.append(", ");
                    a++;
                }
                linea.append("cantidad="+cantidad);
                System.out.println("modifico cantidad");
            }if (!tipo.isEmpty()){
                if (a>0){
                    linea.append(", ");
                    a++;
                }
                linea.append("tipo= '"+tipo+"'");
                System.out.println("modifico tipo");
            }if (!marca.isEmpty()){
                if (a>0){
                    linea.append(", ");
                    a++;
                }
                linea.append("marca= '"+marca+"'");
                System.out.println("modifico marca");
            }if (azucar>0){
                if (a>0){
                    linea.append(", ");
                    a++;
                }
                linea.append("azucar="+azucar);
                System.out.println("modifico azucar");
            }if (!sabor.isEmpty()){
                if (a>0){
                    linea.append(", ");
                    a++;
                }
                linea.append("sabor= '"+sabor+"'");
                System.out.println("modifico sabor");
            }
            linea.append("where codigo="+codigo);                
            System.out.println(linea.toString());
            PreparedStatement preparedStatement = acceso.obtenerInstancia().prepareStatement(linea.toString());
            preparedStatement.execute();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    public ArrayList<Chocolate> Listar(){
        try {
            String sql="select codigo,nombre,descripcion,precio,cantidad,tipo,marca,azucar,sabor from chocolate";
            PreparedStatement preparedStatement =acceso.obtenerInstancia().prepareStatement(sql);
            ResultSet resultSet = preparedStatement.executeQuery();
            lista = new ArrayList();
            while (resultSet.next()){
                choco = new Chocolate();
                choco.setCodigo(resultSet.getInt("codigo"));
                choco.setNombre(resultSet.getString("nombre"));
                choco.setDescripciom(resultSet.getString("descripcion"));
                choco.setPrecio(resultSet.getInt("precio"));
                choco.setCantidad(resultSet.getInt("cantidad"));
                choco.setTipo(resultSet.getString("tipo"));
                choco.setMarca(resultSet.getString("marca"));
                choco.setAzucar(resultSet.getInt("azucar"));
                lista.add(choco);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    public ArrayList<Chocolate>  Buscar(int varCodigo){
        try {
            String sql="select codigo,nombre,descripcion,precio,cantidad,tipo,marca,azucar from chocolate where codigo=?";
            PreparedStatement preparedStatement =acceso.obtenerInstancia().prepareStatement(sql);
            preparedStatement.setInt(1,varCodigo);
            ResultSet resultSet = preparedStatement.executeQuery();
            lista = new ArrayList();
            while (resultSet.next()){
                choco = new Chocolate();
                choco.setCodigo(resultSet.getInt("codigo"));
                choco.setNombre(resultSet.getString("nombre"));
                choco.setDescripciom(resultSet.getString("descripcion"));
                choco.setPrecio(resultSet.getInt("precio"));
                choco.setCantidad(resultSet.getInt("cantidad"));
                choco.setTipo(resultSet.getString("tipo"));
                choco.setMarca(resultSet.getString("marca"));
                choco.setAzucar(resultSet.getInt("azucar"));
                lista.add(choco);
            }
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
}
