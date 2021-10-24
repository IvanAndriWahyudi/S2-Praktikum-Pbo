package OOP;

import java.util.ArrayList;

class Mahasiswa {
    public String nama;
    public String npm;
    public int umur;
    public static int jumlahMhs;
    public static ArrayList<String> arrayNama = new ArrayList<String>();

    Mahasiswa(String nama, String npm, int umur) {
        this.nama = nama;
        this.npm = npm;
        this.umur = umur;
        Mahasiswa.jumlahMhs++;
        Mahasiswa.arrayNama.add(this.nama + " (" + this.umur + ") ");
        System.out.println(" Mahasiswa Dengan Nama" + this.nama + " (" + this.npm + ") berumur " + this.umur + " tahun");
    }

    static void show(){
        System.out.println(" Jumlah Mahasiswa = " + Mahasiswa.jumlahMhs);
    }

    static ArrayList<String> showArrayNama(){
        return Mahasiswa.arrayNama;
    }
}

public class Main {
    public static void main(String[] args) {
	    Mahasiswa Mhs1 = new Mahasiswa(" Ivan", "203510197", 18);
        Mahasiswa Mhs2 = new Mahasiswa(" Andri", "203510198", 19);
        Mahasiswa Mhs3 = new Mahasiswa(" Wahyudi", "203510199", 20);
        Mahasiswa Mhs4 = new Mahasiswa(" Agus", "203510120", 21);

        Mahasiswa.show();

//        System.out.println(Mhs1.nama);
//        System.out.println(Mhs2.nama);
//        System.out.println(Mhs3.nama);
//        System.out.println(Mhs4.nama);

        System.out.println(" Daftar Nama = " + Mahasiswa.showArrayNama());
    }
}
