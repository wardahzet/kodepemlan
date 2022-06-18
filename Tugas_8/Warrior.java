//nama : Wardah Zahra
//nim : 215150700111011
package Game;

import java.util.concurrent.ThreadLocalRandom;

public class Warrior extends Character {
    public Warrior() {
        super();
        super.setHp(80);
        super.setAtk(25);
        super.setDef(30);
    }

    @Override
    public boolean attack() {
        return ThreadLocalRandom.current().nextInt(1, 100) <= 60;
    }
}
