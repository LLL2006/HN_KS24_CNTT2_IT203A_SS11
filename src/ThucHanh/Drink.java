package ThucHanh;

public abstract class Drink {
    protected int id;
    protected String name;
    protected double price;

    public Drink(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public abstract double calculatePrice();

    public void displayInfo() {
        System.out.println("Mã: " + id + " | Tên: " + name + " | Giá: " + price);
    }
}
