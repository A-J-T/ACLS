/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acls;

import static acls.DecodeMain.encodemessage;
import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author ajt
 */
public class EncodeMain extends javax.swing.JFrame {
    int xMouse,yMouse;
    /**
     * Creates new form EncodeMain
     */
    static boolean keypattern=false;
    DefaultListModel m;
    public static final int ASCII=0, UNICODE=1, PATTERN1=0,PATTERN2=1,PATTERN3=2,PATTERN4=3,PATTERN5=4,PATTERN6=5,PATTERN7=6,PATTERN8=7;
    public static String fni="", key="", path="", encodemessage="", decodepath="", encodepath="";
    public static int ce=0, pattern=0, ykey=0, okey=0, fileSelected=0;
    public EncodeMain() {
        m=new DefaultListModel();
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
        URL url=getClass().getResource("icon.png");
        ImageIcon icon=new ImageIcon(url);
        Image image=icon.getImage();
        this.setIconImage(image);
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox2 = new javax.swing.JComboBox();
        jComboBox1 = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        AddF1 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        AddF = new javax.swing.JLabel();
        Help = new javax.swing.JLabel();
        Done = new javax.swing.JLabel();
        Minimize = new javax.swing.JLabel();
        Close = new javax.swing.JLabel();
        Drager = new javax.swing.JLabel();
        BackSet = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ACLS");
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Pattern 1", "Pattern 2", "Pattern 3", "Pattern 4", "Pattern 5", "Pattern 6", "Pattern 7", "Pattern 8" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 480, 94, -1));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "ASCII", "UNICODE" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 430, 94, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 250, 370, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 370, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 370, -1));

        AddF1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Add.png"))); // NOI18N
        AddF1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddF1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddF1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddF1MouseExited(evt);
            }
        });
        getContentPane().add(AddF1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 500, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 500, -1));

        AddF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Add.png"))); // NOI18N
        AddF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddFMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddFMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddFMouseExited(evt);
            }
        });
        getContentPane().add(AddF, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, -1, -1));

        Help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/Help.png"))); // NOI18N
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
        getContentPane().add(Help, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 470, -1, -1));

        Done.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/done.png"))); // NOI18N
        Done.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DoneMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DoneMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DoneMouseExited(evt);
            }
        });
        getContentPane().add(Done, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, -1, -1));

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
        getContentPane().add(Minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 0, -1, -1));

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
        getContentPane().add(Close, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 0, -1, -1));

        Drager.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/EncodeGDrag.png"))); // NOI18N
        Drager.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragerMouseDragged(evt);
            }
        });
        Drager.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragerMousePressed(evt);
            }
        });
        getContentPane().add(Drager, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        BackSet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/EncodeG.png"))); // NOI18N
        getContentPane().add(BackSet, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AddFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFMouseClicked
        JFileChooser fc=new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int retValue=fc.showOpenDialog(this);
        if(retValue==JFileChooser.APPROVE_OPTION)
        {
            path=fc.getSelectedFile().getPath();
        }
        jTextField3.setText(path);
    }//GEN-LAST:event_AddFMouseClicked

    private void AddFMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/Add1.png"));
        AddF.setIcon(II);
        AddF.setToolTipText("Set Location to store file");
    }//GEN-LAST:event_AddFMouseEntered

    private void AddFMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddFMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/Add.png"));
        AddF.setIcon(II);
    }//GEN-LAST:event_AddFMouseExited

    private void HelpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseClicked

        new help().setVisible(true);
    }//GEN-LAST:event_HelpMouseClicked

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

    private void DoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneMouseClicked
        boolean b=false;
        if(jTextField1.getText().equals(""))
        {
            b=true;
        }
        if(jTextField3.getText().equals(""))
        {
            b=true;
        }
        if(!EncodeMain.validateKey(jTextField2.getText()))
        {
            b=true;
            JOptionPane.showMessageDialog(null, "Invalid Key", "Key Error", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
        fni=jTextField1.getText();
        key=jTextField2.getText();
        path=jTextField3.getText();
        ce=jComboBox1.getSelectedIndex();
        pattern=jComboBox2.getSelectedIndex();
        encodemessage=jTextField4.getText();
        if(EncodeMain.getPattern()==EncodeMain.PATTERN1)
        {
            pattern1.setPattern(encodemessage);
        }
        if(EncodeMain.getPattern()==EncodeMain.PATTERN2)
        {
            pattern2.setPattern(encodemessage);
        }
        if(EncodeMain.getPattern()==EncodeMain.PATTERN3)
        {
            keypattern=true;
            pattern3.setPattern(encodemessage);
        }
        if(EncodeMain.getPattern()==EncodeMain.PATTERN4)
        {
            keypattern=true;
            pattern4.setPattern(encodemessage);
        }
        if(EncodeMain.getPattern()==EncodeMain.PATTERN5)
        {
            keypattern=true;
            pattern5.setPattern(encodemessage);
        }
        if(EncodeMain.getPattern()==EncodeMain.PATTERN6)
        {
            keypattern=true;
            pattern6.setPattern(encodemessage);
        }
        if(EncodeMain.getPattern()==EncodeMain.PATTERN7)
        {
            keypattern=true;
            pattern7.setPattern(encodemessage);
        }
        if(EncodeMain.getPattern()==EncodeMain.PATTERN8)
        {
            keypattern=true;
            pattern8.setPattern(encodemessage);
        }
        try
        {
            String md5=mD5.getMD5Checksum(ENOPS.cFilePath);
            JOptionPane.showMessageDialog(null, "MD5 of Configuration: "+md5, "MD5 Checksum", JOptionPane.INFORMATION_MESSAGE);
        }catch(Exception e)
        {
            
        }
        }
        if(pattern>1)
        {
            if(key.equals(""))
            {
                new Error1().setVisible(true);
                b=true;
            }
        }
        if(b)
        {
           new Error2().setVisible(true);
        }
        else
        {
            this.dispose();
        }
    }//GEN-LAST:event_DoneMouseClicked

    private void DragerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragerMouseDragged
        int x=evt.getXOnScreen();
        int y=evt.getYOnScreen();
        
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_DragerMouseDragged

    private void DragerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_DragerMousePressed

    private void DoneMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/done1.png"));
        Done.setIcon(II);
        Done.setToolTipText("Start Encoding");
    }//GEN-LAST:event_DoneMouseEntered

    private void DoneMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DoneMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/done.png"));
        Done.setIcon(II);
    }//GEN-LAST:event_DoneMouseExited

    private void HelpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/help1.png"));
        Help.setIcon(II);
        Help.setToolTipText("Need Help ?");
    }//GEN-LAST:event_HelpMouseEntered

    private void HelpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/help.png"));
        Help.setIcon(II);
    }//GEN-LAST:event_HelpMouseExited

    private void AddF1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddF1MouseClicked
        jTextField4.setEnabled(false);
        JFileChooser fc=new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int retValue=fc.showOpenDialog(this);
        if(retValue==JFileChooser.APPROVE_OPTION)
        {
            decodepath=fc.getSelectedFile().getAbsolutePath();
        }
        jTextField2.setText(decodepath);
        fileSelected=1;
    }//GEN-LAST:event_AddF1MouseClicked

    private void AddF1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddF1MouseEntered
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/Add1.png"));
        AddF1.setIcon(II);
    }//GEN-LAST:event_AddF1MouseEntered

    private void AddF1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddF1MouseExited
        ImageIcon II=new ImageIcon(getClass().getResource("/Gui/Add.png"));
        AddF1.setIcon(II);
    }//GEN-LAST:event_AddF1MouseExited
    public static String getFileName()
    {
        return fni;
    }
    public static String getKey()
    {
        return key;
    }
    public static String getPath()
    {
        return path;
    }
    public static int getCharacterEncoding()
    {
        return ce;
    }
    public static int getPattern()
    {
        return pattern;
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
            java.util.logging.Logger.getLogger(EncodeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EncodeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EncodeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EncodeMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EncodeMain().setVisible(true);
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
    private javax.swing.JLabel AddF;
    private javax.swing.JLabel AddF1;
    private javax.swing.JLabel BackSet;
    private javax.swing.JLabel Close;
    private javax.swing.JLabel Done;
    private javax.swing.JLabel Drager;
    private javax.swing.JLabel Help;
    private javax.swing.JLabel Minimize;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
