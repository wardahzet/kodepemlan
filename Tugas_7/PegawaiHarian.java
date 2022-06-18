package Kantor;

public class PegawaiHarian extends Pegawai {
    private double upahPerJam;
    private int totalJam;

    public PegawaiHarian(String nama, String noKTP, double upahPerJam, int totalJam) {
        super(nama, noKTP);
        this.upahPerJam = upahPerJam;
        this.totalJam = totalJam;
    }

    @Override
    public String toString() {
        return "Pegawai Harian  : " + super.getNama() +
                "\nNo. KTP         : " + super.getNoKTP() +
                "\nUpah/jam        : " + upahPerJam +
                "\nTotal jam kerja : " + totalJam + super.gaji()+"\n";
    }

    @Override
    public double gaji() {
        if (totalJam <=40) return totalJam*upahPerJam;
        return 40*upahPerJam+(totalJam-40)*upahPerJam*1.5;
    }

    public double getUpahPerJam() {
        return upahPerJam;
    }

    public void setUpahPerJam(double upahPerJam) {
        this.upahPerJam = upahPerJam;
    }

    public int getTotalJam() {
        return totalJam;
    }

    public void setTotalJam(int totalJam) {
        this.totalJam = totalJam;
    }
}
