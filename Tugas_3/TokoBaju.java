/*
Nama : Wardah Zahra
NIM  : 215150700111011
*/

package Tugas_3;

import java.util.Scanner;

class TokoBaju {
    String jenis;
    int harga;
    int jumlah;
    public TokoBaju (String a, int b){
        jenis = a;
        jumlah = b;
    }

    final int bajua = 100000;
    final int bajub = 125000;
    final int bajuc = 175000;

    void hargaa (){
        if (jumlah > 100) harga = 95000;
        else harga = bajua;
    }
    void hargab (){
        if (jumlah > 100) harga = 120000;
        else harga = bajub;
    }
    void hargac (){
        if (jumlah > 100) harga = 160000;
        else harga = bajuc;
    }

    void display (){
        if (jenis.equalsIgnoreCase("a")) hargaa();
        else if (jenis.equalsIgnoreCase("b")) hargab();
        else if (jenis.equalsIgnoreCase("c")) hargac();
        System.out.println("Jenis yang anda beli    : "+jenis);
        System.out.println("Harga per buah          : "+harga);
        System.out.println("Total harga             : "+harga*jumlah);
    }
}

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
              Baju yang tersedia :
              Baju A dengan harga 100000
              Baju B dengan harga 125000
              Baju C dengan harga 175000""");
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = sc.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int jumlah = Integer.parseInt(sc.nextLine());
        TokoBaju baju = new TokoBaju(jenis,jumlah);
        baju.display();
    }

}
