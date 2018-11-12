/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.TugasPBO;

/**
 *
 * @author Windows 10
 */
public class User {
    public static void main (String [] args){
        Drone pengguna = new Drone();
        
        pengguna.energi = 12 ;
        pengguna.ketinggian = 10 ;
        pengguna.kecepatan = 30 ;
        pengguna.merek = "Dji Mavic Pro" ;
        
        pengguna.terbang();
        pengguna.matikanMesin();
        pengguna.turun();
        pengguna.belok();
        pengguna.maju();
        pengguna.mundur();
        
               
                
    }
}
