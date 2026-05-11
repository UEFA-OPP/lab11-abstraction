package assignments.skills;

public class Potion implements Usable {
    @Override
    public void use() {
        System.out.println("Drinking potion... Health restored!");
    }
}
