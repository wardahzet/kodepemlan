//nama : Wardah Zahra
//nim : 215150700111011
package Game;

import java.util.concurrent.ThreadLocalRandom;

public class Titan extends Character{
    public Titan() {
        super();
        super.setHp(200);
        super.setAtk(45);
        super.setDef(0);
    }

    @Override
    public boolean attack() {
        return ThreadLocalRandom.current().nextInt(1, 100) <= 40;
    }
}
