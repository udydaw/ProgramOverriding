/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package overriding;

/**
 *
 * @author ACER
 */
public class Overriding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Identitas objek = new Identitas();
        KartuBPJS objek1 = new KartuBPJS();
        Identitas objek2 = new KartuBPJS();

        objek2.nama();
        objek.no ();
        objek.nama();
        objek.tl();
        objek.nik();
        
    }
    
}
