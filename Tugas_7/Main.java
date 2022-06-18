package Kantor;

public class Main {
    public static void main(String[] args) {
//        output(new PegawaiTetap("Bayu","350728490327424892342",2000000));
//        output(new PegawaiHarian("Edo","350728490327424892343",8500,40));
//        output(new Sales("Tika","350728490327424892344",50,50000));

        System.out.println("======= Pegawai  Tetap =======");
        output(new PegawaiTetap("Shely","3173092704827775",3000000));
        output(new PegawaiTetap("Lalisa","3890754218946242",3500000));
        output(new PegawaiTetap("Tatang","3786494751829056",2500000));

        System.out.println("======= Pegawai Harian =======");
        output(new PegawaiHarian("Hana","3185620471957362",9000,42));
        output(new PegawaiHarian("Septiani","3127038572048124",8000,38));
        output(new PegawaiHarian("Jeany","3146502658302658",7500,35));

        System.out.println("============ Sales ===========");
        output(new Sales("Rijal","3173093103040008",45,45000));
        output(new Sales("Albudi","3173092704827775",30,55000));
        output(new Sales("Sukma","3170264807529471",55,40000));

    }

    public static void output(Pegawai p){
        System.out.println(p.toString());
    }
}
