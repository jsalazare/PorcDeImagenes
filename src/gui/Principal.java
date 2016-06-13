/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;


import utiles.ProcImagenes;

/**
 *
 * @author javi_
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setSize(1300, 700);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        abrirMenuItem = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        crearMenuItem = new javax.swing.JMenu();
        circuloMenuItem = new javax.swing.JMenuItem();
        cuadradoMenuItem = new javax.swing.JMenuItem();
        grisesMenuItem = new javax.swing.JMenuItem();
        coloresMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fileMenu.setMnemonic('f');
        fileMenu.setText("Archivo");

        abrirMenuItem.setMnemonic('o');
        abrirMenuItem.setText("Abrir Imágen");
        abrirMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                abrirMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(abrirMenuItem);

        jMenuItem1.setText("Segmentar Video");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        fileMenu.add(jMenuItem1);

        crearMenuItem.setText("Crear");

        circuloMenuItem.setText("Circulo");
        circuloMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                circuloMenuItemActionPerformed(evt);
            }
        });
        crearMenuItem.add(circuloMenuItem);

        cuadradoMenuItem.setText("Cuadrado");
        cuadradoMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuadradoMenuItemActionPerformed(evt);
            }
        });
        crearMenuItem.add(cuadradoMenuItem);

        grisesMenuItem.setText("Degradado Grises");
        grisesMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grisesMenuItemActionPerformed(evt);
            }
        });
        crearMenuItem.add(grisesMenuItem);

        coloresMenuItem.setText("Degradado Colores");
        coloresMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                coloresMenuItemActionPerformed(evt);
            }
        });
        crearMenuItem.add(coloresMenuItem);

        fileMenu.add(crearMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 732, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 478, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);//fsdfdsfds
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void abrirMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_abrirMenuItemActionPerformed
        // TODO add your handling code here:
        ProcImagenes p2 = new ProcImagenes();
        p2.abrirImagen(this);
        Editar ed = new Editar(p2);
        desktopPane.add(ed);
        ed.setVisible(true);
    
    }//GEN-LAST:event_abrirMenuItemActionPerformed

    private void circuloMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_circuloMenuItemActionPerformed
        // TODO add your handling code here:
        Crear cr = new Crear("circulo");
        desktopPane.add(cr);
        cr.setVisible(true);
       
    }//GEN-LAST:event_circuloMenuItemActionPerformed

    private void cuadradoMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuadradoMenuItemActionPerformed
        // TODO add your handling code here:
        Crear cr = new Crear("cuadrado");
        desktopPane.add(cr);
        cr.setVisible(true);
        
    }//GEN-LAST:event_cuadradoMenuItemActionPerformed

    private void grisesMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grisesMenuItemActionPerformed
        // TODO add your handling code here:
          Crear cr = new Crear("grises");
        desktopPane.add(cr);
        cr.setVisible(true);
        
    }//GEN-LAST:event_grisesMenuItemActionPerformed

    private void coloresMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_coloresMenuItemActionPerformed
        Crear cr = new Crear("colores");
        desktopPane.add(cr);
        cr.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_coloresMenuItemActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        VentanaVideo video = new VentanaVideo();
        video.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem abrirMenuItem;
    private javax.swing.JMenuItem circuloMenuItem;
    private javax.swing.JMenuItem coloresMenuItem;
    private javax.swing.JMenu crearMenuItem;
    private javax.swing.JMenuItem cuadradoMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenuItem grisesMenuItem;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}
