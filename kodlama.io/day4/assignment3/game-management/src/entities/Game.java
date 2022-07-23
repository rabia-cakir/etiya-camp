package entities;

public class Game {
    Campaign campaign;
    private int id;
    private double price;
    private String name;
    private double discountedPrice;

    public Game() {
    }

    public Game(int id, double price, String name) {
        this.id = id;
        this.price = price;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountedPrice() {
        return discountedPrice;
    }

    public void setDiscountedPrice(double discountedPrice) {
        this.discountedPrice = discountedPrice;
    }

}
