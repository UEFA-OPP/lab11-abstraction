public class Scroll implements Usable {

    @Override
    public void use(Character user) {
        user.mp += 30;
    }

    @Override
    public void announce() {
        System.out.println("Using item");
    }
}