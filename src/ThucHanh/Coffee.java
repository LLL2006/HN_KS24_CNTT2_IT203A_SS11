package ThucHanh;

public class Coffee extends Drink{
    private boolean hasMilk;

    public Coffee(int id, String name, int price, boolean hasMilk) {
        super(id, name, price);
        this.hasMilk = hasMilk;
    }

    @Override
    public double calculatePrice() {
        if(hasMilk == true) {
            price = price + 5000;
        } else if(hasMilk == false) {
            price = price;
        }

        return price;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        if(hasMilk == true) {
            System.out.println("Có Sữa");
        } else if(hasMilk == false) {
            System.out.println("Đen đá");
        }
    }
}
