package OOP;

class Data{

    //default
    int DataInterger;
    Double DataDouble;

    //pubic
    public String DataString;

    //private
    private float DataFloat;

    //getter / read
    public double penjumlahan(){
        return this.DataFloat * this.DataFloat;
    }

    //setter / write
    public void setNilaiFloat(float DataFloat){
        this.DataFloat = DataFloat;
    }

    Data(){
        this.DataInterger = 1;
        this.DataDouble = 1.5;
        this.DataFloat = 2.5f;
        System.out.println("Data Interger : " + this.DataInterger);
        System.out.println("Data Double : " + this.DataDouble);
    }
}

public class Main {
    public static void main(String[] args) {
	    Data objekData1 = new Data();

	    //default
        //write
        objekData1.DataInterger = 5;

        //read
        System.out.println("Nilai Update : " + objekData1.DataInterger);

        //public
        String NilaiString = objekData1.DataString = "Ini Adalah Nilai Public Variabel";
        System.out.println(NilaiString);

        //private
        //objekdata1.data

        System.out.println("Nilai Lama : " + objekData1.penjumlahan());
        objekData1.setNilaiFloat(5.1f);
        System.out.println("Nilai Baru : " + objekData1.penjumlahan());
    }
}
