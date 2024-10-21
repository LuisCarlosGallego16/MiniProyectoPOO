package miniproyectopoo;

import java.util.HashSet;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AgregarContacto extends javax.swing.JPanel {

    private ButtonGroup grupoBotones;
    private JPanel panelContenedor2;
    private VentanaPrincipal ventanaPrincipal;
    private DefaultTableModel modelo;
    private TablaContactos tablaContactos;

    public AgregarContacto(VentanaPrincipal ventanaPrincipal, JPanel panelContenedor2, DefaultTableModel modelo) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.panelContenedor2 = panelContenedor2;
        this.modelo = modelo;
        initComponents();

        grupoBotones = new ButtonGroup();
        grupoBotones.add(radioBotonSoltero);
        grupoBotones.add(radioBotonCasado);
        grupoBotones.add(radioBotonUnionLibre);
        grupoBotones.add(radioBotonDivorciado);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellido = new javax.swing.JLabel();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaCorreoElectronico = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        etiquetaEstadoCivil = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();
        etiquetaIcono = new javax.swing.JLabel();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCorreoElectronico = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        radioBotonSoltero = new javax.swing.JRadioButton();
        radioBotonCasado = new javax.swing.JRadioButton();
        radioBotonUnionLibre = new javax.swing.JRadioButton();
        radioBotonDivorciado = new javax.swing.JRadioButton();
        campoImagen = new javax.swing.JTextField();

        etiquetaTitulo.setText("AGREGAR CONTACTO");

        etiquetaNombre.setText("NOMBRE:");

        etiquetaApellido.setText("APELLIDO:");

        etiquetaTelefono.setText("TELEFONO:");

        etiquetaCorreoElectronico.setText("CORREO ELECTRONICO:");

        etiquetaDireccion.setText("DIRECCION:");

        etiquetaEstadoCivil.setText("ESTADO CIVIL:");

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setText("CANCELAR");

        botonMenu.setText("MENU");
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        etiquetaIcono.setText("ICONO:");

        radioBotonSoltero.setText("SOLTERO");

        radioBotonCasado.setText("CASADO");

        radioBotonUnionLibre.setText("UNION LIBRE");

        radioBotonDivorciado.setText("DIVORCIADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(etiquetaTitulo)
                .addGap(353, 353, 353))
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(botonMenu)
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaDireccion)
                        .addGap(51, 51, 51)
                        .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCorreoElectronico)
                        .addGap(18, 18, 18)
                        .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaNombre)
                            .addComponent(etiquetaApellido)
                            .addComponent(etiquetaTelefono))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNombre)
                            .addComponent(campoApellido)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaEstadoCivil)
                            .addComponent(etiquetaIcono))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonGuardar)
                                .addGap(41, 41, 41)
                                .addComponent(botonCancelar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioBotonSoltero)
                                .addGap(18, 18, 18)
                                .addComponent(radioBotonCasado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBotonUnionLibre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBotonDivorciado))
                            .addComponent(campoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(137, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiquetaTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaNombre)
                    .addComponent(botonMenu)
                    .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaApellido)
                    .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCorreoElectronico)
                    .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaDireccion)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEstadoCivil)
                    .addComponent(radioBotonSoltero)
                    .addComponent(radioBotonCasado)
                    .addComponent(radioBotonUnionLibre)
                    .addComponent(radioBotonDivorciado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaIcono)
                    .addComponent(campoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonCancelar))
                .addGap(15, 15, 15))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        PanelMenu panelMenu = new PanelMenu(ventanaPrincipal);
        panelContenedor2.removeAll();
        panelContenedor2.add(panelMenu);
        panelContenedor2.revalidate();
        panelContenedor2.repaint();

    }//GEN-LAST:event_botonMenuActionPerformed

    //GETTERS PARA OBTENER LA INFORMACION DE LOS CAMPOS DE TEXTFIEL
    public String getCampoApellido() {
        return campoApellido.getText();
    }

    public String getCampoCorreoElectronico() {
        return campoCorreoElectronico.getText();
    }

    public String getCampoDireccion() {
        return campoDireccion.getText();
    }

    public String getCampoImagen() {
        return campoImagen.getText();
    }

    public String getCampoNombre() {
        return campoNombre.getText();
    }

    public String getCampoTelefono() {
        return campoTelefono.getText();
    }

    public JRadioButton getRadioBotonCasado() {
        return radioBotonCasado;
    }

    public JRadioButton getRadioBotonDivorciado() {
        return radioBotonDivorciado;
    }

    public JRadioButton getRadioBotonSoltero() {
        return radioBotonSoltero;
    }

    public JRadioButton getRadioBotonUnionLibre() {
        return radioBotonUnionLibre;
    }

    public void setCampoNombre(String nombre) {
        campoNombre.setText(nombre);
    }

    public void setCampoApellido(String apellido) {
        campoApellido.setText(apellido);
    }

    public void setCampoTelefono(String telefono) {
        campoTelefono.setText(telefono);
    }

    public void setCampoDireccion(String direccion) {
        campoDireccion.setText(direccion);
    }

    public void setCampoCorreoElectronico(String correo) {
        campoCorreoElectronico.setText(correo);
    }

    public void setCampoImagen(String imagen) {
        campoImagen.setText(imagen);
    }
    
    public void limpiarBotones(){
        grupoBotones.clearSelection();
    }


    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) ventanaPrincipal.getTablaContactos().getModel();
        String nombre = getCampoNombre();
        System.out.println("EL NOMBRE ES:" + nombre);
        String apellido = getCampoApellido();
        String telefono = getCampoTelefono();
        String direccion = getCampoDireccion();
        String correoElectronico = getCampoCorreoElectronico();
        String icono = getCampoImagen();
        String estadoCivil = "";
        if (radioBotonSoltero.isSelected()) {
            estadoCivil = "Soltero";
        } else if (radioBotonCasado.isSelected()) {
            estadoCivil = "Casado";
        } else if (radioBotonUnionLibre.isSelected()) {
            estadoCivil = "Union Libre";
        } else if (radioBotonDivorciado.isSelected()) {
            estadoCivil = "Divorciado";
        }
        Object[] nuevaFila = {nombre, apellido, telefono, direccion, correoElectronico, estadoCivil, icono};
        modelo.addRow(nuevaFila);
        campoNombre.setText("");
        campoApellido.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
        campoCorreoElectronico.setText("");
        campoImagen.setText("");
        campoImagen.setText("");
        grupoBotones.clearSelection();
    }//GEN-LAST:event_botonGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCorreoElectronico;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoImagen;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaCorreoElectronico;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaEstadoCivil;
    private javax.swing.JLabel etiquetaIcono;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JRadioButton radioBotonCasado;
    private javax.swing.JRadioButton radioBotonDivorciado;
    private javax.swing.JRadioButton radioBotonSoltero;
    private javax.swing.JRadioButton radioBotonUnionLibre;
    // End of variables declaration//GEN-END:variables
}
