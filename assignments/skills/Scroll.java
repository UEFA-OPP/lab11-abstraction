public class Scroll implements Usable {

    @Override
    public void use(Character user) {
        if (user == null) return;
        user.mp += 30;
    }

    @Override
    public void announce() {
        System.out.println("Using item");
    }
}