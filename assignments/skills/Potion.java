public class Potion implements Usable {
    @Override
    public void use(Character user) {
        user.heal(50);
    }
}