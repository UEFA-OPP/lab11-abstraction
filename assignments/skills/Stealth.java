public class Stealth extends Skill {
    public Stealth() {
        super("Stealth", 10);
    }

    @Override
    public void cast(Character caster, Character target) {
        if (caster.mp >= this.mpCost) {
            caster.mp -= this.mpCost;
            System.out.println(caster.name + " fades into the shadows using Stealth!");
        } else {
            System.out.println("Not enough MP for Stealth!");
        }
    }
}