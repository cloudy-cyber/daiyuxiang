//package club.banyuan.June22.Practice.Cake;

public abstract class Cake {

    protected int id;
    protected double price;

    public Cake(int n, double r) {
        id = n;
        price = r;
    }

    public abstract double calcPrice();

    public String toString() {
        return id + "\t" + price;
    }
}
