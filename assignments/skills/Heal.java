public class Heal extends Skill {

    public Heal() {
        super("Heal", 20);
    }

    @Override
    public void cast(Character caster, Character target) {
        if (caster == null) return;

        caster.heal(30);
        caster.mp -= 20;
    }
}