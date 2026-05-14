public interface Usable {
    void use(Character user);

    // 🔴 Bonus: Default method
    default void announce() {
        System.out.println("Using item");
    }
}