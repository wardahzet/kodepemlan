//nama : Wardah Zahra
//nim : 215150700111011
package Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static Character player;
    static Character titan;
    static String name;
    static int chara;
    static int turn = 0;

    public static void main(String[] args) {
        System.out.println("Selamat Datang di Game Defend Filkom");
        System.out.print("Silakan masukkan nama player : ");
        name = sc.nextLine();
        boolean valid = true;
        while (valid) {
            System.out.println("Silakan pilih karakter yang anda inginkan : ");
            System.out.println("""
                    1. Magician
                    2. Healer
                    3. Warrior""");
            try {
                chara = sc.nextInt();
                if (chara < 1 || chara > 3) throw new NullPointerException();
                valid = false;
            } catch (InputMismatchException | NullPointerException e ) {
                if (e.getClass().getSimpleName().equals("InputMismatchException")) sc.next();
                System.out.println("Harap Masukkan Angka!");
            }
        }
        switch (chara){
            case 1 -> player = new Magician();
            case 2 -> player = new Healer();
            case 3 -> player = new Warrior();
        }
        titan = new Titan();

        System.out.println("Selamat Datang " + name);
        player.info();
        do {
            System.out.printf("========== Turn %2d ==========%n", ++turn);
            titan.receiveDamage(player.getAtk() - titan.getDef());
            if (titan.getHp() < 0) titan.setHp(0);
            System.out.printf("%-12s: %d%n","Titan",titan.getHp());
            player.receiveDamage(titan.getAtk() - player.getDef());
            if (player.getHp() < 0) player.setHp(0);
            System.out.printf("%-12s: %d%n",name,player.getHp());
        } while (player.getHp() > 0 && titan.getHp() > 0);

        System.out.println("============================");
        if (titan.getHp() == 0 && player.getHp() == 0) System.out.println("Pertarungan Seri");
        else {
            if (titan.getHp() == 0) System.out.println(name + " Menang");
            if (player.getHp() == 0) System.out.println("Titan Menang");
        }
        System.out.println("========== PLAYER ==========");
        player.info();
        System.out.println("========== MUSUH ===========");
        titan.info();
    }
}

