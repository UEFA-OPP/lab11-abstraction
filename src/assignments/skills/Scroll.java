package assignments.skills;

public class Scroll extends Skill implements Usable {
    public Scroll(String name, int level) {
        super(name, level);
    }

    @Override
    public void cast(assignments.skills.Character target) {
        System.out.println("Using " + name + " on " + target.getName());
    }

    @Override
    public void use() {
        System.out.println("Scroll is used.");
    }
}
