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
public class pattern4 {
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
            encodeFile();
        }
        ENOPS.writeCFile(nOF);
    }
    public static void singlePathASCII(String message)
    {
        int start=0,end=0;
        String bString=ENOPS.getASCIIBinaryString(message);
        String binaryString=LOPS.OR(bString, "000000000");
        binaryString=LOPS.NOR(binaryString, "000000000");
        int bLength=binaryString.length();
        int Difference=ENOPS.getDifference(Integer.parseInt("000000000",2), Integer.parseInt(key));
        JOptionPane.showMessageDialog(null, "Our Key: "+Difference,"Intermediate Key",JOptionPane.INFORMATION_MESSAGE);
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
            ENOPS.encryptBits(f,substring);
            count++;
        }
        if(bLength%9!=0)
        {
            String substring=binaryString.substring(end);
            substring=ENOPS.adjustASCIIBinaryString(substring);
            f=new File(path+"/"+fni+""+count);
            ENOPS.createFile(f);
            ENOPS.encryptBits(f,substring);
            count++;
        } 
    }
    public static void singlePathUNICODE(String message)
    {
        int start=0,end=0;
        String bString=ENOPS.getUNICODEBinaryString(message);
        String binaryString=LOPS.AND(bString, Integer.toString(111111111));
        binaryString=LOPS.NAND(binaryString, "000000000");
        int bLength=binaryString.length();
        int Difference=ENOPS.getDifference(Integer.parseInt("000000000",2), Integer.parseInt(key));
        JOptionPane.showMessageDialog(null, "Our Key: "+Difference,"Intermediate Key",JOptionPane.INFORMATION_MESSAGE);
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
            ENOPS.encryptBits(f,substring);
            count++;
        }
        if(bLength%9!=0)
        {
            String substring=binaryString.substring(end);
            substring=ENOPS.adjustASCIIBinaryString(substring);
            f=new File(path+"/"+fni+""+count);
            ENOPS.createFile(f);
            ENOPS.encryptBits(f,substring);
            count++;
        }
    }
    public static void decrypt()
    {
        System.out.println("15");
        int ce=DEOPS.getCharacterEncoding();
        if(DecodeMain.isFileSelected()==1)
        {
            System.out.println("16");
            decodeFile();
        }
        else
        {
            System.out.println("17");
            if(ce==0)
            {
                System.out.println("18");
                decryptASCII();
            }
            else if(ce==1)
            {
                System.out.println("19");
                decryptUNICODE();
            }
            else
            {
                System.out.println("20");
                System.out.println("Invalid/Unknown Character Encoding!");
            }
        }
    }
    public static void decryptASCII()
    {
        System.out.println("21");
        String path=DEOPS.getPath(), fni=DEOPS.getFileName();
        Vector numbers=new Vector(), chars=new Vector();
        int nOF=DEOPS.getNOF(), count=0, ce=DEOPS.getCharacterEncoding();
        int ourKey=DecodeMain.getOurKey();
        int userKey=DecodeMain.getUserKey();
        boolean b=DEOPS.verifyKey(ourKey, userKey,000000000);
        if(b)
        {
            System.out.println("22");
            for(int i=0;i<nOF;i++)
            {
                String s=path+"/"+fni+""+count;
                s=DEOPS.getBinaryString(s,nOF);
                s=DEOPS.invert(s);
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
            JOptionPane.showMessageDialog(null, s, "Decoded Message ASCII",JOptionPane.INFORMATION_MESSAGE);
        }
        else
        {
            System.out.println("23");
            JOptionPane.showMessageDialog(null, "Please enter correct keys!", "Invalid Keys",JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void decryptUNICODE()
    {
        System.out.println("24");
        String path=DEOPS.getPath(), fni=DEOPS.getFileName();
        Vector numbers=new Vector(), chars=new Vector();
        int nOF=DEOPS.getNOF(), count=0, ce=DEOPS.getCharacterEncoding();
        for(int i=0;i<nOF;i++)
        {
            String dec;
            String s=path+""+fni+""+count;
            dec=DEOPS.getBinaryString(s,nOF);
            dec=DEOPS.invert(dec);
            if(dec.equals("000000000"))
            {
                System.out.println("25");
                count++;
                s=path+""+fni+""+count;
                s=DEOPS.getBinaryString(s, nOF);
                s=DEOPS.invert(s);
                dec=dec+s;
            }
            if(count==nOF)
            {
                System.out.println("26");
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
        JOptionPane.showMessageDialog(null, s, "Decoded Message Unicode",JOptionPane.INFORMATION_MESSAGE);
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
            binaryString=DEOPS.invert(binaryString);
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
    public static void encodeFile()
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
                    bs=LOPS.AND(bs, "000000000");
                    bs=LOPS.NAND(bs, "000000000");
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
                ENOPS.encryptBits(f, substring);
                count++;
            }
            if((bLength%9)!=0)
            {
                String substring=binaryString.substring(end);
                substring=ENOPS.adjustASCIIBinaryString(substring);
                f=new File(path+"/"+fni+""+count);
                ENOPS.createFile(f);
                ENOPS.encryptBits(f, substring);
            }
        }
    }
}
