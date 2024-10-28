package miniproyectopoo;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class BuscarContacto extends javax.swing.JPanel {

    private VentanaPrincipal ventanaPrincipal;
    private JPanel panelContenedor2;
    private TablaContactos tablaContactos;

    public BuscarContacto(VentanaPrincipal ventanaPrincipal, JPanel panelContenedor2) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        this.panelContenedor2 = panelContenedor2;
        configurarActionListeners();
    }

    private void configurarActionListeners() {
        campoBuscarNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        campoBuscarTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });
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
        jLabel1 = new javax.swing.JLabel();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        campoBuscarTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoBuscarTelefonoKeyTyped(evt);
            }
        });

        etiquetaNombreBuscar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaNombreBuscar.setText("NOMBRE:");

        etiquetaTelefonoBuscar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaTelefonoBuscar.setText("TELEFONO:");
        etiquetaTelefonoBuscar.setToolTipText("");

        botonBuscar.setText("BUSCAR");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("BUSCAR CONTACTO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(campoBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(146, 146, 146)
                        .addComponent(campoBuscarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton1)
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1)))
                .addContainerGap(165, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonBuscar)
                .addGap(329, 329, 329))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(etiquetaNombreBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTelefonoBuscar)
                .addGap(204, 204, 204))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombreBuscar)
                    .addComponent(etiquetaTelefonoBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoBuscarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoBuscarTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addComponent(botonBuscar)
                .addGap(93, 93, 93))
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
            return;
        }
        for (int i = 0; i < modelo.getRowCount(); i++) {
            String nombre = modelo.getValueAt(i, 0).toString().toLowerCase();
            String telefono = modelo.getValueAt(i, 2).toString();

            if (nombre.contains(buscarNombre) || telefono.equals(buscarTelefono)) {
                ventanaPrincipal.getTablaContactos().setRowSelectionInterval(i, i);
                JOptionPane.showMessageDialog(ventanaPrincipal, "Contacto encontrado.");
                campoBuscarNombre.setText("");
                campoBuscarTelefono.setText("");
                ventanaPrincipal.getTablaContactos().clearSelection();
                return;
            }
        }
        JOptionPane.showMessageDialog(ventanaPrincipal, "No se encontraron resultados.");
        campoBuscarNombre.setText("");
        campoBuscarTelefono.setText("");
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String buscarNombre = campoBuscarNombre.getText().toLowerCase();
            String buscarTelefono = campoBuscarTelefono.getText();
            DefaultTableModel modelo = (DefaultTableModel) ventanaPrincipal.getTablaContactos().getModel();

            if (buscarNombre.isEmpty() && buscarTelefono.isEmpty()) {
                JOptionPane.showMessageDialog(ventanaPrincipal, "Por favor, ingrese un nombre o un teléfono para buscar.");
                return;
            }
            for (int i = 0; i < modelo.getRowCount(); i++) {
                String nombre = modelo.getValueAt(i, 0).toString().toLowerCase();
                String telefono = modelo.getValueAt(i, 2).toString();

                if (nombre.contains(buscarNombre) || telefono.equals(buscarTelefono)) {
                    ventanaPrincipal.getTablaContactos().setRowSelectionInterval(i, i);
                    JOptionPane.showMessageDialog(ventanaPrincipal, "Contacto encontrado.");
                    campoBuscarNombre.setText("");
                    campoBuscarTelefono.setText("");
                    ventanaPrincipal.getTablaContactos().clearSelection();
                    return;
                }
            }
            JOptionPane.showMessageDialog(ventanaPrincipal, "No se encontraron resultados.");
            campoBuscarNombre.setText("");
            campoBuscarTelefono.setText("");
        }
    }//GEN-LAST:event_formKeyPressed

    private void campoBuscarTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoBuscarTelefonoKeyTyped
        char caracter = evt.getKeyChar(); //Se obtiene el caracter que se ingresa
        if (!Character.isDigit(caracter)) { //Validar de que el carcacter que se ingresa no es digito
            evt.consume(); //Se evita que se agrege al campo de texto si no es digito
        }
    }//GEN-LAST:event_campoBuscarTelefonoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JTextField campoBuscarNombre;
    private javax.swing.JTextField campoBuscarTelefono;
    private javax.swing.JLabel etiquetaNombreBuscar;
    private javax.swing.JLabel etiquetaTelefonoBuscar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
