public class Heal extends Skill {

    public Heal() {
        // Эцэг Skill классын constructor-ийг дуудна
        super("Heal", 20);
    }

    @Override
    public void cast(Character caster, Character target) {
        // 1. Character класс доторх heal методыг жижиг үсгээр дуудна
        caster.heal(30);

        // 2. Character класс доторх mp талбараас хасна
        // 'mp' нь жижиг үсгээр бичигдсэн эсэхийг нягтлаарай
        caster.mp = caster.mp - 20;
    }
}