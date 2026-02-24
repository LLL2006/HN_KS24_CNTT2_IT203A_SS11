package MiniProject;

public class Mage extends GameCharacter implements ISkill {
    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.print("2. [Pháp sư] " + name + " tấn công phép lên " + target.getName() + "!");
        if (mana >= 5) {
            mana -= 5;
            target.takeDamage(attackPower);
        } else {
            System.out.print(" (Hết mana, đánh yếu) ");
            target.takeDamage(attackPower / 2);
        }
    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            mana -= 50;
            System.out.println("2. [Pháp sư] " + name + " dùng chiêu cuối: HỎA CẦU!");
            target.takeDamage(attackPower * 3);
        } else {
            System.out.println("   -> " + name + " không đủ mana để dùng chiêu cuối!");
        }
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(" | Mana: " + mana);
    }
}
