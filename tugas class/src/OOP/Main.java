package OOP;

//MEMBUAT CLASS
class Komputer{
    String Merk;
    int Ukuran;
    String Processor;
    String Warna;
    int RAM;
    String Hardisk;

    Komputer (String MerkInput, int UkuranInput, String ProcessorInput, String WarnaInput, int RAMInput, String HardiskInput){
        Merk = MerkInput;
        Ukuran = UkuranInput;
        Processor = ProcessorInput;
        Warna = WarnaInput;
        RAM = RAMInput;
        Hardisk = HardiskInput;

        System.out.println("Merek    = " + Merk);
        System.out.println("Ukuran   = " + Ukuran);
        System.out.println("Processor= " + Processor);
        System.out.println("Warna    = " + Warna);
        System.out.println("RAM      = " + RAM);
        System.out.println("Hardisk  = " + Hardisk);
    }
}

public class Main {

    public static void main(String[] args) {
	Komputer Laptop = new Komputer ("Asus ROG", 14, "Intel Core i9", "Merah", 8, "2 TB" );
	System.out.println("");
	Komputer Notebook = new Komputer ("Lenovo", 13, "Intel Core i3", "Hitam", 2, "500 GB" );
    }
}
