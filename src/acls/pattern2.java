/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acls;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Vector;
import javax.swing.JOptionPane;

/**
 *
 * @author ajt
 */
public class pattern2 {
    static String fni, path, key, fTE;
    static int pattern, ce, nOF;
    static File f;
    public static void setPattern(String message)
    {
        fni=EncodeMain.getFileName();
        path=EncodeMain.getPath();
        key=EncodeMain.getKey();
        fTE=DecodeMain.getEncodeFile();
        ce=EncodeMain.getCharacterEncoding();
        if(ce==EncodeMain.ASCII)
        {
            singlePathASCII(message);
        }
        else if(ce==EncodeMain.UNICODE)
        {
            singlePathUNICODE(message);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Invalid/Unknown Encoding","Encoding Error",JOptionPane.ERROR_MESSAGE);
        }
        if(DecodeMain.isFileSelected()==1)
        {
            encodeFile(DecodeMain.getEncodeFile());
        }
        ENOPS.writeCFile(nOF);
    }
    public static void singlePathASCII(String message)
    {
        int start=0,end=0;
        String binaryString=ENOPS.getASCIIBinaryString(message);
        int bLength=binaryString.length();
        if(bLength%9==0)
        {
            nOF=bLength/9;
        }
        else
        {
            nOF=bLength/9;
            nOF++;
        }
        int count=0;
        for(int i=0;i<bLength/9;i++)
        {
            start=end;
            end=end+9;
            String substring=binaryString.substring(start, end);
            f=new File(path+"/"+fni+""+count);
            ENOPS.createFile(f);
            encryptBits(f,substring);
            count++;
        }
        if(bLength%9!=0)
        {
            String substring=binaryString.substring(end);
            substring=ENOPS.adjustASCIIBinaryString(substring);
            f=new File(path+"/"+fni+""+count);
            ENOPS.createFile(f);
            encryptBits(f,substring);
            count++;
        }
    }
    public static void singlePathUNICODE(String message)
    {
        int start=0,end=0;
        String binaryString=ENOPS.getUNICODEBinaryString(message);
        int bLength=binaryString.length();
        if(bLength%9==0)
        {
            nOF=bLength/9;
        }
        else
        {
            nOF=bLength/9;
            nOF++;
        }
        int count=0;
        for(int i=0;i<bLength/9;i++)
        {
            start=end;
            end=end+9;
            String substring=binaryString.substring(start,end);
            f=new File(path+"/"+fni+""+count);
            ENOPS.createFile(f);
            encryptBits(f,substring);
            count++;
        }
        if(bLength%9!=0)
        {
            String substring=binaryString.substring(end);
            substring=ENOPS.adjustASCIIBinaryString(substring);
            f=new File(path+"/"+fni+""+count);
            ENOPS.createFile(f);
            encryptBits(f,substring);
            count++;
        }
    }
    public static void encryptBits(File f,String substring)
    {
        int ur=0, uw=0, ux=0, gr=0, gw=0, gx=0, or=0, ow=0, ox=0;
        if(substring.charAt(0)=='1')
        {
            ur=0;
        }
        else
        {
            ur=1;
        }
        if(substring.charAt(1)=='1')
        {
            uw=0;
        }
        else
        {
            uw=1;
        }
        if(substring.charAt(2)=='1')
        {
            ux=0;
        }
        else
        {
            ux=1;
        } 
        if(substring.charAt(3)=='1')
        {
            gr=0;
        }
        else
        {
            gr=1;
        } 
        if(substring.charAt(4)=='1')
        {
            gw=0;
        }
        else
        {
            gw=1;
        }
        if(substring.charAt(5)=='1')
        {
            gx=0;
        }
        else
        {
            gx=1;
        } 
        if(substring.charAt(6)=='1')
        {
            or=0;
        }
        else
        {
            or=1;
        } 
        if(substring.charAt(7)=='1')
        {
            ow=0;
        }
        else
        {
            ow=1;
        } 
        if(substring.charAt(8)=='1')
        {
            ox=0;
        }
        else
        {
            ox=1;
        }
        Permission.setCustomPermission(f, ur, uw, ux, gr, gw, gx, or, ow, ox);
    }
    public static void decrypt()
    {
        int ce=DEOPS.getCharacterEncoding();
        String s=DEOPS.isFileSelected();
        if(s.indexOf("1")!=-1)
        {
            decodeFile();
        }
        else
        {
            if(ce==0)
            {
                decryptASCII();
            }
            else if(ce==1)
            {
                decryptUNICODE();
            }
            else
            {
                System.out.println("Invalid/Unknown Character Encoding!");
            }
        }
    }
    public static void decryptASCII()
    {
        String path=DEOPS.getPath(), fni=DEOPS.getFileName();
        Vector numbers=new Vector(), chars=new Vector();
        int nOF=DEOPS.getNOF(), count=0, ce=DEOPS.getCharacterEncoding();
        for(int i=0;i<nOF;i++)
        {
            String s=path+"/"+fni+""+count;
            s=DEOPS.getBinaryString(s,nOF);
            int a=Integer.parseInt(s,2);
            numbers.add(a);
            count++;
        }
        for(int i=0;i<numbers.size();i++)
        {
            chars.add((char)Integer.parseInt(numbers.get(i).toString()));
        }
        String s="";
        for(int i=0;i<chars.size();i++)
        {
            s=s+chars.get(i).toString();
        }
        JOptionPane.showMessageDialog(null, s, "Decoded Message",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void decryptUNICODE()
    {
        String path=DEOPS.getPath(), fni=DEOPS.getFileName();
        Vector numbers=new Vector(), chars=new Vector();
        int nOF=DEOPS.getNOF(), count=0, ce=DEOPS.getCharacterEncoding();
        for(int i=0;i<nOF;i++)
        {
            String dec;
            String s=path+""+fni+""+count;
            dec=DEOPS.getBinaryString(s,nOF);
            if(!dec.equals("111111111"))
            {
                count++;
                s=path+""+fni+""+count;
                s=DEOPS.getBinaryString(s, nOF);
                dec=dec+s;
            }
            if(count==nOF)
            {
                break;
            }
            int a=Integer.parseInt(dec,2);
            numbers.add(a);
            count++;
        }
        for(int i=0;i<numbers.size();i++)
        {
            chars.add((char)Integer.parseInt(numbers.get(i).toString()));
        }
        String s="";
        for(int i=0;i<chars.size();i++)
        {
            s=s+chars.get(i).toString();
        }
        JOptionPane.showMessageDialog(null, s, "Decoded Message",JOptionPane.INFORMATION_MESSAGE);
    }
    public static void encodeFile(String file)
    {
        FileReader r;
        StringBuffer s=new StringBuffer();
        String binaryString="";
        int bLength=0;
        Vector v=new Vector();
        if(DecodeMain.isFileSelected()==1)
        {
            try
            {
                r=new FileReader(DecodeMain.getEncodeFile());
                int c;
                while((c=r.read())!=-1)
                {
                    v.add(c);
                    String bs=Integer.toBinaryString(c);
                    bs=ENOPS.adjustASCIIBinaryString(bs);
                    s.append(bs);
                }
            }catch(IOException e)
            {
                System.out.println(e.getMessage());
            }
            binaryString=s.toString();
            bLength=binaryString.length();
            if(bLength%9==0)
            {
                nOF=bLength/9;
            }
            else
            {
                nOF=bLength/9;
                nOF++;
            }
            int start=0, end=0, count=0;
            for(int i=0;i<bLength/9;i++)
            {
                f=new File(path+"/"+fni+""+count);
                start=end;
                end=end+9;
                String substring=binaryString.substring(start,end);
                ENOPS.createFile(f);
                encryptBits(f, substring);
                count++;
            }
            if((bLength%9)!=0)
            {
                String substring=binaryString.substring(end);
                substring=ENOPS.adjustASCIIBinaryString(substring);
                f=new File(path+"/"+fni+""+count);
                ENOPS.createFile(f);
                encryptBits(f, substring);
            }
        }
    }
    public static void decodeFile()
    {
        fni=DEOPS.getFileName();
        path=DEOPS.getPath();
        nOF=DEOPS.getNOF();
        int count=0;
        Vector v=new Vector();
        String binaryString="", otherInfo="";
        for(int i=0;i<nOF;i++)
        {
            f=new File(path+""+fni+""+count);
            binaryString=DEOPS.getBinaryString(f.getAbsolutePath(), nOF);
            int n=Integer.parseInt(binaryString, 2);
            otherInfo=otherInfo+(char)n;
            v.add(n);
            count++;
        }
        FileWriter fwriter;
        PrintWriter outputFile;
        try
        {
            fwriter=new FileWriter(path+"dec");
            outputFile=new PrintWriter(fwriter);
            outputFile.print(otherInfo);
            outputFile.close();
        }catch(IOException e)
        {
        }
    }
}
