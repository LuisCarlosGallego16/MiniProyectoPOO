package miniproyectopoo;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class BuscarContacto extends javax.swing.JPanel {

    private VentanaPrincipal ventanaPrincipal;
    private JPanel panelContenedor2;
    private TablaContactos tablaContactos;

    public BuscarContacto(VentanaPrincipal ventanaPrincipal, JPanel panelContenedor2) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.panelContenedor2 = panelContenedor2;

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        campoBuscarNombre = new javax.swing.JTextField();
        campoBuscarTelefono = new javax.swing.JTextField();
        etiquetaNombreBuscar = new javax.swing.JLabel();
        etiquetaTelefonoBuscar = new javax.swing.JLabel();
        botonBuscar = new javax.swing.JButton();

        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        etiquetaNombreBuscar.setText("NOMBRE:");

        etiquetaTelefonoBuscar.setText("TELEFONO:");
        etiquetaTelefonoBuscar.setToolTipText("");

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(campoBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(138, 138, 138)
                        .addComponent(campoBuscarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(etiquetaNombreBuscar)
                        .addGap(205, 205, 205)
                        .addComponent(etiquetaTelefonoBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(311, 311, 311)
                        .addComponent(botonBuscar)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombreBuscar)
                    .addComponent(etiquetaTelefonoBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBuscarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(botonBuscar)
                .addContainerGap(88, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelMenu panelMenu = new PanelMenu(ventanaPrincipal);
        panelContenedor2.removeAll();
        panelContenedor2.add(panelMenu);
        panelContenedor2.revalidate();
        panelContenedor2.repaint();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
 String buscarNombre = campoBuscarNombre.getText().toLowerCase();
String buscarTelefono = campoBuscarTelefono.getText();
DefaultTableModel modelo = (DefaultTableModel) ventanaPrincipal.getTablaContactos().getModel();

if (buscarNombre.isEmpty() && buscarTelefono.isEmpty()) {
    JOptionPane.showMessageDialog(ventanaPrincipal, "Por favor, ingrese un nombre o un teléfono para buscar.");
    return; // Salir del método si no se ingresa nada
}



// Realizar búsqueda
for (int i = 0; i < modelo.getRowCount(); i++) {
    String nombre = modelo.getValueAt(i, 0).toString().toLowerCase();
    String telefono = modelo.getValueAt(i, 2).toString();

    // Comprobar coincidencias
    if (nombre.contains(buscarNombre) || telefono.equals(buscarTelefono)) {
        ventanaPrincipal.getTablaContactos().setRowSelectionInterval(i, i);
        JOptionPane.showMessageDialog(ventanaPrincipal, "Contacto encontrado.");
        campoBuscarNombre.setText("");
        campoBuscarTelefono.setText("");
        ventanaPrincipal.getTablaContactos().clearSelection();
        return; // Salir del método después de encontrar
    }
}

// Si llegamos aquí, significa que no se encontró ningún contacto
JOptionPane.showMessageDialog(ventanaPrincipal, "No se encontraron resultados.");
        campoBuscarNombre.setText("");
        campoBuscarTelefono.setText("");
    }//GEN-LAST:event_botonBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoBuscarNombre;
    private javax.swing.JTextField campoBuscarTelefono;
    private javax.swing.JLabel etiquetaNombreBuscar;
    private javax.swing.JLabel etiquetaTelefonoBuscar;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
