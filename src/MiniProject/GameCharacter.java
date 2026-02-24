package MiniProject;

public abstract class GameCharacter {
    protected String name;
    protected int hp;
    protected int attackPower;

    // Biến static để đếm tổng số nhân vật trên toàn hệ thống
    public static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++; // Mỗi lần new một nhân vật, biến count sẽ tăng
    }

    // Các phương thức chung
    public abstract void attack(GameCharacter target);

    public void takeDamage(int amount) {
        this.hp -= amount;
        System.out.println("   -> " + name + " mất " + amount + " máu. HP còn: " + (hp > 0 ? hp : 0));
        if (this.hp <= 0) {
            System.out.println("   [!] " + name + " đã bị hạ gục!");
        }
    }

    public void displayInfo() {
        System.out.print("Tên: " + name + " | HP: " + (hp > 0 ? hp : 0));
    }

    public String getName() { return name; }
    public int getHp() { return hp; }
}
