//nama : Wardah Zahra
//nim : 215150700111011
package Game;

import java.util.concurrent.ThreadLocalRandom;

public class Magician extends Character {
    public Magician() {
        super();
        super.setHp(100);
        super.setAtk(60);
        super.setDef(10);
    }

    @Override
    public boolean attack() {
        return ThreadLocalRandom.current().nextInt(1, 100) < 35;
    }
}
