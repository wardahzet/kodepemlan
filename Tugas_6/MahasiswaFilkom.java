package Human;

class MahasiswaFilkom extends Manusia {
    private String NIM;
    private double IPK;

    MahasiswaFilkom(String nama, String NIK, boolean jenisKelamin, boolean menikah, String NIM, double IPK) {
        super(nama, NIK, jenisKelamin, menikah);
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public String getStatus(){
        int angkatan = Integer.parseInt(NIM.substring(0,2)) + 2000;
        return switch (NIM.charAt(6)) {
            case '2' -> "Teknik Meniup Gelembung, ";
            case '3' -> "Teknik Berburu Ubur Ubur, ";
            case '4' -> "Sistem Perhamburgeran, ";
            case '6' -> "Pendidikan Chum Bucket, ";
            case '7' -> "Teknologi Telepon Kerang, ";
            default -> "Tidak diketahui";
        } + angkatan;
    }

    @Override
    public double getPendapatan(){
        int beasiswa;
        if (IPK >= 3.5 && IPK <=4) beasiswa = 75;
        else if (IPK >= 3) beasiswa = 50;
        else beasiswa = 0;
        return super.getPendapatan()+beasiswa;
    }

    @Override
    public String tostring(){
        Main.jumlahMahasiswa++;
        return super.tostring() +
                "\nIPK            : " + IPK +
                "\nNIM            : " + NIM +
                "\nStatus         : " + getStatus();
    }

    public String getNIM() {
        return NIM;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public double getIPK() {
        return IPK;
    }

    public void setIPK(double IPK) {
        this.IPK = IPK;
    }
}
