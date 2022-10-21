/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan2;
public class Latihan2 {
 
    public static void main(String[] args) {
        
        int A = 100000;
        int B = 500000;
        int C = 150000;
        int hasil1;
        int hasil2;
        
        hasil1 = A + B;
        hasil2 = hasil1 - C;
       System.out.println ("Selamat Datang Di Bank ABC");
       System.out.println("Saldo Saat Ini =Rp." + A);
       System.out.println (" ");
       System.out.println("Simpan Uang =Rp." + B);
       System.out.println("Saldo Saat Ini =Rp." + hasil1);
       System.out.println (" ");
       System.out.println("Ambil Uang =Rp." + C);
       System.out.println("Saldo Saat Ini =Rp." + hasil2);
    }
    
}
