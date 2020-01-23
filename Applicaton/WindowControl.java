
package Applicaton;

import javax.swing.ImageIcon;

/**
 *
 * @author Albertino Augusto
 */

public class WindowControl extends javax.swing.JFrame
{
    int xMouse;
    int yMouse;

    public WindowControl() 
    {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Images/taskbar_icon.png")).getImage()); // Este código faz com apareça uma imagem no gestor de tarefas.  
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        minimize = new javax.swing.JLabel();
        close = new javax.swing.JLabel();
        menuLabel = new javax.swing.JLabel();
        frameDragg = new javax.swing.JLabel();
        warning = new javax.swing.JLabel();
        information = new javax.swing.JLabel();
        BackgroundMidle = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Controle em Cámeras");
        setMinimumSize(new java.awt.Dimension(1024, 600));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        minimize.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                minimizeMouseReleased(evt);
            }
        });
        getContentPane().add(minimize);
        minimize.setBounds(980, 4, 18, 16);

        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                closeMouseReleased(evt);
            }
        });
        getContentPane().add(close);
        close.setBounds(1001, 4, 18, 16);

        menuLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/vigilance_background.png"))); // NOI18N
        getContentPane().add(menuLabel);
        menuLabel.setBounds(0, 0, 150, 25);

        frameDragg.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        frameDragg.setForeground(new java.awt.Color(204, 204, 204));
        frameDragg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
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
        getContentPane().add(frameDragg);
        frameDragg.setBounds(0, 0, 1024, 25);

        warning.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        warning.setForeground(new java.awt.Color(102, 102, 0));
        getContentPane().add(warning);
        warning.setBounds(360, 0, 70, 25);

        information.setFont(new java.awt.Font("Arial", 0, 11)); // NOI18N
        information.setForeground(new java.awt.Color(204, 204, 204));
        getContentPane().add(information);
        information.setBounds(429, 0, 540, 25);

        BackgroundMidle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/control_background.png"))); // NOI18N
        getContentPane().add(BackgroundMidle);
        BackgroundMidle.setBounds(1, 90, 1022, 460);

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/background.png"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, 0, 1024, 600);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseReleased
        // Este código faz com que a janela seja minimizada 
        this.setState(WindowControl.ICONIFIED);
    }//GEN-LAST:event_minimizeMouseReleased

    private void closeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeMouseReleased
        // Este código faz com que a janela seja fechada 
        if(MainGUI.countFrame == 1)
        {
            MainGUI.countFrame = 0;
            this.dispose();
        }
        else
        {
            this.dispose();
        }
    }//GEN-LAST:event_closeMouseReleased

    private void frameDraggMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggMouseDragged
        // Este código faz com a janela seja arastavel 
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_frameDraggMouseDragged

    private void frameDraggMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_frameDraggMousePressed
        // Este código faz com as posições x e y sejam "Pegadas" pra uma certa ação 
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_frameDraggMousePressed

    public static void main(String args[])
    {
        /* Set the Nimbus look and feel */
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
            java.util.logging.Logger.getLogger(WindowControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } 
        catch (InstantiationException ex) 
        {
            java.util.logging.Logger.getLogger(WindowControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (IllegalAccessException ex) 
        {
            java.util.logging.Logger.getLogger(WindowControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch (javax.swing.UnsupportedLookAndFeelException ex) 
        {
            java.util.logging.Logger.getLogger(WindowControl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new WindowControl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackgroundMidle;
    private javax.swing.JLabel background;
    private javax.swing.JLabel close;
    public static javax.swing.JLabel frameDragg;
    public static javax.swing.JLabel information;
    private javax.swing.JLabel menuLabel;
    private javax.swing.JLabel minimize;
    public static javax.swing.JLabel warning;
    // End of variables declaration//GEN-END:variables
}
