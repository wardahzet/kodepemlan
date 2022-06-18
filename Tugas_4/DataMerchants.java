package Tugas_4;

import java.util.ArrayList;
import java.util.Scanner;

public class DataMerchants {
    static Scanner sc = new Scanner(System.in);
    static ArrayList<Merchant> merc = new ArrayList<>();

    public static ArrayList<Merchant> tambah(Merchant merchant){
        merc.add(merchant);
        return merc;
    }

    public static void outputData(){
        for (Merchant mch : merc){
            print(mch);
        }
    }

    public static void print(Merchant mch){
        System.out.println("====Tampilan Data Merchant UBFood====");
        System.out.println("Nama Merchant   : " + mch.getnMerchant());
        System.out.println("Nama Produk     : " + mch.getnProduk());
        System.out.println("Harga           : " + (int) mch.getHarga());
    }

    public static Merchant cari (String nama){
        for (Merchant merchant : merc) {
            if (merchant.getnMerchant().equals(nama)) return merchant;
        }
        tambah(updateMerchant(nama));
        return merc.get(merc.size()-1);
    }

    public static Merchant updateMerchant (String merchant){
        String produk = sc.nextLine();
        double harga = sc.nextDouble(); sc.nextLine();
        return new Merchant(merchant,produk,harga);
    }
}
