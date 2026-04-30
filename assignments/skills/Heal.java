public class Heal extends Skill {

    public Heal() {
        super("Heal", 20);
    }

    @Override
    public void cast(Character caster, Character target) {
      
        caster.heal(30);
        
   
        caster.mp -= 20;
        
        System.out.println(caster.getName() + " casted Heal and recovered HP!");
    }
}
