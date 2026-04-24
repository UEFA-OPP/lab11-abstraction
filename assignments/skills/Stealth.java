public class Stealth extends Skill {

    public Stealth() {
        super("Stealth", 10);
    }

    @Override
    public void cast(Character caster, Character target) {
        if (caster == null) return;

        caster.mp -= 10;
    }
}