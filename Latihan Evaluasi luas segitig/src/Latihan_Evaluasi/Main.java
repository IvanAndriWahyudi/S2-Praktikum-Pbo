package Latihan_Evaluasi;

public class Main {

    public static void main(String[] args) {
        Segitiga SegitigaSamaSisi = new Segitiga();
        System.out.println("Luas Segitiga Sama Sisi    = " + SegitigaSamaSisi.getLuas() + " Cm");
        System.out.println("Keliling Segitiga Sama Sisi= " + SegitigaSamaSisi.getKeliling() + " Cm" + "\n");

        Segitiga SegitigaSamaKaki = new Segitiga();
        System.out.println("Luas Segitiga Sama Kaki    = " + SegitigaSamaKaki.getLuas()  + " Cm" );
        System.out.println("Keliling Segitiga Sama Kaki= " + SegitigaSamaKaki.getKeliling()  + " Cm" );

    }
}
