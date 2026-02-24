package ThucHanh;

public class FruitJuice extends Drink implements IMixable{
    private int discountPercent;

    public FruitJuice(int id, String name, int price, int discountPercent) {
        super(id, name, price);
        this.discountPercent = discountPercent;
    }

    @Override
    public double calculatePrice() {
        return price - (price * discountPercent / 100.0);
    }

    @Override
    public void mix() {
        System.out.println("Đang ép trái cây tươi...");
    }
}
