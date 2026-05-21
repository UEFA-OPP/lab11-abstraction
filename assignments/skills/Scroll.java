package assignments.skills;

public class Scroll implements Usable {
    @Override
    public void use(Character user) {
        user.mp += 30;
    }
}