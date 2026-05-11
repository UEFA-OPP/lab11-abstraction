package assignments.skills;

public interface Usable {
    void use();

    default void getDescription() {
        System.out.println("This is a usable item or skill.");
    }
}
