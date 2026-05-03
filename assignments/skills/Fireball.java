public class Fireball extends Skill {
    public Fireball() {
        super("Fireball", 30);
    }

    @Override
    public void cast(Character caster, Character target) {
        // Character дотор takeDamage(int amount) метод байгаа тул энэ нь зөв
        target.takeDamage(40);

        // АЛДААТАЙ БАЙСАН ХЭСЭГ: getMp() биш шууд .mp ашиглана
        caster.mp -= 30;
    }
}