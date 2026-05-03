public class Scroll implements Usable {
    private Skill skill;

    public Scroll() {
        this.skill = null;
    }

    public Scroll(Skill skill) {
        this.skill = skill;
    }

    @Override
    public void use(Character user) {
        // Тестийн шаардлагаар MP-г 30-аар нэмэх ёстой
        user.mp += 30;

        if (skill != null) {
            System.out.println(user.name + " reads a scroll of " + skill.getName() + " and recovers 30 MP!");
            skill.cast(user, user);
        } else {
            System.out.println(user.name + " reads an empty scroll and recovers 30 MP.");
        }
    }
}
