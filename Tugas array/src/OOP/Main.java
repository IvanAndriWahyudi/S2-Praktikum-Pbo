package OOP;

import com.sun.jdi.PathSearchingVirtualMachine;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //DEKLARASI VARIABEL ARRAY 1 DIMENSI DAN ASSIGNMENT
        int angka[] = {20, 30, 44, 22};
        System.out.println(angka[2]);

        for(int i : angka){
            System.out.print(i + ", ");
        }

        //SATU DIMENSI
        System.out.println("\n\nSATU DIMENSI");
        int jumlah;
        System.out.print("Masukan Jumlah Inputan = ");
        jumlah = input.nextInt();
        int[] angka1 = new int[jumlah];
        for (int a = 0 ; a < jumlah ; a++){
            System.out.print("Input Angka Ke- " + (a + 1) + " = " );
            angka1[a] = input.nextInt();
        }
        for (int i = 0 ; i < jumlah ; i++){
            System.out.print(angka1[i] + ", ");
        }
        System.out.println("\n");

        //DUA DIMENSI
        System.out.println("DUA DIMENSI");
        int kolom, baris;
        System.out.print("Masukan Jumlah Baris = ");
        baris = input.nextInt();
        System.out.print("Masukan Jumlah Kolom = ");
        kolom = input.nextInt();
        int [] [] angka2 = new int[baris] [kolom];

        for (int a = 0 ; a < baris ; a++){
            for (int i = 0 ; i < kolom ; i++){
                System.out.print("Input Angka Baris Ke- " + (a + 1) + "Dan Kolom Ke- " + (i + 1) + " = ");
                angka2[a] [i] = input.nextInt();
            }
        }

        for (int a = 0 ; a < baris ; a++){
            for (int i = 0 ; i < kolom ; i++){
                System.out.print(angka2[a] [i] + ", ");
            }
            System.out.println("");
        }
    }
}
