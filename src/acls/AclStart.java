
package acls;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.ImageIcon;


public class AclStart extends javax.swing.JFrame {
        int xMouse,yMouse;
    /**
     * Creates new form AclStart
     */
    public AclStart() {
        initComponents();
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
        URL url=getClass().getResource("icon.png");
        ImageIcon icon=new ImageIcon(url);
        Image image=icon.getImage();
        this.setIconImage(image);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encode = new javax.swing.JLabel();
        Decode = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Dragger = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Encode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/En1.png"))); // NOI18N
        Encode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EncodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EncodeMouseExited(evt);
            }
        });
        getContentPane().add(Encode, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, -1, -1));

        Decode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Dn1.png"))); // NOI18N
        Decode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DecodeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DecodeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DecodeMouseExited(evt);
            }
        });
        getContentPane().add(Decode, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 140, -1, -1));

        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/H1.png"))); // NOI18N
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HelpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HelpMouseExited(evt);
            }
        });
        getContentPane().add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, -1));

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
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 10, -1, -1));

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
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, -1, -1));

        Dragger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/MainGDrag.png"))); // NOI18N
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

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/MainG.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void EncodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncodeMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/En2.png"));
        Encode.setIcon(II);
    }//GEN-LAST:event_EncodeMouseEntered

    private void DecodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecodeMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/Dn2.png"));
        Decode.setIcon(II);
    }//GEN-LAST:event_DecodeMouseEntered

    private void EncodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncodeMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/En1.png"));
        Encode.setIcon(II);
    }//GEN-LAST:event_EncodeMouseExited

    private void DecodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecodeMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/Dn1.png"));
        Decode.setIcon(II);
    }//GEN-LAST:event_DecodeMouseExited

    private void HelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/H2.png"));
        Help.setIcon(II);
    }//GEN-LAST:event_HelpMouseEntered

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/H1.png"));
        Help.setIcon(II);
    }//GEN-LAST:event_HelpMouseExited

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

    private void EncodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncodeMouseClicked
        new EncodeMain().setVisible(true);
    }//GEN-LAST:event_EncodeMouseClicked

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        new help().setVisible(true);
    }//GEN-LAST:event_HelpMouseClicked

    private void DecodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecodeMouseClicked
        new DecodeMain().setVisible(true);
    }//GEN-LAST:event_DecodeMouseClicked

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
            java.util.logging.Logger.getLogger(AclStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AclStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AclStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AclStart.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AclStart().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Decode;
    private javax.swing.JLabel Dragger;
    private javax.swing.JLabel Encode;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel Minimize;
    // End of variables declaration//GEN-END:variables
}
