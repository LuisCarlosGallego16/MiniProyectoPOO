package miniproyectopoo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author luisc
 */
public class EditarContacto extends javax.swing.JPanel {

    private ButtonGroup grupoBotones;
    private JPanel panelContenedor2;
    private VentanaPrincipal ventanaPrincipal;
    private TablaContactos tablaContactos;
    private PanelMenu panelMenu;

    public EditarContacto(VentanaPrincipal ventanaPrincipal, JPanel panelContenedor2) {
        initComponents();
        this.ventanaPrincipal = ventanaPrincipal;
        this.panelContenedor2 = panelContenedor2;

        grupoBotones = new ButtonGroup();
        grupoBotones.add(radioBotonSoltero);
        grupoBotones.add(radioBotonCasado);
        grupoBotones.add(radioBotonUnionLibre);
        grupoBotones.add(radioBotonDivorciado);
        configurarActionListeners();
    }

    //GETTERS PARA LOS CAMPOS
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
        return campoIcono.getText();
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

    //SETTERS PARA LOS CAMPOS
    public void setCampoNombre(String nombre) {
        campoNombre.setText(nombre);
    }

    public void setCampoApellido(String apellido) {
        campoApellido.setText(apellido);
    }

    public void setCampoTelefono(String telefono) {
        campoTelefono.setText(telefono);

    }

    public void setCampoCorreoElectronico(String correo) {
        campoCorreoElectronico.setText(correo);
    }

    public void setCampoDireccion(String direccion) {
        campoDireccion.setText(direccion);
    }

    public void setCampoIcono(String icono) {
        campoIcono.setText(icono);
    }

    public void setEstadoCivil(String estadoCivil) {
        switch (estadoCivil) {
            case "Soltero":
                radioBotonSoltero.setSelected(true);
                break;
            case "Casado":
                radioBotonCasado.setSelected(true);
                break;
            case "Union Libre":
                radioBotonUnionLibre.setSelected(true);
                break;
            case "Divoriciado":
                radioBotonDivorciado.setSelected(true);
                break;
            default:
                limpiarBotones(); // Limpia los botones si no hay coincidencia
                break;
        }
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

        campoIcono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonMenu = new javax.swing.JButton();
        etiquetaTitulo = new javax.swing.JLabel();
        etiquetaNombre = new javax.swing.JLabel();
        etiquetaApellido = new javax.swing.JLabel();
        etiquetaTelefono = new javax.swing.JLabel();
        etiquetaCorreoElectronico = new javax.swing.JLabel();
        etiquetaDireccion = new javax.swing.JLabel();
        etiquetaEstadoCivil = new javax.swing.JLabel();
        etiquetaImagen = new javax.swing.JLabel();
        radioBotonSoltero = new javax.swing.JRadioButton();
        radioBotonCasado = new javax.swing.JRadioButton();
        radioBotonUnionLibre = new javax.swing.JRadioButton();
        radioBotonDivorciado = new javax.swing.JRadioButton();
        campoNombre = new javax.swing.JTextField();
        campoApellido = new javax.swing.JTextField();
        campoTelefono = new javax.swing.JTextField();
        campoCorreoElectronico = new javax.swing.JTextField();
        campoDireccion = new javax.swing.JTextField();
        campoIcono = new javax.swing.JTextField();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();

        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });

        botonMenu.setText("MENU");
        botonMenu.setFocusable(false);
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });

        etiquetaTitulo.setText("EDITAR CONTACTO");
        etiquetaTitulo.setFocusable(false);

        etiquetaNombre.setText("NOMBRE:");
        etiquetaNombre.setFocusable(false);

        etiquetaApellido.setText("APELLIDO:");
        etiquetaApellido.setFocusable(false);

        etiquetaTelefono.setText("TELEFONO:");
        etiquetaTelefono.setFocusable(false);

        etiquetaCorreoElectronico.setText("CORREO ELECTRONICO:");
        etiquetaCorreoElectronico.setFocusable(false);

        etiquetaDireccion.setText("DIRECCION");
        etiquetaDireccion.setFocusable(false);

        etiquetaEstadoCivil.setText("ESTADO CIVIL");
        etiquetaEstadoCivil.setFocusable(false);

        etiquetaImagen.setText("ICONO");
        etiquetaImagen.setFocusable(false);

        radioBotonSoltero.setText("SOLTERO");
        radioBotonSoltero.setFocusable(false);

        radioBotonCasado.setText("CASADO");
        radioBotonCasado.setFocusable(false);

        radioBotonUnionLibre.setText("UNION LIBRE");
        radioBotonUnionLibre.setFocusable(false);

        radioBotonDivorciado.setText("DIVORCIADO");
        radioBotonDivorciado.setFocusable(false);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(botonMenu)
                .addGap(134, 134, 134)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaEstadoCivil)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaImagen)
                        .addGap(18, 18, 18)
                        .addComponent(campoIcono, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etiquetaApellido)
                            .addComponent(etiquetaTelefono)
                            .addComponent(etiquetaCorreoElectronico)
                            .addComponent(etiquetaNombre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(etiquetaDireccion)
                        .addGap(18, 18, 18)
                        .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(103, 103, 103)
                                .addComponent(radioBotonSoltero))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(botonGuardar)
                                .addGap(11, 11, 11)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(radioBotonCasado)
                                .addGap(18, 18, 18)
                                .addComponent(radioBotonUnionLibre)
                                .addGap(18, 18, 18)
                                .addComponent(radioBotonDivorciado))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addComponent(botonCancelar)))))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTitulo)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                            .addComponent(campoApellido)
                            .addComponent(campoTelefono))))
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(etiquetaTitulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(botonMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaNombre)
                            .addComponent(campoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etiquetaApellido)
                            .addComponent(campoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etiquetaTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCorreoElectronico)
                    .addComponent(campoCorreoElectronico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaDireccion)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaEstadoCivil)
                    .addComponent(radioBotonSoltero)
                    .addComponent(radioBotonCasado)
                    .addComponent(radioBotonUnionLibre)
                    .addComponent(radioBotonDivorciado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaImagen)
                    .addComponent(campoIcono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed
        PanelMenu panelMenu = new PanelMenu(ventanaPrincipal);
        panelContenedor2.removeAll();
        panelContenedor2.add(panelMenu);
        panelContenedor2.revalidate();
        panelContenedor2.repaint();
    }//GEN-LAST:event_botonMenuActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        int filaSeleccionada = ventanaPrincipal.getTablaContactos().getSelectedRow();
        if (filaSeleccionada != -1) {
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

            modelo.setValueAt(nombre, filaSeleccionada, 0);
            modelo.setValueAt(apellido, filaSeleccionada, 1);
            modelo.setValueAt(telefono, filaSeleccionada, 2);
            modelo.setValueAt(direccion, filaSeleccionada, 3);
            modelo.setValueAt(correoElectronico, filaSeleccionada, 4);
            modelo.setValueAt(estadoCivil, filaSeleccionada, 5);
            modelo.setValueAt(icono, filaSeleccionada, 6);
            campoNombre.setText("");
            campoApellido.setText("");
            campoTelefono.setText("");
            campoDireccion.setText("");
            campoCorreoElectronico.setText("");
            campoIcono.setText("");
            grupoBotones.clearSelection();
        }else{
            System.out.println("elije un contacto");
        }


    }//GEN-LAST:event_botonGuardarActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        //ALMACENO EN VARIABLES LOS CAMPOS DE TEXTO, ELIMIANDO ESPACIOS EN BLANCO
        String nombre = campoNombre.getText().trim();
        String apellido = campoApellido.getText().trim();
        String telefono = campoTelefono.getText().trim();
        String direccion = campoDireccion.getText().trim();
        String correoElectronico = campoCorreoElectronico.getText().trim();
        String icono = campoIcono.getText().trim();
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
                campoIcono.setText("");
                grupoBotones.clearSelection();
            } else {
                JOptionPane.showMessageDialog(panelContenedor2, "¡Sigue agregando contactos!");
            }
        }
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            int filaSeleccionada = ventanaPrincipal.getTablaContactos().getSelectedRow();
            if (filaSeleccionada != 1) {
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

                modelo.setValueAt(nombre, filaSeleccionada, 0);
                modelo.setValueAt(apellido, filaSeleccionada, 1);
                modelo.setValueAt(telefono, filaSeleccionada, 2);
                modelo.setValueAt(direccion, filaSeleccionada, 3);
                modelo.setValueAt(correoElectronico, filaSeleccionada, 4);
                modelo.setValueAt(estadoCivil, filaSeleccionada, 5);
                modelo.setValueAt(icono, filaSeleccionada, 6);

                campoNombre.setText("");
                campoApellido.setText("");
                campoTelefono.setText("");
                campoDireccion.setText("");
                campoCorreoElectronico.setText("");
                campoIcono.setText("");
                grupoBotones.clearSelection();
            }

        }


    }//GEN-LAST:event_formKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonMenu;
    private javax.swing.JTextField campoApellido;
    private javax.swing.JTextField campoCorreoElectronico;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoIcono;
    private javax.swing.JTextField campoNombre;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel etiquetaApellido;
    private javax.swing.JLabel etiquetaCorreoElectronico;
    private javax.swing.JLabel etiquetaDireccion;
    private javax.swing.JLabel etiquetaEstadoCivil;
    private javax.swing.JLabel etiquetaImagen;
    private javax.swing.JLabel etiquetaNombre;
    private javax.swing.JLabel etiquetaTelefono;
    private javax.swing.JLabel etiquetaTitulo;
    private javax.swing.JRadioButton radioBotonCasado;
    private javax.swing.JRadioButton radioBotonDivorciado;
    private javax.swing.JRadioButton radioBotonSoltero;
    private javax.swing.JRadioButton radioBotonUnionLibre;
    // End of variables declaration//GEN-END:variables

    private String getEstadoCivil() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
