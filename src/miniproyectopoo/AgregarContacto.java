package miniproyectopoo;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
    private PanelMenu panelMenu;

    public AgregarContacto(VentanaPrincipal ventanaPrincipal, JPanel panelContenedor2, DefaultTableModel modelo) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        this.panelContenedor2 = panelContenedor2;
        this.modelo = modelo;
        grupoBotones = new ButtonGroup();
        grupoBotones.add(radioBotonSoltero);
        grupoBotones.add(radioBotonCasado);
        grupoBotones.add(radioBotonUnionLibre);
        grupoBotones.add(radioBotonDivorciado);
        configurarActionListeners();
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

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        etiquetaTitulo.setFont(new java.awt.Font("Arial Black", 3, 14)); // NOI18N
        etiquetaTitulo.setText("AGREGAR CONTACTO");

        etiquetaNombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaNombre.setText("NOMBRE:");

        etiquetaApellido.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaApellido.setText("APELLIDO:");

        etiquetaTelefono.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaTelefono.setText("TELEFONO:");

        etiquetaCorreoElectronico.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaCorreoElectronico.setText("CORREO ELECTRONICO:");

        etiquetaDireccion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaDireccion.setText("DIRECCION:");

        etiquetaEstadoCivil.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaEstadoCivil.setText("ESTADO CIVIL:");

        botonGuardar.setText("GUARDAR");
        botonGuardar.setFocusable(false);
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setText("CANCELAR");
        botonCancelar.setFocusable(false);
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonMenu.setText("MENU");
        botonMenu.setFocusable(false);
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        etiquetaIcono.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        etiquetaIcono.setText("ICONO:");

        campoTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campoTelefonoKeyTyped(evt);
            }
        });

        radioBotonSoltero.setText("SOLTERO");
        radioBotonSoltero.setFocusable(false);

        radioBotonCasado.setText("CASADO");
        radioBotonCasado.setFocusable(false);

        radioBotonUnionLibre.setText("UNION LIBRE");
        radioBotonUnionLibre.setFocusable(false);

        radioBotonDivorciado.setText("DIVORCIADO");
        radioBotonDivorciado.setFocusable(false);

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
                                .addComponent(radioBotonSoltero)
                                .addGap(18, 18, 18)
                                .addComponent(radioBotonCasado)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBotonUnionLibre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radioBotonDivorciado))
                            .addComponent(campoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonGuardar)
                                .addGap(37, 37, 37)
                                .addComponent(botonCancelar))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaCorreoElectronico)
                        .addGap(18, 18, 18)
                        .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(132, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonGuardar)
                    .addComponent(botonCancelar))
                .addContainerGap(29, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    //GETTERS PARA OBTENER LA INFORMACION DE LOS CAMPOS 
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

    //SETTERS PARA DAR VALOR EN LOS CAMPOS
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

    public void limpiarBotones() {
        grupoBotones.clearSelection();
    }

    //Creamos un metodo de ActionListeners para cada campo, para que capture los eventos y al presionar la tecla enter se guarden los cambios y se añada a la tabla.
    private void configurarActionListeners() {
        campoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        campoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        campoTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        campoCorreoElectronico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        campoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        campoImagen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
    }


    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        panelMenu = new PanelMenu(ventanaPrincipal);
        panelContenedor2.removeAll();
        panelContenedor2.add(panelMenu);
        panelContenedor2.revalidate();
        panelContenedor2.repaint();

    }//GEN-LAST:event_botonMenuActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        String correoIngresado = campoCorreoElectronico.getText();
        if (!correoIngresado.contains("@") || !correoIngresado.endsWith(".com")) {
            JOptionPane.showMessageDialog(this, "El correo electrónico debe contener '@' y terminar con '.com'.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            DefaultTableModel modelo = (DefaultTableModel) ventanaPrincipal.getTablaContactos().getModel();
            String nombre = getCampoNombre();
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

            //RECORREMOS LA FILA DE TABLA, OBTENEMOS LOS VALORES EN LOS CAMPOS DE NOMBRE Y TELEFONO PARA VALIDAR QUE NO HAYAN CONTACTOS CON EL MISMO NOMBRE Y TELEFONO
            for (int i = 0; i < modelo.getRowCount(); i++) {
                String verificarNombre = modelo.getValueAt(i, 0).toString(); //Se tiene que pasar metodo toString para convertir a String el valor obtenido de nuestra tabla de contactos
                String verificarTelefono = modelo.getValueAt(i, 2).toString();
                if (verificarNombre.equals(nombre) && verificarTelefono.equals(telefono)) {
                    JOptionPane.showMessageDialog(panelContenedor2, "Ya se encuentra un contacto creado:  " + nombre + " : " + telefono);
                    return; //SI ENCUENTRA LO MISMO, SALE SIN AGREGAR EL CONTACTO.
                }
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
        }
    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

//ALMACENO EN VARIABLES LOS CAMPOS DE TEXTO, ELIMIANDO ESPACIOS EN BLANCO
        String nombre = campoNombre.getText().trim();
        String apellido = campoApellido.getText().trim();
        String telefono = campoTelefono.getText().trim();
        String direccion = campoDireccion.getText().trim();
        String correoElectronico = campoCorreoElectronico.getText().trim();
        String icono = campoImagen.getText().trim();
        //VALIDACION PARA TODOS LOS CAMPOS SI ESTAN VACIOS!
        if (nombre.isEmpty() && apellido.isEmpty() && telefono.isEmpty() && direccion.isEmpty() && correoElectronico.isEmpty() && icono.isEmpty()) {
            int confirmacion2 = JOptionPane.showConfirmDialog(panelContenedor2, "LOS CAMPOS ESTÁN VACÍOS, ¿QUIERES VOLVER AL MENÚ?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
            if (confirmacion2 == JOptionPane.YES_OPTION) {
                panelMenu = new PanelMenu(ventanaPrincipal);
                panelContenedor2.removeAll();
                panelContenedor2.add(panelMenu);
                panelContenedor2.revalidate();
                panelContenedor2.repaint();
            }
        } //VALIDACION POR SI AL MENOS SE TIENE UN CAMPO CON TEXTO
        else {
            int confirmacion = JOptionPane.showConfirmDialog(panelContenedor2, "¿ESTÁS SEGURO DE CANCELAR?", "CONFIRMACIÓN", JOptionPane.YES_NO_OPTION);
            if (confirmacion == JOptionPane.YES_OPTION) {
                // Limpiar todos los campos
                campoNombre.setText("");
                campoApellido.setText("");
                campoTelefono.setText("");
                campoDireccion.setText("");
                campoCorreoElectronico.setText("");
                campoImagen.setText("");
                grupoBotones.clearSelection();
            } else {
                JOptionPane.showMessageDialog(panelContenedor2, "¡Sigue agregando contactos!");
            }
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String correoIngresado = campoCorreoElectronico.getText();
            if (!correoIngresado.contains("@") || !correoIngresado.endsWith(".com")) {
                JOptionPane.showMessageDialog(this, "El correo electrónico debe contener '@' y terminar con '.com'.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                DefaultTableModel modelo = (DefaultTableModel) ventanaPrincipal.getTablaContactos().getModel();
                String nombre = getCampoNombre();
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

                //RECORREMOS LA FILA DE TABLA, OBTENEMOS LOS VALORES EN LOS CAMPOS DE NOMBRE Y TELEFONO PARA VALIDAR QUE NO HAYAN CONTACTOS CON EL MISMO NOMBRE Y TELEFONO
                for (int i = 0; i < modelo.getRowCount(); i++) {
                    String verificarNombre = modelo.getValueAt(i, 0).toString(); //Se tiene que pasar metodo toString para convertir a String el valor obtenido de nuestra tabla de contactos
                    String verificarTelefono = modelo.getValueAt(i, 2).toString();
                    if (verificarNombre.equals(nombre) && verificarTelefono.equals(telefono)) {
                        JOptionPane.showMessageDialog(panelContenedor2, "Ya se encuentra un contacto creado:  " + nombre + " : " + telefono);
                        return; //SI ENCUENTRA LO MISMO, SALE SIN AGREGAR EL CONTACTO.
                    }
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
            }
        }
    }//GEN-LAST:event_formKeyPressed

    private void campoTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoTelefonoKeyTyped
        char caracter = evt.getKeyChar(); //Se obtiene el caracter que se ingresa
        if (!Character.isDigit(caracter)) { //Validar de que el carcacter que se ingresa no es digito
            evt.consume(); //Se evita que se agrege al campo de texto si no es digito
        }
    }//GEN-LAST:event_campoTelefonoKeyTyped


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
