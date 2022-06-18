package Tugas_4;

public class Main {
    public static void main(String[] args) {
        DataMerchant.setMerc(DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000)));
        DataMerchant.setMerc(DataMerchant.tambahMerchant(new Merchant("Nasgor Mlebes", "Nasi Goreng Jawa", 10000)));
        DataMerchant.setMerc(DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000)));
        DataMerchant.tampilData();
        DataMerchant.setMerc(DataMerchant.tambahMerchant(new Merchant(DataMerchant.sc.nextLine(), DataMerchant.sc.nextLine(),DataMerchant.sc.nextDouble())));
        DataMerchant.tampilData();
    }
}
