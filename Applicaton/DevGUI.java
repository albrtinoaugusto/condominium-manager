package Applicaton;

import javax.swing.ImageIcon;


/**
 *
 * @author Albertino Augusto */

public class DevGUI extends javax.swing.JDialog 
{
    int xMouse;
    int yMouse;
            
    public DevGUI(java.awt.Frame parent, boolean modal)
    {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/taskbar_icon.png")).getImage()); // Este código coloca imagem no gestor de tarefas **/    
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        close = new javax.swing.JLabel();
        frameDragg = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Desenvolvedores ");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(426, 2, 20, 16));

        frameDragg.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                frameDraggMouseDragged(evt);
            }
        });
        frameDragg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                frameDraggMousePressed(evt);
            }
        });
        getContentPane().add(frameDragg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 24));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/developers.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 250));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void frameDraggMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggMousePressed
        // Este código pega as posições x e y na tela do monitor **/
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameDraggMousePressed

    private void frameDraggMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggMouseDragged
        // Este código permite esta janela ser arastável e posicionala no lugar desejado **/
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        
        this.setLocation( x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDraggMouseDragged

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        // Este código esconde "fecha" esta a janéla **/
        this.dispose();
    }//GEN-LAST:event_closeMouseReleased


    public static void main(String args[]) 
    {
        
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try 
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Windows".equals(info.getName())) 
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } 
        catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(DevGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(DevGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(DevGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(DevGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run() 
            {
                DevGUI dialog = new DevGUI(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() 
                {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) 
                    {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    private javax.swing.JLabel frameDragg;
    // End of variables declaration//GEN-END:variables
}
