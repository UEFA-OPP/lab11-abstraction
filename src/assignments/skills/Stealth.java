package assignments.skills;

public class Stealth extends Skill {
    public Stealth(int level) {
        super("Stealth", level);
    }

    @Override
    public void cast(assignments.skills.Character target) {
        System.out.println(name + " cast on " + target.getName() + " with level " + level);
    }
}
