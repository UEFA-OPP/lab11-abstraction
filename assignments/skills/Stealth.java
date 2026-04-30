public class Stealth extends Skill {

    public Stealth() {
        super("Stealth", 10);
    }

    @Override
    public void cast(Character caster, Character target) {
    
    
        caster.mp -= 10;
        
        System.out.println(caster.getName() + " fades into the shadows using Stealth!");
    }
}
