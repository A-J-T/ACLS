
package acls;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ajt
 */
public class DecodeMain extends javax.swing.JFrame {
       int xMouse,yMouse;
    
    static boolean keypattern=false;
    static String encodepath="",decodepath="",encodemessage="", k="", ourKey="";
    static int ykey=0,okey=0,fileSelected=0;
    public DecodeMain() {
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
        ImageIcon icon=new ImageIcon(getClass().getResource("/Gui/icon.png"));
        Image image=icon.getImage();
        this.setIconImage(image);
     }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JPasswordField();
        jTextField5 = new javax.swing.JPasswordField();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Dragger = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        AddC = new javax.swing.JLabel();
        Decode = new javax.swing.JLabel();
        MD5 = new javax.swing.JLabel();
        Background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ACLS");
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 130, 550, -1));

        jTextField4.setText("jPasswordField1");
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 220, -1));

        jTextField5.setText("jPasswordField2");
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 220, -1));

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
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 0, -1, -1));

        Close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/close.png"))); // NOI18N
        Close.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                CloseMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                CloseMouseEntered(evt);
            }
        });
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        Dragger.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/DecodeGDrag.png"))); // NOI18N
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

        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Help.png"))); // NOI18N
        Help.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMouseClicked(evt);
            }
        });
        getContentPane().add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

        AddC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Add.png"))); // NOI18N
        AddC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddCMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddCMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddCMouseEntered(evt);
            }
        });
        getContentPane().add(AddC, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, -1));

        Decode.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/done.png"))); // NOI18N
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
        getContentPane().add(Decode, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        MD5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/md5.png"))); // NOI18N
        MD5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MD5MouseClicked(evt);
            }
        });
        getContentPane().add(MD5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/DecodeG.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void CloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseClicked
          this.dispose();
    }//GEN-LAST:event_CloseMouseClicked

    private void MinimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeMouseClicked
            this.setState(1);
    }//GEN-LAST:event_MinimizeMouseClicked

    private void CloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/close1.png"));
    Close.setIcon(II);
    }//GEN-LAST:event_CloseMouseEntered

    private void CloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseMouseExited
      ImageIcon II=new ImageIcon(getClass().getResource("/Gui/close.png"));
    Close.setIcon(II);
    }//GEN-LAST:event_CloseMouseExited

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

    private void AddCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCMouseClicked
        JFileChooser fc=new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int retValue=fc.showOpenDialog(this);
        if(retValue==JFileChooser.APPROVE_OPTION)
        {
            decodepath=fc.getSelectedFile().getAbsolutePath();
        }
        jTextField3.setText(decodepath);
        fileSelected=1;
    }//GEN-LAST:event_AddCMouseClicked

    private void AddCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/Add1.png"));
    AddC.setIcon(II);
    }//GEN-LAST:event_AddCMouseEntered

    private void AddCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddCMouseExited
       ImageIcon II=new ImageIcon(getClass().getResource("/Gui/Add.png"));
    AddC.setIcon(II);
    }//GEN-LAST:event_AddCMouseExited

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked
        
        new help().setVisible(true);
    }//GEN-LAST:event_HelpMouseClicked

    private void DecodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecodeMouseClicked
        boolean b=false;
        DEOPS.analyseFile();
        fileSelected=DEOPS.getFileSelected();
        System.out.println("1");
        int magicKey=111111111;
        if(DEOPS.getPattern()>1)
        {
            keypattern=true;
            System.out.println("2");
        }
        if(DEOPS.getPattern()==3||DEOPS.getPattern()==6)
        {
            magicKey=000000000;
        }
        if(isKeyPatternSelected())
        {
            if(jTextField4.getText().equals(""))
            {
                b=true;
                System.out.println("3");
            }
            if(jTextField5.getText().equals(""))
            {
                b=true;
                System.out.println("4");
            }
            if(b)
            {
                System.out.println("5");
                JOptionPane.showMessageDialog(null,"Please fill all the fields!","Incomplete Fields",JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                System.out.println("6");
                k=jTextField4.getText();
                ourKey=jTextField5.getText();
                if(!validateKey(k)&&!validateKey(ourKey)&&!DEOPS.verifyKey(Integer.parseInt(ourKey), Integer.parseInt(k),magicKey))
                {
                    System.out.println("7");
                    b=true;
                    JOptionPane.showMessageDialog(null,"Invalid Key!","Key Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    System.out.println("8");
                    ykey=Integer.parseInt(k);
                    okey=Integer.parseInt(ourKey);
                }
            }
        }
        else
        {
            System.out.println("9");
            b=false;
        }
        if(!b)
        {
            System.out.println("10");
            DEOPS.analysePattern();
        }
        else
        {
            System.out.println("11");
            System.out.println("Something fishy!!!");
        }
    }//GEN-LAST:event_DecodeMouseClicked

    private void DecodeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecodeMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/done1.png"));
        Decode.setIcon(II);
    }//GEN-LAST:event_DecodeMouseEntered

    private void DecodeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DecodeMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/done.png"));
        Decode.setIcon(II);
    }//GEN-LAST:event_DecodeMouseExited

    private void MD5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MD5MouseClicked
        // TODO add your handling code here:
        try
        {
            String md5=mD5.getMD5Checksum(decodepath);
            JOptionPane.showMessageDialog(null, "MD5 of configuration: "+md5, "MD5 Checksum", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_MD5MouseClicked
    public static String getEncodeMessage()
    {
        return encodemessage;
    }
    public static String getEncodeFile()
    {
        return encodepath;
    }
    public static String getDecodeFile()
    {
        return decodepath;
    }
    public static int getUserKey()
    {
        return ykey;
    }
    public static int getOurKey()
    {
        return okey;
    }
    public static int isFileSelected()
    {
        return fileSelected;
    }
    public static boolean isKeyPatternSelected()
    {
        return keypattern;
    }
    public static boolean validateKey(String s)
    {
        int count=0;
        boolean b=false;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='0')
            {
                count++;
            }
            if(s.charAt(i)=='1')
            {
                count++;
            }
            if(s.charAt(i)=='2')
            {
                count++;
            }
            if(s.charAt(i)=='3')
            {
                count++;
            }
            if(s.charAt(i)=='4')
            {
                count++;
            }
            if(s.charAt(i)=='5')
            {
                count++;
            }
            if(s.charAt(i)=='6')
            {
                count++;
            }
            if(s.charAt(i)=='7')
            {
                count++;
            }
            if(s.charAt(i)=='8')
            {
                count++;
            }
            if(s.charAt(i)=='9')
            {
                count++;
            }
        }
        if(count==s.length())
        {
           b=true;
        }
        return b;
    }
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
            java.util.logging.Logger.getLogger(DecodeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DecodeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DecodeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DecodeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try{
                    Thread.sleep(5000);
                }catch(Exception e){}
                new DecodeMain().setVisible(true);
            }
        });
    }
    public  void setLocation()
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
    private javax.swing.JLabel AddC;
    private javax.swing.JLabel Background;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Decode;
    private javax.swing.JLabel Dragger;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel MD5;
    private javax.swing.JLabel Minimize;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPasswordField jTextField4;
    private javax.swing.JPasswordField jTextField5;
    // End of variables declaration//GEN-END:variables
}
