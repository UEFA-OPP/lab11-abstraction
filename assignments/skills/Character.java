package assignments.skills;

public class Character {
    public String name;
    public int hp;
    public int mp;

    public Character(String name, int hp, int mp) {
        this.name = name;
        this.hp = hp;
        this.mp = mp;
    }

    public void takeDamage(int amount) {
        this.hp -= amount;
        if (this.hp < 0) this.hp = 0;
    }

    public void heal(int amount) {
        this.hp += amount;
    }
}