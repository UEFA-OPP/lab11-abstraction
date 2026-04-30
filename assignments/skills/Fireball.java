public class Fireball extends Skill {

    public Fireball() {
        
        super("Fireball", 30);
    }

    @Override
    public void cast(Character caster, Character target) {
        
        target.takeDamage(40);
        caster.mp -= 30;

        System.out.println(caster.getName() + " launched a massive Fireball at " + target.getName() + "!");
    }
}
