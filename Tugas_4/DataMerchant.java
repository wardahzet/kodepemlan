package Tugas_4;

import java.util.Scanner;

public class DataMerchant {
    static Scanner sc = new Scanner(System.in);
    private static Merchant[] merc = new Merchant[0];

    public static Merchant[] tambahMerchant(Merchant merchant){
        if (cariMerchant(merchant.getnMerchant()) != null) updateMerchant(merchant);
        else {
            Merchant[] merchants = new Merchant[getMerc().length + 1];
            int counter = 0;
            for (int i = 0; i < getMerc().length + 1; i++) {
                if (counter == getMerc().length) {
                    System.arraycopy(getMerc(), 0, merchants, 0, getMerc().length);
                    setMerc(merchants);
                }
                counter++;
            }
            tampilMerchant(merchant);
        }
        return getMerc();
    }

    public static void tampilData(){
        for (Merchant mch : getMerc()) {
            System.out.println("====Tampilan Data Merchant UBFood====");
            System.out.println("Nama Merchant   : " + mch.getnMerchant());
            System.out.println("Nama Produk     : " + mch.getnProduk());
            System.out.println("Harga           : " + (int) mch.getHarga());
        }
    }

    public static Merchant cariMerchant(String nama){
        for (Merchant merchant : getMerc()) {
            if (nama.equals(merchant.getnMerchant()))
                return merchant;
        }
        return null;
    }

    public static void tampilMerchant (Merchant merchant){
        getMerc()[getMerc().length-1] = merchant;
    }

    public static void updateMerchant (Merchant merchant){
        for (int i = 0; i < getMerc().length; i++){
            if (merchant.getnMerchant().equals(getMerc()[i].getnMerchant()))
                getMerc()[i] = merchant;
        }
    }

    public static Merchant[] getMerc() {
        return merc;
    }

    public static void setMerc(Merchant[] merc) {
        DataMerchant.merc = merc;
    }
}