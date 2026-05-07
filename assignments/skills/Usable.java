public interface Usable {
    void use(Character user);

    // Энэ хэсгийг нэмээрэй:
    default void announce() {
        System.out.println("Using item");
    }
}