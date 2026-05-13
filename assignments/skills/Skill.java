

public abstract class Skill {
    protected String name;
    protected int mpCost;

    public Skill(String name, int mpCost) {
        this.name = name;
        this.mpCost = mpCost;
    }

    // Abstract method: Body-гүй байна. Дэд ангиуд заавал override хийнэ.
    public abstract void cast(Character caster, Character target);

    public String getName() { return name; }
    public int getMpCost() { return mpCost; }
}