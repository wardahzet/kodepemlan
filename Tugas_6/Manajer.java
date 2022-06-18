package Human;

class Manajer extends Pekerja {
    private int lamaKerja;

    Manajer(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah, int lamaKerja) {
        super(jamKerja, hariKerja, NIP, nama, NIK, jenisKelamin, menikah);
        this.lamaKerja = lamaKerja;
    }

    @Override
    public double getPendapatan(){
        double pendapatan = super.getPendapatan();
        super.setBonus(super.getBonus()*1.3);
        return pendapatan + 15;
    }

    @Override
    public String tostring(){
        Main.jumlahManajer++;
        return super.tostring() +
                "\nLama Kerja     : " + lamaKerja + " hari";
    }

    public int getLamaKerja() {
        return lamaKerja;
    }

    public void setLamaKerja(int lamaKerja) {
        this.lamaKerja = lamaKerja;
    }
}
