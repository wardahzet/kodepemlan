package Kantor;

public class PegawaiTetap extends Pegawai {
    private double upah;

    public PegawaiTetap(String nama, String noKTP, double upah) {
        super(nama, noKTP);
        this.upah = upah;
    }

    @Override
    public String toString() {
        return "Pegawai Tetap   : " + super.getNama() +
                "\nNo. KTP         : " + super.getNoKTP() +
                "\nUpah            : " + upah + super.gaji()+"\n";
    }

    @Override
    public double gaji() {
        return getUpah();
    }

    public double getUpah() {
        return upah;
    }

    public void setUpah(double upah) {
        this.upah = upah;
    }
}
