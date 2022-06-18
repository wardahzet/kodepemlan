import java.util.Scanner;

public class MenghitungLuas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Persegi persegi = new Persegi();
        Segitiga segitiga = new Segitiga();
        Lingkaran lingkaran = new Lingkaran();
        int menu = sc.nextInt();
        if (menu == 1) {
            persegi.sisi = sc.nextInt();
            System.out.println(persegi.luas());
        } else if (menu == 2) {
            segitiga.alas = sc.nextInt();
            segitiga.tinggi = sc.nextInt();
            System.out.println(segitiga.luas());
        } else if (menu == 3) {
            lingkaran.jari2 = sc.nextInt();
            System.out.print((double) lingkaran.luas());
        } else System.out.println("Input yang anda masukan tidak sesuai");
    }
}

class Segitiga {
    int alas;
    int tinggi;
    int luas (){
        return alas*tinggi/2;
    }
}

class Persegi {
    int sisi;
    int luas (){
        return (int) Math.pow(sisi,2);
    }
}

class Lingkaran {
    int jari2;
    int luas (){
        if (jari2%7 != 0) return (int) (3.14*Math.pow(jari2,2));
        return (int) (22/7*Math.pow(jari2,2));
    }
}
