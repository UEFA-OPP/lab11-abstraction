public class Scroll implements Usable {


    @Override
    public void use(Character user) {
     
        user.mp += 30;
        
        System.out.println(user.getName() + " reads a magical Scroll and recovered 30 MP!");
    }
}
