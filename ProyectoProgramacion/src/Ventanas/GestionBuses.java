/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Bus;
import Clases.Destino;
import Clases.TipoServicio;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David
 */
public class GestionBuses extends javax.swing.JFrame {


    private Bus[] ltaBuses=null;
    private TipoServicio[] ltaServicios=null;
    private Destino[] ltaDestinos=null;
    Principal p=new Principal();
    DefaultTableModel tableModel;
    DefaultComboBoxModel<Destino> modelComboDestinos;
    DefaultComboBoxModel<TipoServicio> modelComboServicios;
   
   
    public GestionBuses() {
        initComponents();
        tableModel = (DefaultTableModel) tableBuses.getModel();  
        modelComboDestinos=(DefaultComboBoxModel)cmbDestinos.getModel();
        modelComboServicios=(DefaultComboBoxModel)cmbTServicios.getModel();
        cmbDestinos.setModel(modelComboDestinos);
        cmbTServicios.setModel(modelComboServicios);
        cargaServicios();
        cargaDestinos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCapacidad = new javax.swing.JTextField();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnListar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableBuses = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        cmbTServicios = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        cmbDestinos = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("GESTION DE BUSES");

        jLabel2.setText("Id:");

        txtId.setEnabled(false);

        jLabel3.setText("Capacidad:");

        txtCapacidad.setEnabled(false);

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.setEnabled(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnListar.setText("Listar");
        btnListar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListarActionPerformed(evt);
            }
        });

        tableBuses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Capacidad", "Tipo Servicio", "Destino"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableBuses);

        jLabel4.setText("Tipo Servicio:");

        cmbTServicios.setEnabled(false);

        jLabel5.setText("Destino:");

        cmbDestinos.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cmbDestinos, 0, 111, Short.MAX_VALUE)
                                    .addComponent(cmbTServicios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtId)
                                    .addComponent(txtCapacidad)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(btnListar))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCapacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cmbTServicios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(cmbDestinos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnListar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargaDestinos(){
        if(cuentaDestinos()<1){
            JOptionPane.showMessageDialog(this,"No hay Destinos para mostrar");
        }else{
            for(Destino d:getLtaDestinos()){
                    modelComboDestinos.addElement(d);
            }
        }
    }
    
    private void cargaServicios(){
        
        if(cuentaServicios()<1){
            JOptionPane.showMessageDialog(this,"No hay Servicios para mostrar");
        }else{
            for(TipoServicio t:getLtaServicios()){
                    modelComboServicios.addElement(t);
            }
        }
    }
    
    private void btnListarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListarActionPerformed
         tableBuses.clearSelection();
        tableModel.setRowCount(0);
        
        limpiaTxt();
        
        if(this.cuentaBuses()<1){
            JOptionPane.showMessageDialog(this,"No hay Buses para mostrar");
        }else{
            for(Bus b:getLtaBuses()){
                Object[] data={b.getId(),b.getCapacidad(),b.getTipoServicio().getDescripcion(),b.getDestino().getDescripcion()};
                tableModel.addRow(data);
            }

        }
        
        btnGuardar.setEnabled(false);
        btnNuevo.setEnabled(true);
    }//GEN-LAST:event_btnListarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        btnNuevo.setEnabled(false);
        btnGuardar.setEnabled(true);
        cmbDestinos.setEnabled(true);
        cmbTServicios.setEnabled(true);
        
        if(this.cuentaBuses()<getLtaBuses().length){
            limpiaTxt();
            txtCapacidad.setEnabled(true);
            txtId.setEnabled(true);
        }else{
            JOptionPane.showMessageDialog(this,"Se alcanzo el tamaño maximo de buses permitidos");
        }
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        Bus b=new Bus();
        String capacidad=txtCapacidad.getText();
        String id=txtId.getText();
        Destino d=new Destino();
        TipoServicio ts=new TipoServicio();

        int pos=cuentaBuses();
        
        if(capacidad.matches("([0-9]+)") && id.matches("([0-9]+)")){
            b.setCapacidad(Integer.parseInt(capacidad));
            b.setId(Integer.parseInt(id));
            b.setDestino(d);
            b.setTipoServicio(ts);
            getLtaBuses()[pos]=b;
            
            //lo guardamos en la ventana principal para poder manejarlo en cualquier ventana  
            p.setLtaBuses(getLtaBuses());
            JOptionPane.showMessageDialog(this,"Bus guardado correctamente....");
            
            txtId.setText("");
            txtCapacidad.setText("");
            btnGuardar.setEnabled(false);
            btnNuevo.setEnabled(true);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    public int cuentaBuses(){
        int nbuses=0;
        for (int i = 0; i < getLtaBuses().length; i++) {
            if(getLtaBuses()[i]!=null){
                nbuses++;
            }
        }
        return nbuses;
    }
    
    public int cuentaDestinos(){
        int ndestinos=0;
        for (int i = 0; i < getLtaDestinos().length; i++) {
            if(getLtaDestinos()[i]!=null){
                ndestinos++;
            }
        }
        return ndestinos;
    }
    
    public int cuentaServicios(){
        int nservicios=0;
        for (int i = 0; i < getLtaServicios().length; i++) {
            if(getLtaServicios()[i]!=null){
                nservicios++;
            }
        }
        return nservicios;
    }
    
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
            java.util.logging.Logger.getLogger(GestionBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionBuses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionBuses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnListar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox cmbDestinos;
    private javax.swing.JComboBox cmbTServicios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tableBuses;
    private javax.swing.JTextField txtCapacidad;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables


    private void limpiaTxt() {
        txtCapacidad.setText("");
        txtId.setText("");
    }

    public Destino[] getLtaDestinos() {
        return ltaDestinos;
    }
    
    public void setLtaDestinos(Destino[] ltaDestinos) {
        this.ltaDestinos = ltaDestinos;
    }

    public TipoServicio[] getLtaServicios() {
        return ltaServicios;
    }

    public void setLtaServicios(TipoServicio[] ltaServicios) {
        this.ltaServicios = ltaServicios;
    }

    public Bus[] getLtaBuses() {
        return ltaBuses;
    }

    public void setLtaBuses(Bus[] ltaBuses) {
        this.ltaBuses = ltaBuses;
    }
}
