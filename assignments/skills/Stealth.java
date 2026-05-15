

public class Stealth extends Skill {
    public Stealth() {
        super("Stealth", 10);
    }

    @Override
    public void cast(Character caster, Character target) {
        // MP зарцуулалтыг хасна, харин target-д damage учруулахгүй
        caster.mp -= 10;
    }
} // Энэ хаалт заавал байх ёстой!