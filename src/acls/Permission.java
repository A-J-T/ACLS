/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acls;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFilePermission;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ajt
 */
public class Permission {
    public static void setCustomPermission(File f,int ur,int uw,int ux,int gr,int gw,int gx,int or,int ow,int ox)
    {
        Set<PosixFilePermission> perms=new HashSet<PosixFilePermission>();
        if(ur==1)
        {
            perms.add(PosixFilePermission.OWNER_READ);
        }
        if(uw==1)
        {
            perms.add(PosixFilePermission.OWNER_WRITE);
        }
        if(ux==1)
        {
            perms.add(PosixFilePermission.OWNER_EXECUTE);
        }
        if(gr==1)
        {
            perms.add(PosixFilePermission.GROUP_READ);
        }
        if(gw==1)
        {
            perms.add(PosixFilePermission.GROUP_WRITE);
        }
        if(gx==1)
        {
            perms.add(PosixFilePermission.GROUP_EXECUTE);
        }
        if(or==1)
        {
            perms.add(PosixFilePermission.OTHERS_READ);
        }
        if(ow==1)
        {
            perms.add(PosixFilePermission.OTHERS_WRITE);
        }
        if(ox==1)
        {
            perms.add(PosixFilePermission.OTHERS_EXECUTE);
        }
        try
        {
            Files.setPosixFilePermissions(Paths.get(f.getPath()),perms);
        }catch(IOException e)
        {
            System.out.println("Error: "+e.getMessage());
        }
    }
}
