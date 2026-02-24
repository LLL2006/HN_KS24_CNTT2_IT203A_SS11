package MiniProject;

public class ArenaApp {
    public static void main(String[] args) {
        System.out.println("=== ARENA OF HEROES ===");

        // 1. Khai báo danh sách nhân vật
        GameCharacter[] characters = new GameCharacter[3];

        characters[0] = new Warrior("Yasuo", 500, 50, 20);
        characters[1] = new Mage("Veigar", 300, 40, 200);

        // 2. Tạo quái vật bằng Anonymous Class
        characters[2] = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("3. [Quái vật] Goblin cắn trộm " + target.getName() + "...");
                target.takeDamage(10); // Sát thương cố định
            }
        };

        System.out.println("Đã khởi tạo " + GameCharacter.count + " nhân vật tham gia đấu trường.\n");

        // 3. Giả lập lượt đấu (Sử dụng Đa hình)
        // Chiến binh đánh Goblin
        characters[0].attack(characters[2]);

        // Pháp sư dùng chiêu cuối lên Chiến binh
        if (characters[1] instanceof ISkill) {
            ((ISkill) characters[1]).useUltimate(characters[0]);
        }

        // Goblin phản công Pháp sư
        characters[2].attack(characters[1]);

        // 4. Thống kê thông số sau lượt đấu
        System.out.println("\n=== THÔNG SỐ SAU LƯỢT ĐẤU ===");
        for (GameCharacter c : characters) {
            if (c != null) {
                c.displayInfo();
            }
        }
    }
}
