/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acls;

import javax.swing.JOptionPane;

/**
 *
 * @author ajt
 */
public class LOPS {
    public static final int ON=1, OFF=0;
    public static String AND(String binaryMessage,String binaryKey)
    {
        String s="";
        int bML=binaryMessage.length();
        int kML=binaryKey.length();
        
        if(kML>bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"0";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"1";
                }
            }
        }
        else if(kML<bML)
        {
            int k=0, m=0, bmc=0;
            boolean b=false;
            if((bML%kML)==0)
            {
                b=true;
            }
            else
            {
                b=false;
            }
            for(int i=0;i<bML/kML;i++)
            {
                for(int j=0;j<kML;j++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(j)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(bmc)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"1";
                    }
                    bmc++;
                }
            }
            if(!b)
            {
                String substring=binaryMessage.substring(bmc);
                for(int i=0;i<substring.length();i++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"1";
                    }
                }
            }
        }
        else if(kML==bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                if(m==OFF&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"0";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"1";
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Logical Error!", "Logical Error", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }
    public static String OR(String binaryMessage,String binaryKey)
    {
        String s="";
        int bML=binaryMessage.length();
        int kML=binaryKey.length();
        if(kML>bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"1";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"1";
                }
            }
        }
        else if(kML<bML)
        {
            int k=0, m=0, bmc=0;
            boolean b=false;
            if((bML%kML)==0)
            {
                b=true;
            }
            else
            {
                b=false;
            }
            for(int i=0;i<bML/kML;i++)
            {
                for(int j=0;j<kML;j++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(j)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(bmc)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"1";
                    }
                    bmc++;
                }
            }
            if(!b)
            {
                String substring=binaryMessage.substring(bmc);
                for(int i=0;i<substring.length();i++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"1";
                    }
                }
            }
        }
        else if(kML==bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"1";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"1";
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Logical Error!", "Logical Error", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }
    public static String NAND(String binaryMessage,String binaryKey)
    {
        String s="";
        int bML=binaryMessage.length();
        int kML=binaryKey.length();
        if(kML>bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"1";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"0";
                }
            }
        }
        else if(kML<bML)
        {
            int k=0, m=0, bmc=0;
            boolean b=false;
            if((bML%kML)==0)
            {
                b=true;
            }
            else
            {
                b=false;
            }
            for(int i=0;i<bML/kML;i++)
            {
                for(int j=0;j<kML;j++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(j)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(bmc)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"0";
                    }
                    bmc++;
                }
            }
            if(!b)
            {
                String substring=binaryMessage.substring(bmc);
                for(int i=0;i<substring.length();i++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"0";
                    }
                }
            }
        }
        else if(kML==bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"1";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"0";
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Logical Error!", "Logical Error", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }
    public static String NOR(String binaryMessage,String binaryKey)
    {
        String s="";
        int bML=binaryMessage.length();
        int kML=binaryKey.length();
        if(kML>bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"0";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"0";
                }
            }
        }
        else if(kML<bML)
        {
            int k=0, m=0, bmc=0;
            boolean b=false;
            if((bML%kML)==0)
            {
                b=true;
            }
            else
            {
                b=false;
            }
            for(int i=0;i<bML/kML;i++)
            {
                for(int j=0;j<kML;j++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(j)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(bmc)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"0";
                    }
                    bmc++;
                }
            }
            if(!b)
            {
                String substring=binaryMessage.substring(bmc);
                for(int i=0;i<substring.length();i++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"0";
                    }
                }
            }
        }
        else if(kML==bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"0";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"0";
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Logical Error!", "Logical Error", JOptionPane.ERROR_MESSAGE);
        }
        return s;
    }
    public static String EXOR(String binaryMessage,String binaryKey)
    {
        String s="";
        int bML=binaryMessage.length();
        int kML=binaryKey.length();
        if(kML>bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"1";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"0";
                }
            }
        }
        else if(kML<bML)
        {
            int k=0, m=0, bmc=0;
            boolean b=false;
            if((bML%kML)==0)
            {
                b=true;
            }
            else
            {
                b=false;
            }
            for(int i=0;i<bML/kML;i++)
            {
                for(int j=0;j<kML;j++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(j)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(bmc)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"0";
                    }
                    bmc++;
                }
            }
            if(!b)
            {
                String substring=binaryMessage.substring(bmc);
                for(int i=0;i<substring.length();i++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"0";
                    }
                }
            }
        }
        else if(kML==bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"1";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"0";
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Logical Error!", "Logical Error", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("EXOR: "+s);
        return s;
    }
    public static String EXNOR(String binaryMessage,String binaryKey)
    {
        String s="";
        int bML=binaryMessage.length();
        int kML=binaryKey.length();
        System.out.println("Message: "+binaryMessage+"\nBinary Key: "+binaryKey);
        if(kML>bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"0";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"1";
                }
            }
        }
        else if(kML<bML)
        {
            int k=0, m=0, bmc=0;
            boolean b=false;
            if((bML%kML)==0)
            {
                b=true;
            }
            else
            {
                b=false;
            }
            for(int i=0;i<bML/kML;i++)
            {
                for(int j=0;j<kML;j++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(j)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(bmc)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"1";
                    }
                    bmc++;
                }
            }
            if(!b)
            {
                String substring=binaryMessage.substring(bmc);
                for(int i=0;i<substring.length();i++)
                {
                    k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                    m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                    if(m==OFF&&k==OFF)
                    {
                        s=s+"1";
                    }
                    if(m==OFF&&k==ON)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==OFF)
                    {
                        s=s+"0";
                    }
                    if(m==ON&&k==ON)
                    {
                        s=s+"1";
                    }
                }
            }
        }
        else if(kML==bML)
        {
            int k=0, m=0;
            for(int i=0;i<bML;i++)
            {
                k=Integer.parseInt(Character.toString(binaryKey.charAt(i)));
                m=Integer.parseInt(Character.toString(binaryMessage.charAt(i)));
                
                if(m==OFF&&k==OFF)
                {
                    s=s+"1";
                }
                if(m==OFF&&k==ON)
                {
                    s=s+"0";
                }
                if(m==ON&&k==OFF)
                {
                    s=s+"0";
                }
                if(m==ON&&k==ON)
                {
                    s=s+"1";
                }
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Logical Error!", "Logical Error", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println("EXNOR: "+s);
        return s;
    }
}
