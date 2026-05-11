package assignments.skills;

public class Heal extends Skill {
    public Heal(int level) {
        super("Heal", level);
    }

    @Override
    public void cast(assignments.skills.Character target) {
        System.out.println(name + " cast on " + target.getName() + " with level " + level);
    }
}
