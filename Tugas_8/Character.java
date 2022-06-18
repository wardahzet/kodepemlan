//nama : Wardah Zahra
//nim : 215150700111011
package Game;

import java.util.Random;

public abstract class Character {
    private int def;
    private int atk;
    private int hp;

    public abstract boolean attack();
    public void receiveDamage(int damage){
        if (Main.player instanceof Healer && Main.turn % 2 == 0) {
            if (getClass().getSimpleName().equals("Titan")) {
                System.out.println("Menggunakan skill heal");
                ((Healer) Main.player).heal();
            }
        }
        if (getClass().getSimpleName().equals("Titan")) {
            if (Main.player.attack()) hp -= damage;
        }
        else {
            if (Main.titan.attack()) hp -= damage;
        }
    }
    public void info(){
        System.out.println("---------- STATUS ----------");
        System.out.println("Role        : "+getClass().getSimpleName());
        System.out.println("HP          : "+hp);
        System.out.println("Attack      : "+atk);
        System.out.println("Defense     : "+def);
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

}
