/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ivan Andri Wahyudi
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Nama        : Ivan Andri Wahyudi");
        System.out.println("Npm         : 203510197");
        System.out.println("Kelas       : 2B");
        System.out.println("Pertemuan   : 2");
        int angka = 3 , angka2 = 5, hasil;
        
        String nama;
        
        //ARITMATIKA
        //*, /, +, -.
        hasil = angka + angka2;
        System.out.println("Hasilnya Adalah = " + hasil);
        
        hasil = angka2 % angka;
        System.out.println("Hasil Modulus adalah = " + hasil);
        
        //PENEGASAN
        angka *= angka2;
        System.out.println("Hasil Penegasan Adalah = " + angka);
        
        //PERBANDINGAN
        boolean a = false;
        System.out.println(a);
        
        a = angka < angka2;
        System.out.println(a); 
        
        //LOGIKA
        a = angka < angka2 || angka2 == 5;
        System.out.println(a); 
        
        //TERNARY
        boolean b = false;
        String text = b ? "Betul" : "Salah";
        System.out.println(text);
        
    }
    
}
