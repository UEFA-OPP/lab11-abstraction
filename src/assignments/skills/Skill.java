package assignments.skills;

public abstract class Skill {
    protected String name;
    protected int level;

    public Skill(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public abstract void cast(assignments.skills.Character target);

    public String getName() { return name; }
}
