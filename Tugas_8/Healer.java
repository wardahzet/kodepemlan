//nama : Wardah Zahra
//nim : 215150700111011
package Game;

import java.util.concurrent.ThreadLocalRandom;

public class Healer extends Character {

    public Healer() {
        super();
        super.setHp(70);
        super.setAtk(10);
        super.setDef(10);
    }

    @Override
    public boolean attack() {
        return ThreadLocalRandom.current().nextInt(1, 100) <= 85;
    }

    public void heal() {
        super.setHp(super.getHp() + 25);
    }
}
