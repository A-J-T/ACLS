/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acls;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.util.Set;

/**
 *
 * @author ajt
 */
public class DEOPS {
    static String fni, path, readString, pattern, ce, nOF, file;
    static int index1=0, index2=0;
    static StringBuffer s;
    public static String getFileName()
    {
        return fni;
    }
    public static String getPath()
    {
        return path;
    }
    public static int getFileSelected()
    {
        return Integer.parseInt(file);
    }
    public static String isFileSelected()
    {
        return file;
    }
    public static int getPattern()
    {
        return Integer.parseInt(pattern);
    }
    public static int getCharacterEncoding()
    {
        return Integer.parseInt(ce);
    }
    public static int getNOF()
    {
        return Integer.parseInt(nOF);
    }
    public static void analyseFile()
    {
        try
        {
            FileReader f=new FileReader(DecodeMain.getDecodeFile());
            char[] buffer=new char[1000];
            f.read(buffer);
            s=new StringBuffer();
            for(int i=0;i<1000;i++)
            {
                s.append(Character.toString(buffer[i]));
            }
        }catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
        readString=s.toString();
        analyse();
    }
    public static void analyse()
    {
        index1=readString.indexOf("Path:");
        index2=index1+5;
        index1=index2;
        index2=readString.indexOf("|",index1);
        path=readString.substring(index1,index2);
        readString=readString.substring(index2);
        
        index1=0;index2=0;
        index1=readString.indexOf("FI:");
        index2=index1+3;
        index1=index2;
        index2=readString.indexOf("|",index1);
        fni=readString.substring(index1,index2);
        readString=readString.substring(index2);
        
        index1=0;index2=0;
        index1=readString.indexOf("NOF:");
        index2=index1+4;
        index1=index2;
        index2=readString.indexOf("|",index1);
        nOF=readString.substring(index1, index2);
        readString=readString.substring(index2);
        
        index1=0;index2=0;
        index1=readString.indexOf("P:");
        index2=index1+2;
        index1=index2;
        index2=readString.indexOf("|",index1);
        String s=readString.substring(index1+1,index2);
        pattern=readString.substring(index1,index2);
        readString=readString.substring(index2);
        
        index1=0;index2=0;
        index1=readString.indexOf("CE");
        index2=index1+2;
        index1=index2;
        index2=readString.indexOf("|",index1);
        ce=readString.substring(index1+1,index2);
        readString=readString.substring(index2);
        
        index1=0;index2=0;
        index1=readString.indexOf("File:");
        index2=index1+5;
        index1=index2;
        index2=readString.indexOf("|",index1);
        file=readString.substring(index1,index2);
        System.out.println("File:"+file);
    }
    public static void analysePattern()
    {
        System.out.println("12");
        int p=getPattern();
        switch(p)
        {
            case 0:
                pattern1.decrypt();
                break;
            case 1:
                pattern2.decrypt();
                break;
            case 2:
                pattern3.decrypt();
                break;
            case 3:
                pattern4.decrypt();
                break;
            case 4:
                pattern5.decrypt();
                break;
            case 5:
                pattern6.decrypt();
                break;
            case 6:
                pattern7.decrypt();
                break;
            case 7:
                System.out.println("13");
                pattern8.decrypt();
                break;
            default:
                System.out.println("Unknown/Invalid Pattern!");
                break;
        }
    }
    public static String getBinaryString(String file,int nOF)
    {
        String s="";
        File f=new File(file);
        s=getAttributeString(f);
        return s;
    }
    public static String getAttributeString(File f)
    {
        int ur=0,uw=0,ux=0,gr=0,gw=0,gx=0,or=0,ow=0,ox=0;
        if(f.exists())
        {
            if(DEOPS.getPattern()==EncodeMain.PATTERN2)
            {
                ur=uw=ux=gr=gw=gx=or=ow=ox=1;
                Path path=Paths.get(f.getPath());
                PosixFileAttributeView view=Files.getFileAttributeView(path, PosixFileAttributeView.class);
                PosixFileAttributes attributes=null;
                try
                {
                    attributes=view.readAttributes();
                }catch(IOException e)
                {
                }
                Set<PosixFilePermission> permissions=attributes.permissions();
                for(PosixFilePermission permission:permissions)
                {
                    if(permission.name().startsWith("GROUP_READ"))
                    {
                        gr=0;
                    }
                    if(permission.name().startsWith("GROUP_WRITE"))
                    {
                        gw=0;
                    }
                    if(permission.name().startsWith("GROUP_EXECUTE"))
                    {
                        gx=0;
                    }
                    if(permission.name().startsWith("OTHERS_READ"))
                    {
                        or=0;
                    }
                    if(permission.name().startsWith("OTHERS_WRITE"))
                    {
                        ow=0;
                    }
                    if(permission.name().startsWith("OTHERS_EXECUTE"))
                    {
                        ox=0;
                    }
                    if(permission.name().startsWith("OWNER_READ"))
                    {
                        ur=0;
                    }
                    if(permission.name().startsWith("OWNER_WRITE"))
                    {
                        uw=0;
                    }
                    if(permission.name().startsWith("OWNER_EXECUTE"))
                    {
                        ux=0;
                    }
                }
            }
            else
            {
                Path path=Paths.get(f.getPath());
                PosixFileAttributeView view=Files.getFileAttributeView(path, PosixFileAttributeView.class);
                PosixFileAttributes attributes=null;
                try
                {
                    attributes=view.readAttributes();
                }catch(IOException e)
                {
                }
                Set<PosixFilePermission> permissions=attributes.permissions();
                for(PosixFilePermission permission:permissions)
                {
                    if(permission.name().startsWith("GROUP_READ"))
                    {
                        gr=1;
                    }
                    if(permission.name().startsWith("GROUP_WRITE"))
                    {
                        gw=1;
                    }
                    if(permission.name().startsWith("GROUP_EXECUTE"))
                    {
                        gx=1;
                    }
                    if(permission.name().startsWith("OTHERS_READ"))
                    {
                        or=1;
                    }
                    if(permission.name().startsWith("OTHERS_WRITE"))
                    {
                        ow=1;
                    }
                    if(permission.name().startsWith("OTHERS_EXECUTE"))
                    {
                        ox=1;
                    }
                    if(permission.name().startsWith("OWNER_READ"))
                    {
                        ur=1;
                    }
                    if(permission.name().startsWith("OWNER_WRITE"))
                    {
                        uw=1;
                    }
                    if(permission.name().startsWith("OWNER_EXECUTE"))
                    {
                        ux=1;
                    }
                }
            }
        }
        String s=ur+""+uw+""+ux+""+gr+""+gw+""+gx+""+or+""+ow+""+ox;
        return s;
    }
    public static boolean verifyKey(int ourKey,int userKey,int magicKey)
    {
        boolean b=false;
        if(ourKey>userKey)
        {
            int v=ourKey+userKey;
            if(v==511)
            {
                System.out.println("BAZINGA1!!!");
                b=true;
            }
        }
        else
        {
            int v=userKey+ourKey;
            if(v==magicKey)
            {
                System.out.println("BAZINGA1!!!");
                b=true;
            }
        }
        return b;
    }
    public static String invert(String binaryString)
    {
        int length=binaryString.length();
        String s="";
        for(int i=0;i<length;i++)
        {
            if(binaryString.charAt(i)=='1')
            {
                s=s+'0';
            }
            if(binaryString.charAt(i)=='0')
            {
                s=s+'1';
            }
        }
        return s;
    }
}
