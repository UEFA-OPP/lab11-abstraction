public class Potion implements Usable {

    @Override
    public void use(Character user) {
      
        user.heal(50);
        
        System.out.println(user.getName() + " used a Potion and recovered 50 HP!");
    }
}
