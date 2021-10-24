package PBO;

import java.util.Scanner;

public class Kuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Menentukan nilai bilangan berdasarkan angka");
        System.out.print("Masukkan jumlah bilangan : ");
        int jumlah = input.nextInt();

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan angka ke " + i +"=  ");
            int nilai = input.nextInt();
            if(nilai % 2 == 0 && nilai < 0) {
                System.out.println("Bilangan negatif genap");
            }else if(nilai % 2 == 0 && nilai > 0){
                System.out.println("bilangan positif genap");
            }else if(nilai % 2 == 1 && nilai > 0){
                System.out.println("bilangan positif Ganjil");
            } else {
                System.out.println("bilangan negatif Ganjil ");
            }
        }
    }

}