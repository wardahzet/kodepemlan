import java.util.Scanner;

public class Selde {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();
        System.out.println(angka + selde(angka));
    }

    static String selde (int angka){
        int asli = angka;
        int balik = 0;
        while (angka > 0){
            balik = (balik * 10) + (angka % 10);
            angka /= 10;
        }
        if (asli == balik) return " adalah selde.";
        return " bukan selde.";
    }
}
