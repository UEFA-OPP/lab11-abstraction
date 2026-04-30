public interface Usable {

    void use(Character user);

    // ─────── 🔴 Bonus (10 оноо) ───────

    default void announce() {
        System.out.println("Using item");
    }
}
