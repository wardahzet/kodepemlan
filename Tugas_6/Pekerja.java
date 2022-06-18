package Human;

class Pekerja extends Manusia {
    private double gaji;
    private double bonus;
    private int jamKerja;
    private int hariKerja;
    private String NIP;

    Pekerja(int jamKerja, int hariKerja, String NIP, String nama, String NIK, boolean jenisKelamin, boolean menikah) {
        super(nama, NIK, jenisKelamin, menikah);
        this.jamKerja = jamKerja;
        this.hariKerja = hariKerja;
        this.NIP = NIP;
    }

    public String getStatus(){
        String cabang = switch (NIP.charAt(0)){
            case '1' -> "Mondstadt";
            case '2' -> "Liyue";
            case '3' -> "Inazuma";
            case '4' -> "Sumeru";
            case '5' -> "Fontaine";
            case '6' -> "Natlan";
            case '7' -> "Snezhnaya";
            default -> "Tidak ditemukan";
        };
        String department = switch (NIP.charAt(6)){
            case '1' -> "Pemasaran";
            case '2' -> "Humas";
            case '3' -> "Riset";
            case '4' -> "Teknologi";
            case '5' -> "Personalia";
            case '6' -> "Akademik";
            case '7' -> "Administrasi";
            case '8' -> "Operasional";
            case '9' -> "Pembangunan";
            default -> "Tidak ditemukan";
        };
        return department+ ", " +cabang+" cabang "+NIP.charAt(2);
    }

    @Override
    public double getPendapatan(){
        gaji = hariKerja*jamKerja*15;
        int harilibur = (hariKerja/7*2);
        int harilembur = (hariKerja/7*5) + hariKerja%7;
        bonus = 0;
        if (hariKerja%7 == 6) {
            harilibur++; harilembur--;
        }
        if (jamKerja > 7) bonus += harilembur * (jamKerja-7) * 7;
        bonus += harilibur * jamKerja * 20;
        return super.getPendapatan() + gaji + bonus;
    }

    @Override
    public String tostring(){
        Main.jumlahPekerja++;
        return super.tostring()+
                "\nBonus          : "+bonus+"$"+
                "\nGaji           : "+gaji+"$"+
                "\nStatus         : "+getStatus();
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double getGaji() {
        return gaji;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public int getHariKerja() {
        return hariKerja;
    }

    public void setHariKerja(int hariKerja) {
        this.hariKerja = hariKerja;
    }

    public String getNIP() {
        return NIP;
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }
}
