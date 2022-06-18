package Tugas_4;

public class Merchant {
    private String nMerchant;
    private String nProduk;
    private double harga;

    public Merchant (String nMerchant, String nProduk, double harga){
        this.setnMerchant(nMerchant);
        this.setnProduk(nProduk);
        this.setHarga(harga);
    }

    public String getnMerchant() {
        return nMerchant;
    }

    public void setnMerchant(String nMerchant) {
        this.nMerchant = nMerchant;
    }

    public String getnProduk() {
        return nProduk;
    }

    public void setnProduk(String nProduk) {
        this.nProduk = nProduk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }
}