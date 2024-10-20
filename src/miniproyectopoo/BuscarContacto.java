
package miniproyectopoo;

import javax.swing.JPanel;


public class BuscarContacto extends javax.swing.JPanel {
    private VentanaPrincipal ventanaPrincipal;
    private JPanel panelContenedor2;
    
    public BuscarContacto(VentanaPrincipal ventanaPrincipal,JPanel panelContenedor2) {
        this.ventanaPrincipal = ventanaPrincipal;
        this.panelContenedor2 = panelContenedor2;
               
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
