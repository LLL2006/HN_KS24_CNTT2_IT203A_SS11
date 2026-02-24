package MiniProject;

public class Warrior extends GameCharacter implements ISkill {
    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("1. [Chiến binh] " + name + " vung kiếm tấn công " + target.getName() + "!");
        target.takeDamage(this.attackPower);
    }

    @Override
    public void takeDamage(int amount) {
        // Giảm sát thương nhờ giáp
        int realDamage = Math.max(0, amount - armor);
        super.takeDamage(realDamage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("2. [Chiến binh] " + name + " dùng chiêu cuối: ĐẤM NGÀN CÂN!");
        target.takeDamage(this.attackPower * 2);
        // Tác dụng phụ: mất 10% HP hiện tại
        int selfDamage = (int)(this.hp * 0.1);
        this.hp -= selfDamage;
        System.out.println("   -> " + name + " gắng sức và tự mất " + selfDamage + " HP.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Giáp: " + armor);
    }
}
