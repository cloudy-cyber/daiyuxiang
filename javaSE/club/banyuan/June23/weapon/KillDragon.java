package club.banyuan.June23.weapon;

import java.util.Random;

public class KillDragon implements Weapon{
    @Override
    public String getName() {
        return "屠龙刀";
    }

    @Override
    public int attack() {
        Random random=new Random();
        return random.nextInt(10)+20;
    }
}
