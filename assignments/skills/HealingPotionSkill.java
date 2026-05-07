public class HealingPotionSkill extends Skill implements Usable {

    public HealingPotionSkill() {
        // Skill-ийн конструктөрийг дуудна: нэр нь "HealingPotion", MP cost нь 0
        super("HealingPotion", 0);
    }

    // Skill-ээс ирсэн cast() методыг заавал хэрэгжүүлнэ
    @Override
    public void cast(Character caster, Character target) {
        // Кастер өөрийгөө 20-оор анагаана
        caster.heal(20);
    }

    // Usable-ээс ирсэн use() методыг заавал хэрэгжүүлнэ
    @Override
    public void use(Character user) {
        // Хэрэглэгч өөрийгөө 30-аар анагаана
        user.heal(30);
    }
}