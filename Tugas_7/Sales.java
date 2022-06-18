package Kantor;

public class Sales extends Pegawai {
    int penjualan;
    double komisi;

    public Sales(String nama, String noKTP, int penjualan, double komisi) {
        super(nama, noKTP);
        this.penjualan = penjualan;
        this.komisi = komisi;
    }

    @Override
    public String toString() {
        return "Sales           : " + super.getNama() +
                "\nNo. KTP         : " + super.getNoKTP() +
                "\nTotal Penjualan : " + penjualan +
                "\nBesaran Komisi  : " + komisi + super.gaji()+"\n";
    }

    @Override
    public double gaji() {
        return penjualan*komisi;
    }

    public int getPenjualan() {
        return penjualan;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public double getKomisi() {
        return komisi;
    }

    public void setKomisi(double komisi) {
        this.komisi = komisi;
    }
}
