/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package miniproyectopoo;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisc
 */
public class TablaContactos extends javax.swing.JPanel {

    private VentanaPrincipal ventanaPrincipal;
    private DefaultTableModel modelo;
    private JPanel panelContenedor2;

    /**
     * Creates new form TablaContactos
     */
    public TablaContactos(VentanaPrincipal ventanaPrincipal) {
        this.ventanaPrincipal = ventanaPrincipal;
        initComponents();
        modelo = (DefaultTableModel) getTabla().getModel();

    }

    public JTable getTabla() {
        return tablaContactos;
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
        tablaContactos = new javax.swing.JTable();

        tablaContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Telefono", "Direccion", "Correo Electronico", "Estado Civil", "Icono"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaContactos.getTableHeader().setResizingAllowed(false);
        tablaContactos.getTableHeader().setReorderingAllowed(false);
        tablaContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaContactosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaContactos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tablaContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaContactosMouseClicked
        
        int filaSeleccionada = tablaContactos.getSelectedRow();
        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tablaContactos.getModel();
            //GUARDAMOS LOS DATOS DE LA TABLA, SE PASAN PARAMETRO LA FILA Y LA COLUMNA.
            String nombre = (String) modelo.getValueAt(filaSeleccionada, 0);
            String apellido = (String) modelo.getValueAt(filaSeleccionada, 1);
            String telefono = (String) modelo.getValueAt(filaSeleccionada, 2);
            String direccion = (String) modelo.getValueAt(filaSeleccionada, 3);
            String correoElectronico = (String) modelo.getValueAt(filaSeleccionada, 4);
            String estadoCivil = (String) modelo.getValueAt(filaSeleccionada, 5);
            String icono = (String) modelo.getValueAt(filaSeleccionada, 6);

          

           ventanaPrincipal.editarContacto.setCampoNombre(nombre);
           ventanaPrincipal. editarContacto.setCampoApellido(apellido);
           ventanaPrincipal. editarContacto.setCampoTelefono(telefono);
           ventanaPrincipal. editarContacto.setCampoDireccion(direccion);
           ventanaPrincipal. editarContacto.setCampoCorreoElectronico(correoElectronico);
           ventanaPrincipal. editarContacto.setCampoIcono(icono);
           ventanaPrincipal. editarContacto.setEstadoCivil(estadoCivil);
            ventanaPrincipal.cambiarPanelContenedor2(ventanaPrincipal.editarContacto);
        } 
    }//GEN-LAST:event_tablaContactosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaContactos;
    // End of variables declaration//GEN-END:variables
}
