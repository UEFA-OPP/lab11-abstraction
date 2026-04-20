public class HealingPotionSkill extends Skill implements Usable {

    public HealingPotionSkill() {
        super("HealingPotion", 0);
    }

    @Override
    public void cast(Character caster, Character target) {
        caster.heal(20);
    }

    @Override
    public void use(Character user) {
        user.heal(30);
    }

    @Override
    public void announce() {
        System.out.println("Using item");
    }
}