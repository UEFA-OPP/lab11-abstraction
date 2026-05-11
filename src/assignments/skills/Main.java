package assignments.skills;

public class Main {
    static void main() {
        Character hero = new Character("Dungeon Master");

        Skill fireball = new Fireball(5);
        Skill heal = new Heal(3);

        System.out.println("--- Testing Skills ---");
        fireball.cast(hero);
        heal.cast(hero);

        System.out.println("\n--- Testing Usables ---");
        Usable potion = new Potion();
        Scroll scroll = new Scroll("Magic Scroll", 10);

        potion.use();
        scroll.use();

        scroll.cast(hero);
    }
}
