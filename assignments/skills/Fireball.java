fireball.java public class Fireball extends Skill {
    public Fireball() {
        super("Fireball", 30);
    }

    @Override
    public void cast(Character caster, Character target) {
        if (target != null) {
            target.takeDamage(40);
            caster.mp -= this.mpCost;
        }
    }
}