public abstract class Skill {

    // Талбарууд: Дэд ангиуд болон нэг package доторх классууд хандах боломжтой
    protected String name;
    protected int mpCost;

    // Байгуулагч функц (Constructor)
    public Skill(String name, int mpCost) {
        this.name = name;
        this.mpCost = mpCost;
    }

    /**
     * Абстракт метод: Ур чадварыг ашиглах логик.
     * Энэ методыг Skill-ээс удамшсан дэд ангиуд заавал хэрэгжүүлэх ёстой.
     *
     * @param caster Ур чадварыг ашиглаж буй дүр
     * @param target Ур чадварт өртөж буй дүр
     */
    public abstract void cast(Character caster, Character target);

    // Getter методууд
    public String getName() {
        return name;
    }

    public int getMpCost() {
        return mpCost;
    }
}