/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import Controlador.Control;
import Modelo.Chocolate;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author simon
 */
public class Listar extends javax.swing.JFrame {
    DefaultTableModel table1;
    Control consulta;
    ArrayList<Chocolate> lista;
    Integer varModificar;
    /**
     * Creates new form Listar
     */
    public Listar() {
        initComponents();
        table1 = new DefaultTableModel();
        table1.addColumn("Codigo");
        table1.addColumn("Nombre");
        table1.addColumn("Descripcion");
        table1.addColumn("Precio");
        table1.addColumn("Catidad");
        table1.addColumn("Tipo");
        table1.addColumn("Sabor");
        table1.addColumn("Marca");
        table1.addColumn("Azucar");
        jTable1.setModel(table1);
        consulta= new Control();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonActualizar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        varCodigo = new javax.swing.JTextField();
        botonModificar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        botonActualizar.setText("Actualizar");
        botonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActualizarActionPerformed(evt);
            }
        });

        jButton2.setText("Menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("Codigo chocolate");

        botonModificar.setText("Modificar");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(varCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(botonModificar)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonActualizar)
                    .addComponent(jButton2))
                .addGap(67, 67, 67)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(varCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonModificar)
                    .addComponent(jLabel1)
                    .addComponent(jButton1))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFrame frameMenu = new Menu();
        frameMenu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void botonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActualizarActionPerformed
        while(table1.getRowCount()>0) table1.removeRow(0);
        lista = consulta.listar(); 
        Object[] fila = new Object[9];
        for (int x=0;x<lista.size();x++){
            fila[0]=lista.get(x).getCodigo();
            fila[1]=lista.get(x).getNombre();
            fila[2]=lista.get(x).getDescripciom();
            fila[3]=lista.get(x).getPrecio();
            fila[4]=lista.get(x).getCantidad();
            fila[5]=lista.get(x).getTipo();
            fila[6]=lista.get(x).getSabor();
            fila[7]=lista.get(x).getMarca();
            fila[8]=lista.get(x).getAzucar();
            table1.addRow(fila);
        }jTable1.updateUI();
        JOptionPane.showMessageDialog(this, "Lista actualizada");
    }//GEN-LAST:event_botonActualizarActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        if ( !varCodigo.getText().isEmpty()){
            JFrame modificar = new Modificar(new Integer (varCodigo.getText()));
            modificar.setVisible(true);
            dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese campo");

        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if ( !varCodigo.getText().isEmpty()){
        while(table1.getRowCount()>0) table1.removeRow(0);
        lista = consulta.buscar(new Integer(varCodigo.getText())); 
        Object[] fila = new Object[9];
        for (int x=0;x<lista.size();x++){
            fila[0]=lista.get(x).getCodigo();
            fila[1]=lista.get(x).getNombre();
            fila[2]=lista.get(x).getDescripciom();
            fila[3]=lista.get(x).getPrecio();
            fila[4]=lista.get(x).getCantidad();
            fila[5]=lista.get(x).getTipo();
            fila[6]=lista.get(x).getSabor();
            fila[7]=lista.get(x).getMarca();
            fila[8]=lista.get(x).getAzucar();
            table1.addRow(fila);
        }jTable1.updateUI();
        JOptionPane.showMessageDialog(this, "Busqueda realizada");
        } else {
            JOptionPane.showMessageDialog(this, "Ingrese campo");

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Listar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Listar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonActualizar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField varCodigo;
    // End of variables declaration//GEN-END:variables
}
