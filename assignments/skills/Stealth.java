public class Stealth extends Skill {

    public Stealth() {
        super("Stealth", 10);
    }

    @Override
    public void cast(Character caster, Character target) {
        caster.mp -= 10;
    }
}