public class Potion implements Usable {

    @Override
    public void use(Character user) {
        if (user == null) return;
        user.heal(50);
    }

    @Override
    public void announce() {
        System.out.println("Using item");
    }
}