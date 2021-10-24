package belajaroop.pkg;

class Matematika {
    private int a;
    private int b;
    
    void setNilai(int a, int b){
        this.a = a;
        this.b = b;
    }
    
    int getNilaiA(){
        return this.a;
    }
    
    int getNilaiB(){
        return this.b;
    }
    
    int Penjumlahan(int a, int b){
        return a + b;
    }
    
    float Penjumlahan(){
        float nilai = this.a + this.b;
        return nilai;
    }
    
    Matematika(String a){
        System.out.println("Belajar Package = " + a);
    }
    
    Matematika(){
        System.out.println("Belajar Package TANPA PARAMETER");
    }
}
