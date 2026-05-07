public abstract class Skill {
    protected String name;
    protected int mpCost;

    public Skill(String name, int mpCost) {
        this.name = name;
        this.mpCost = mpCost;
    }

    // Abstract method: Яаж cast хийхийг дэд ангиуд нь шийднэ
    public abstract void cast(Character caster, Character target);

    public String getName() {
        return name;
    }

    public int getMpCost() {
        return mpCost;
    }
}