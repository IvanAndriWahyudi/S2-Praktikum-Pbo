package belajaroop.pkg;

import belajaroop.paket.paket;

public class PERTEMUANN14 {


    public static void main(String[] args) {
        Matematika mtk = new Matematika("PARAMETER");
        Matematika mtk2 = new Matematika();
        paket pkt = new paket();
     
        mtk.setNilai(10, 20);
        System.out.println(mtk.getNilaiA());
        System.out.println(mtk.getNilaiB());
        System.out.println(mtk.Penjumlahan());
        System.out.println(mtk.Penjumlahan(87, 33));
    }
}
