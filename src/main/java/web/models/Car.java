package web.models;

public class Car {

    private String model;
    private int hp;
    private int price;

    public Car(String model, int hp, int price) {
        this.model = model;
        this.hp = hp;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
