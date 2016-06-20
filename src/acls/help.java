/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acls;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author ajt
 */
public class help extends javax.swing.JFrame {
    int xMouse,yMouse;
    /**
     * Creates new form help
     */
    public help() {
        initComponents();
        setLocation();
        CursorC();
        Icon();
    }

    public void CursorC()
    {
        Toolkit tk= Toolkit.getDefaultToolkit();
        Image img=tk.getImage("CursorP.png");
        Point p=new Point(0,0);
        Cursor cu=tk.createCustomCursor(img, p, "cu");
        setCursor(cu);
    }
    public void Icon()
     {
        URL url=getClass().getResource("/Gui/icon.png");
        ImageIcon icon=new ImageIcon(url);
        Image image=icon.getImage();
        this.setIconImage(image);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Close = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Dragger = new javax.swing.JLabel();
        H = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACLS");
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/close.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, -1, -1));

        Minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/min.png"))); // NOI18N
        Minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MinimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MinimizeMouseExited(evt);
            }
        });
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 0, -1, -1));

        Dragger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/HelpDrag.png"))); // NOI18N
        Dragger.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DraggerMouseDragged(evt);
            }
        });
        Dragger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DraggerMousePressed(evt);
            }
        });
        getContentPane().add(Dragger, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        H.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Helpp.png"))); // NOI18N
        getContentPane().add(H, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
        this.dispose();
        
    }//GEN-LAST:event_CloseMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/close1.png"));
        Close.setIcon(II);
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/close.png"));
        Close.setIcon(II);
    }//GEN-LAST:event_CloseMouseExited

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
        this.setState(1);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void MinimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/min1.png"));
        Minimize.setIcon(II);
    }//GEN-LAST:event_MinimizeMouseEntered

    private void MinimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/min.png"));
        Minimize.setIcon(II);
    }//GEN-LAST:event_MinimizeMouseExited

    private void DraggerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DraggerMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_DraggerMouseDragged

    private void DraggerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DraggerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_DraggerMousePressed

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
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(help.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new help().setVisible(true);
            }
        });
    }
    public void setLocation()
    {
        int screenHeight, screenWidth, frameHeight, frameWidth, screenHeightHalf, screenWidthHalf, frameHeightHalf, frameWidthHalf;
        
        screenHeight=Toolkit.getDefaultToolkit().getScreenSize().height;
        screenWidth=Toolkit.getDefaultToolkit().getScreenSize().width;
        screenHeightHalf=screenHeight/2;
        screenWidthHalf=screenWidth/2;
        
        frameHeight=getHeight();
        frameWidth=getWidth();
        frameHeightHalf=frameHeight/2;
        frameWidthHalf=frameWidth/2;
        
        int x, y;
        x=screenWidthHalf-frameWidthHalf;
        y=screenHeightHalf-frameHeightHalf;
        
        this.setLocation(x, y);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Dragger;
    private javax.swing.JLabel H;
    private javax.swing.JLabel Minimize;
    // End of variables declaration//GEN-END:variables
}
