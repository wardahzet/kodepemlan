package Human;

class Manusia {
    private String nama;
    private String NIK;
    private boolean jk;
    private boolean menikah;

    Manusia(String nama, String NIK, boolean jk, boolean menikah) {
        this.nama = nama;
        this.NIK = NIK;
        this.jk = jk;
        this.menikah = menikah;
    }

    public String jk(){
        if (jk) return "Laki-laki";
        return "Perempuan";
    }

    public double getTunjangan(){
        if (menikah) {
            if (jk) return 25;
            return 20;
        } return 15;
    }

    public double getPendapatan(){
        return getTunjangan();
    }

    public String tostring(){
        Main.jumlahManusia++;
        return "\nNama           : "+nama +
                "\nNIK            : "+NIK +
                "\nJenis Kelamin  : "+jk() +
                "\nPendapatan     : "+getPendapatan()+"$";
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public boolean isJk() {
        return jk;
    }

    public void setJk(boolean jk) {
        this.jk = jk;
    }

    public boolean isMenikah() {
        return menikah;
    }

    public void setMenikah(boolean menikah) {
        this.menikah = menikah;
    }
}
