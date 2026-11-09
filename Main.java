public class Main {

    public static void main(String[] args) {

        SpellCaster caster = new SpellCaster();

        String[] spells = {
            "Arcane Fireball",
            "Shadow Bolt",
            "Frost Nova",
            "Lightning Strike",
            "Healing Aura"
        };

        for (String spell : spells) {

            try {
                caster.castSpell(spell);
            }
            catch (ManaLeakException e) {
                System.out.println("WARNING: Mana leak detected! " + e.getMessage());
            }
            catch (FizzleException e) {
                System.out.println("WARNING: Spell fizzled! " + e.getMessage());
            }
            catch (SpellException e) {
                System.out.println("GENERAL SPELL ERROR: " + e.getMessage());
            }

            System.out.println();
        }
    }
}