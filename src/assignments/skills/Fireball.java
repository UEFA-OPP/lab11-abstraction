package assignments.skills;

public class Fireball extends Skill {
    public Fireball(int level) {
        super("Fireball", level);
    }

    @Override
    public void cast(assignments.skills.Character target) {
        System.out.println(this.name + " cast on " + target.getName());
    }
}
