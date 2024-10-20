/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyectopoo;

import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author luisc
 */
public class VentanaPrincipal extends javax.swing.JFrame {
    
    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        TablaContactos tablaContactos = new TablaContactos();
        PanelContenedor1.removeAll();
        PanelContenedor1.setLayout(new BorderLayout());
        PanelContenedor1.add(tablaContactos);
        PanelContenedor1.revalidate();
        PanelContenedor1.repaint();
        
       PanelMenu panelMenu = new PanelMenu(this);
       PanelContenedor2.removeAll();
       PanelContenedor2.setLayout(new BorderLayout());
       PanelContenedor2.add(panelMenu);
       PanelContenedor2.revalidate();
       PanelContenedor2.repaint();
    }
    
    
    public void cambiarPanelContenedor2(JPanel nuevoPanel){
        PanelContenedor2.removeAll(); // Quitar el contenido actual
        PanelContenedor2.setLayout(new BorderLayout()); // Establecer un nuevo layout
        PanelContenedor2.add(nuevoPanel); // Añadir el nuevo panel
        PanelContenedor2.revalidate(); // Validar cambios
        PanelContenedor2.repaint(); // Repintar para ver los cambios
    }
    public JPanel getPanelContenedor2(){
        return PanelContenedor2;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelContenedor1 = new javax.swing.JPanel();
        PanelContenedor2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivo = new javax.swing.JMenu();
        menuItemNuevo = new javax.swing.JMenuItem();
        menuItemGuardar = new javax.swing.JMenuItem();
        menuItemSalir = new javax.swing.JMenuItem();
        menuAyuda = new javax.swing.JMenu();
        menuItemAcerdaDe = new javax.swing.JMenuItem();
        menuItemAtajos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout PanelContenedor1Layout = new javax.swing.GroupLayout(PanelContenedor1);
        PanelContenedor1.setLayout(PanelContenedor1Layout);
        PanelContenedor1Layout.setHorizontalGroup(
            PanelContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        PanelContenedor1Layout.setVerticalGroup(
            PanelContenedor1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelContenedor2Layout = new javax.swing.GroupLayout(PanelContenedor2);
        PanelContenedor2.setLayout(PanelContenedor2Layout);
        PanelContenedor2Layout.setHorizontalGroup(
            PanelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelContenedor2Layout.setVerticalGroup(
            PanelContenedor2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 271, Short.MAX_VALUE)
        );

        menuArchivo.setText("Archivo");

        menuItemNuevo.setText("Nuevo");
        menuItemNuevo.setToolTipText("");
        menuArchivo.add(menuItemNuevo);

        menuItemGuardar.setText("Guardar");
        menuArchivo.add(menuItemGuardar);

        menuItemSalir.setText("Salir");
        menuArchivo.add(menuItemSalir);

        jMenuBar1.add(menuArchivo);

        menuAyuda.setText("Ayuda");

        menuItemAcerdaDe.setText("Acerca de");
        menuItemAcerdaDe.setToolTipText("");
        menuAyuda.add(menuItemAcerdaDe);

        menuItemAtajos.setText("Atajos");
        menuAyuda.add(menuItemAtajos);

        jMenuBar1.add(menuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelContenedor1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PanelContenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelContenedor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelContenedor2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel PanelContenedor1;
    public javax.swing.JPanel PanelContenedor2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuArchivo;
    private javax.swing.JMenu menuAyuda;
    private javax.swing.JMenuItem menuItemAcerdaDe;
    private javax.swing.JMenuItem menuItemAtajos;
    private javax.swing.JMenuItem menuItemGuardar;
    private javax.swing.JMenuItem menuItemNuevo;
    private javax.swing.JMenuItem menuItemSalir;
    // End of variables declaration//GEN-END:variables
}
