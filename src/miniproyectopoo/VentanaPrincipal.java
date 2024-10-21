/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package miniproyectopoo;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisc
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    private TablaContactos tablaContactos;
    protected DefaultTableModel modelo;
    protected AgregarContacto agregarContacto;

    public VentanaPrincipal() {
        initComponents();
        agregarContacto = new AgregarContacto(this, getPanelContenedor2(), modelo);
        tablaContactos = new TablaContactos();
        modelo = (DefaultTableModel) getTablaContactos().getModel();
        PanelContenedor1.removeAll();
        PanelContenedor1.setLayout(new BorderLayout());
        PanelContenedor1.add(tablaContactos);
        PanelContenedor1.revalidate();
        PanelContenedor1.repaint();

        PanelMenu panelMenu = new PanelMenu(this);

        cambiarPanelContenedor2(panelMenu);
        
    }
 public AgregarContacto getAgregarContacto() {
    return agregarContacto;

    }
 

    public void cambiarPanelContenedor2(JPanel nuevoPanel) {
        PanelContenedor2.removeAll(); // Quitar el contenido actual
        PanelContenedor2.setLayout(new BorderLayout()); // Establecer un nuevo layout
        PanelContenedor2.add(nuevoPanel); // Añadir el nuevo panel
        PanelContenedor2.revalidate(); // Validar cambios
        PanelContenedor2.repaint(); // Repintar para ver los cambios
        nuevoPanel.setFocusable(true);

    }

    public JPanel getPanelContenedor2() {
        return PanelContenedor2;
    }

    public JTable getTablaContactos() {
        return tablaContactos.getTabla();
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
        menuItemNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemNuevoActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemNuevo);

        menuItemGuardar.setText("Guardar");
        menuItemGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemGuardarActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemGuardar);

        menuItemSalir.setText("Salir");
        menuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemSalirActionPerformed(evt);
            }
        });
        menuArchivo.add(menuItemSalir);

        jMenuBar1.add(menuArchivo);

        menuAyuda.setText("Ayuda");

        menuItemAcerdaDe.setText("Acerca de");
        menuItemAcerdaDe.setToolTipText("");
        menuItemAcerdaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAcerdaDeActionPerformed(evt);
            }
        });
        menuAyuda.add(menuItemAcerdaDe);

        menuItemAtajos.setText("Atajos");
        menuItemAtajos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemAtajosActionPerformed(evt);
            }
        });
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

    private void menuItemNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemNuevoActionPerformed
        //VALIDACION PARA QUE SIEMPRE SE MANEJE LA MISMA INSTANCIA 
        if (agregarContacto == null) {
            agregarContacto = new AgregarContacto(this, getPanelContenedor2(), modelo);
        }
        cambiarPanelContenedor2(agregarContacto);
    }//GEN-LAST:event_menuItemNuevoActionPerformed

    private void menuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemSalirActionPerformed
        PanelMenu panelMenu = new PanelMenu(this);
        getPanelContenedor2().removeAll();
        getPanelContenedor2().add(panelMenu);
        getPanelContenedor2().revalidate();
        getPanelContenedor2().repaint();
    }//GEN-LAST:event_menuItemSalirActionPerformed

    private void menuItemGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemGuardarActionPerformed
       DefaultTableModel modelo = (DefaultTableModel) getTablaContactos().getModel();
        String nombre = agregarContacto.getCampoNombre();
        System.out.println("NOMBRE"+nombre);
        String apellido = agregarContacto.getCampoApellido();
        String telefono = agregarContacto.getCampoTelefono();
        String direccion = agregarContacto.getCampoDireccion();
        String correoElectronico = agregarContacto.getCampoCorreoElectronico();
        String icono = agregarContacto.getCampoImagen();
        String estadoCivil = "";
        if (agregarContacto.getRadioBotonSoltero().isSelected()) {
            estadoCivil = "Soltero";
        } else if (agregarContacto.getRadioBotonCasado().isSelected()) {
            estadoCivil = "Casado";
        } else if (agregarContacto.getRadioBotonUnionLibre().isSelected()) {
            estadoCivil = "Union Libre";
        } else if (agregarContacto.getRadioBotonDivorciado().isSelected()) {
            estadoCivil = "Divorciado";
        }
        Object[] nuevaFila = {nombre, apellido, telefono, direccion, correoElectronico, estadoCivil, icono};
        modelo.addRow(nuevaFila);

        agregarContacto.setCampoNombre("");
        agregarContacto.setCampoApellido("");
        agregarContacto.setCampoTelefono("");
        agregarContacto.setCampoDireccion("");
        agregarContacto.setCampoCorreoElectronico("");
        agregarContacto.setCampoImagen("");
        agregarContacto.limpiarBotones();

              

    }//GEN-LAST:event_menuItemGuardarActionPerformed

    private void menuItemAcerdaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAcerdaDeActionPerformed
        String mensajeAyuda = "AGREGAR: Opcion que te permite crear y agregar un nuevo contacto\n"
                + "EDITAR: Opcion que te permite seleccionar un contacto y editar su informacion"
                + "\n"
                + "ELIMINAR: Opcion que te permite seleccionar un contacto y eliminarlo definitavente"
                + "\n"
                + "BUSCAR: Opcion que te permite buscar un contacto con su nombre o numero telefonico";
        JOptionPane.showMessageDialog(this, mensajeAyuda, "GUIA", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItemAcerdaDeActionPerformed

    private void menuItemAtajosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemAtajosActionPerformed
        String atajos = "TECLA N: Permite abrir formulario para agregar un nuevo contacto\n"
                + "TECLA E: Permite editar un contacto seleccionado de la tabla "
                + "\n"
                + "TECLA D: Permite eliminar un contacto seleccionado de la tabla"
                + "\n"
                + "TECLA ENTER: Guardar un nuevo contacto o cambios realizados a un contacto";
        JOptionPane.showMessageDialog(this, atajos, "ATAJOS", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_menuItemAtajosActionPerformed

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
