/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Bus;
import Clases.Cliente;
import Clases.Destino;
import Clases.Pasaje;
import Clases.TipoServicio;
import javax.swing.JOptionPane;

/**
 *
 * @author David
 */
public class Principal extends javax.swing.JFrame {

    private Cliente[] ltaClientes=null;
    private Bus[] ltaBuses=null;
    private Destino[] ltaDestinos=null;
    private TipoServicio[] ltaServicios=null;
    private Pasaje[] ltapasajes=null;
    private int nclientes=0;
    private int nt=0;
    
    public Cliente[] getLtaClientes() {
        return ltaClientes;
    }

    public void setLtaClientes(Cliente[] ltaClientes) {
        this.ltaClientes = ltaClientes;
    }

    public Bus[] getLtaBuses() {
        return ltaBuses;
    }

    public void setLtaBuses(Bus[] ltaBuses) {
        this.ltaBuses = ltaBuses;
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
    
    public int getNclientes() {
        return nclientes;
    }

    public void setNclientes(int nclientes) {
        this.nclientes = nclientes;
    }
    
    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        ltaServicios=new TipoServicio[20];
        ltaDestinos=new Destino[20];
        ltaBuses=new Bus[20];
    }
    
    public int cuentaClientes(){
        int nclientes=0;
        for (int i = 0; i < ltaClientes.length; i++) {
            if(ltaClientes[i]!=null){
                nclientes++;
            }
        }
        return nclientes;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        lblclientes = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnInicializar = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        btnClientes = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        btnVenta = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("VENTA DE PASAJES");

        btnInicializar.setText("Entidades");

        jMenuItem3.setText("Inicializar Clientes");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        btnInicializar.add(jMenuItem3);

        btnClientes.setText("Gestion Clientes");
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnInicializar.add(btnClientes);

        jMenuItem1.setText("Gestion Buses");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        btnInicializar.add(jMenuItem1);

        jMenuItem2.setText("Gestion Destinos");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        btnInicializar.add(jMenuItem2);

        jMenuItem4.setText("Gestion Servicios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        btnInicializar.add(jMenuItem4);

        jMenuBar1.add(btnInicializar);

        jMenu4.setText("Pasajes");
        jMenu4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu4ActionPerformed(evt);
            }
        });

        btnVenta.setText("Venta");
        btnVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentaActionPerformed(evt);
            }
        });
        jMenu4.add(btnVenta);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblclientes)
                        .addGap(21, 21, 21))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(119, 119, 119))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblclientes)
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addContainerGap(142, Short.MAX_VALUE))
        );

        lblclientes.getAccessibleContext().setAccessibleName("lblClientes");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        try{
            if(getNclientes()==0){

                String s="";
                do{
                   s = (String)JOptionPane.showInputDialog(
                            this,
                            "Ingrese cantidad de clientes",
                            "Inicializa Clientes",
                            JOptionPane.PLAIN_MESSAGE);         

                }while(!s.matches("([1-9])+"));

                if(s!=null){
                    this.setNclientes(Integer.parseInt(s));
                    ltaClientes=new Cliente[this.getNclientes()];
                    lblclientes.setText("Clientes: "+String.valueOf(this.getNclientes()));

                }

            }else{
                JOptionPane.showMessageDialog(this, "Clientes ya inicializados");
            }
        }catch(NumberFormatException ex){
            throw ex;
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed
        if(ltaClientes!=null){
            GestionClientes gc=new GestionClientes();
            gc.setP(this);
            gc.setLtaClientes(getLtaClientes());
            gc.setDefaultCloseOperation(GestionClientes.DISPOSE_ON_CLOSE);
            gc.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(this, "Clientes no Inicializados");
        } 
    }//GEN-LAST:event_btnClientesActionPerformed

    private void jMenu4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu4ActionPerformed
       
    }//GEN-LAST:event_jMenu4ActionPerformed

    private void btnVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentaActionPerformed

        Venta v=new Venta();
        v.setP(this);
        v.setLtaClientes(getLtaClientes());
        v.setLtaBuses(getLtaBuses());
        v.setLtaDestinos(getLtaDestinos());
        v.setLtaServicios(getLtaServicios());
        v.setDefaultCloseOperation(Venta.DISPOSE_ON_CLOSE);
        v.setVisible(true);
    }//GEN-LAST:event_btnVentaActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        GestionTServicios gts = new GestionTServicios();
        gts.setP(this);
        gts.setLtaServicios(getLtaServicios());
        gts.setDefaultCloseOperation(GestionTServicios.DISPOSE_ON_CLOSE);
        gts.setVisible(true);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        GestionDestinos gd=new GestionDestinos();
        gd.setP(this);
        gd.setLtaDestinos(getLtaDestinos());
        gd.setDefaultCloseOperation(GestionDestinos.DISPOSE_ON_CLOSE);
        gd.setVisible(true);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        GestionBuses gb=new GestionBuses();
        gb.setP(this);
        gb.setLtaBuses(getLtaBuses());
        gb.setLtaDestinos(getLtaDestinos());
        gb.setLtaServicios(getLtaServicios());
        gb.setDefaultCloseOperation(GestionBuses.DISPOSE_ON_CLOSE);
        gb.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnClientes;
    private javax.swing.JMenu btnInicializar;
    private javax.swing.JMenuItem btnVenta;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JLabel lblclientes;
    // End of variables declaration//GEN-END:variables

    public Pasaje[] getLtapasajes() {
        return ltapasajes;
    }

    public void setLtapasajes(Pasaje[] ltapasajes) {
        this.ltapasajes = ltapasajes;
    }

    public int getNt() {
        return nt;
    }

    public void setNt(int nt) {
        this.nt = nt;
    }

    

    

    
    
}
