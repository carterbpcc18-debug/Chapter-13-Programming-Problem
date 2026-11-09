public class Main {

    public static void main(String[] args) {

        SpellCaster caster = new SpellCaster();

        try {
            caster.castSpell("Arcane Fireball");
        }
        catch (SpellException e) {
            System.out.println("Spell casting failed: " + e.getMessage());
        }
    }
}