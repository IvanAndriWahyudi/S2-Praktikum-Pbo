package Latihan_Evaluasi;

public class Segitiga {

    private double Alas, Tinggi;

    public double getLuas(){
        return 0.5 * this.Alas * this.Tinggi;
    }

    public double getKeliling(){
        return this.Alas + this.Alas + this.Alas;
    }

    public void setAlasTinggi (double Alas, double Tingggi){
        this.Alas = Alas;
        this.Tinggi = Tinggi;
    }

    Segitiga() {
        this.Alas = 20;
        this.Tinggi = 15;
        System.out.println("Nama                       = Ivan Andri Wahyudi");
        System.out.println("Kelas                      = 2B");
        System.out.println("Npm                        = 203510197");
    }
}
