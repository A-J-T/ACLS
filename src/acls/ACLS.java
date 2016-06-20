/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acls;

/**
 *
 * @author ajt
 */
public class ACLS {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            Thread.sleep(1500);
        }catch(InterruptedException e)
        {
            
        }
        new AclStart().setVisible(true);
    } 
}
