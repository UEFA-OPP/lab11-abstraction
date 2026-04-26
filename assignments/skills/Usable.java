public interface Usable {

    void use(Character user);

    default void announce() {
        System.out.println("Using item");
    }
}