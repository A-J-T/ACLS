/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acls;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author ajt
 */
public class ENOPS {
    static String cFilePath="";
    public static String adjustSubstring(String message)
    {
        String s="";
        int count=0;
        for(int i=0;i<message.length();i++)
        {
            if(message.charAt(i)=='1')
            {
                s=s+"1";
            }
            if(message.charAt(i)=='0')
            {
                s=s+"0";
            }
        }
        if(message.length()<9)
        {
            int zeroes=9-message.length();
            for(int i=0;i<zeroes;i++)
            {
                s=s+"0";
            }
        }
        return s;
    }
    public static String getASCIIBinaryString(String message)
    {
        StringBuffer s=new StringBuffer("");
        for(int i=0;i<message.length();i++)
        {
            char c=message.charAt(i);
            int v=(int)c;
            String bString=(Integer.toBinaryString(v));
            String as=adjustASCIIBinaryString(bString);
            s.append(as);
        }
        return s.toString();
    }
    public static String getUNICODEBinaryString(String message)
    {
        StringBuffer s=new StringBuffer("");
        String as;
        for(int i=0;i<message.length();i++)
        {
            char c=message.charAt(i);
            int v=(int)c;
            String bString=(Integer.toBinaryString(v));
            as=bString;
            as=adjustUNICODEBinaryString(bString);
            s.append(as);
        }
        return s.toString();
    }
    public static String adjustASCIIBinaryString(String message)
    {
        String rs="";
        if(message.length()==1)
        {
            rs="00000000"+message;
        }
        if(message.length()==2)
        {
            rs="0000000"+message;
        }
        if(message.length()==3)
        {
            rs="000000"+message;
        }
        if(message.length()==4)
        {
            rs="00000"+message;
        }
        if(message.length()==5)
        {
            rs="0000"+message;
        }
        if(message.length()==6)
        {
            rs="000"+message;
        }
        if(message.length()==7)
        {
            rs="00"+message;
        }
        if(message.length()==8)
        {
            rs="0"+message;
        }
        return rs;
    }
    public static String adjustUNICODEBinaryString(String message)
    {
       String ret="";
       if(message.length()==1)
       {
           ret="00000000000000000"+message;
       }
       if(message.length()==2)
       {
           ret="0000000000000000"+message;
       }
       if(message.length()==3)
       {
           ret="000000000000000"+message;
       }
       if(message.length()==4)
       {
           ret="00000000000000"+message;
       }
       if(message.length()==5)
       {
           ret="0000000000000"+message;
       }
       if(message.length()==6)
       {
           ret="000000000000"+message;
       }
       if(message.length()==7)
       {
           ret="00000000000"+message;
       }
       if(message.length()==8)
       {
           ret="0000000000"+message;
       }
       if(message.length()==9)
       {
           ret="000000000"+message;
       }
       if(message.length()==10)
       {
           ret="00000000"+message;
       }
       if(message.length()==11)
       {
           ret="0000000"+message;
       }
       if(message.length()==12)
       {
           ret="000000"+message;
       }
       if(message.length()==13)
       {
           ret="00000"+message;
       }
       if(message.length()==14)
       {
           ret="0000"+message;
       }
       if(message.length()==15)
       {
           ret="000"+message;
       }
       if(message.length()==16)
       {
           ret="00"+message;
       }
       if(message.length()==17)
       {
           ret="0"+message;
       }
       return ret;
    }
    public static void encryptBits(File f,String substring)
    {
        int ur=0, uw=0, ux=0, gr=0, gw=0, gx=0, or=0, ow=0, ox=0;
        if(substring.charAt(0)=='1')
        {
            ur=1;
        }
        else
        {
            ur=0;
        }
        if(substring.charAt(1)=='1')
        {
            uw=1;
        }
        else
        {
            uw=0;
        }
        if(substring.charAt(2)=='1')
        {
            ux=1;
        }
        else
        {
            ux=0;
        } 
        if(substring.charAt(3)=='1')
        {
            gr=1;
        }
        else
        {
            gr=0;
        } 
        if(substring.charAt(4)=='1')
        {
            gw=1;
        }
        else
        {
            gw=0;
        }
        if(substring.charAt(5)=='1')
        {
            gx=1;
        }
        else
        {
            gx=0;
        } 
        if(substring.charAt(6)=='1')
        {
            or=1;
        }
        else
        {
            or=0;
        } 
        if(substring.charAt(7)=='1')
        {
            ow=1;
        }
        else
        {
            ow=0;
        } 
        if(substring.charAt(8)=='1')
        {
            ox=1;
        }
        else
        {
            ox=0;
        }
        Permission.setCustomPermission(f, ur, uw, ux, gr, gw, gx, or, ow, ox);
    }
    public static void createFile(File f)
    {
        try
        {
           f.createNewFile();
        }catch(IOException e)
        {
           System.out.println("Error: "+e.getMessage());
        }
    }
    public static void writeCFile(int nOF)
    {
        File f=new File(EncodeMain.getPath()+"/configuration");
        cFilePath=f.getAbsolutePath();
        try
        {
            f.createNewFile();
        }catch(IOException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
        FileWriter fwriter;
        String write="Path:"+EncodeMain.getPath()+"/|FI:"+EncodeMain.getFileName()+"|NOF:"+nOF+"|P:"+EncodeMain.getPattern()+"|CE:"+EncodeMain.getCharacterEncoding()+"|File:"+DecodeMain.isFileSelected()+"|";
        PrintWriter outputFile;
        try
        {
            fwriter=new FileWriter(EncodeMain.getPath()+"/configuration");
            outputFile=new PrintWriter(fwriter);
            outputFile.print(write);
            outputFile.close();
        }catch(IOException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
    public static int getDifference(int magicKey,int userKey)
    {
        return (magicKey-userKey);
    }
}
