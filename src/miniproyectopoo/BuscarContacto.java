
package miniproyectopoo;

import javax.swing.JPanel;


public class BuscarContacto extends javax.swing.JPanel {
    private VentanaPrincipal ventanaPrincipal;
    private JPanel panelContenedor2;
    private TablaContactos tablaContactos;
    
    public BuscarContacto(VentanaPrincipal ventanaPrincipal,JPanel panelContenedor2) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.panelContenedor2 = panelContenedor2;
               
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();

        jButton1.setText("MENU");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jButton1)
                .addContainerGap(292, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jButton1)
                .addContainerGap(242, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PanelMenu panelMenu = new PanelMenu(ventanaPrincipal);
        panelContenedor2.removeAll(); 
        panelContenedor2.add(panelMenu); 
        panelContenedor2.revalidate(); 
        panelContenedor2.repaint(); 
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
