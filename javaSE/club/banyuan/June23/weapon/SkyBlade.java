package club.banyuan.June23.weapon;

public class SkyBlade implements Weapon{
    @Override
    public String getName() {
        return "倚天剑";
    }

    @Override
    public int attack() {
        return 25;
    }
}
