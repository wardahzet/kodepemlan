package Human;

public class Main {
    static int jumlahManusia;
    static int jumlahMahasiswa;
    static int jumlahPekerja;
    static int jumlahManajer;

    public static void main(String[] args) {
        Manusia man1 = new Manusia("Aku", "3923842934", true, true);
        System.out.println(man1.tostring());

        MahasiswaFilkom mhs1 = new MahasiswaFilkom("I Putu Yoga", "351923848239", false, false, "205150601111018", 3.70);
        System.out.println(mhs1.tostring());

        Pekerja pekerja1 = new Pekerja(7, 22, "195102439283", "Iqbal Biondy", "351717969", true, true);
        System.out.println(pekerja1.tostring());

        Manajer manajer1 = new Manajer(9, 20, "204837283728", "Lyra Hertin", "351707384392", false, false, 1500);
        System.out.println(manajer1.tostring());

//        object Manusia
        Manusia man2 = new Manusia("Shelly", "3172893208437718", false, true);
        System.out.println(man2.tostring());
        Manusia man3 = new Manusia("Rei", "3178947303758821", true, false);
        System.out.println(man3.tostring());
        Manusia man4 = new Manusia("Amy", "3174592659371947", false, false);
        System.out.println(man4.tostring());
        Manusia man5 = new Manusia("Katherine", "3178075689301112", false, true);
        System.out.println(man5.tostring());

//        object Mahasiswa
        MahasiswaFilkom mhs2 = new MahasiswaFilkom("Sukma","3173092704827775", false, false, "259746693835046",3.4);
        System.out.println(mhs2.tostring());
        MahasiswaFilkom mhs3 = new MahasiswaFilkom("Diana", "3173093103040008", false, true, "2309477900222041",3.5);
        System.out.println(mhs3.tostring());
        MahasiswaFilkom mhs4 = new MahasiswaFilkom("Rijal", "3172097409060002", true, false, "260864321789023", 2.9);
        System.out.println(mhs4.tostring());
        MahasiswaFilkom mhs5 = new MahasiswaFilkom("Albudi", "3170264807529471", true, false, "260864321789023", 4.0);
        System.out.println(mhs5.tostring());

//        object Pekerja
        Pekerja pekerja2 = new Pekerja(6, 24, "469461686559", "Lalisa", "3890754218946242", false, true);
        System.out.println(pekerja2.tostring());
        Pekerja pekerja3 = new Pekerja(8, 20, "727648436275", "Tatang", "3786494751829056", true, false);
        System.out.println(pekerja3.tostring());
        Pekerja pekerja4 = new Pekerja(9, 21, "382665887254", "Sarah", "3187453729174906", false, false);
        System.out.println(pekerja4.tostring());
        Pekerja pekerja5 = new Pekerja(7, 18, "178045789541", "Kiki", "3187457895746629", false, false);
        System.out.println(pekerja5.tostring());

//        object Manager
        Manajer manajer2 = new Manajer(8, 20, "513846174105", "Hana", "3164960236785924", false, true, 1000);
        System.out.println(manajer2.tostring());
        Manajer manajer3 = new Manajer(7, 21, "637485390348", "Septiani", "3146502658302658", true, false, 1300);
        System.out.println(manajer3.tostring());
        Manajer manajer4 = new Manajer(6, 22, "173275755765", "Dimas", "3185620471957362", true, true, 1400);
        System.out.println(manajer4.tostring());
        Manajer manajer5 = new Manajer(9, 27, "171934781354", "Jeany", "3127038572048124", false, true, 1200);
        System.out.println(manajer5.tostring());

//        Output total Manusia, Mahasiswa, Pekerja dan Manager
        System.out.println("\n============== TOTAL ==============");
        System.out.println("Jumlah Manusia   : "+jumlahManusia);
        System.out.println("Jumlah Mahasiswa : "+jumlahMahasiswa);
        System.out.println("Jumlah Pekerja   : "+jumlahPekerja);
        System.out.println("Jumlah Manajer   : "+jumlahManajer);
    }
}
