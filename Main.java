import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

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
                logAttempt(spell + " - Casting successful.");
            }
            catch (ManaLeakException e) {
                System.out.println("WARNING: Mana leak detected! " + e.getMessage());
                logAttempt(spell + " - ManaLeakException: " + e.getMessage());
            }
            catch (FizzleException e) {
                System.out.println("WARNING: Spell fizzled! " + e.getMessage());
                logAttempt(spell + " - FizzleException: " + e.getMessage());
            }
            catch (SpellException e) {
                System.out.println("GENERAL SPELL ERROR: " + e.getMessage());
                logAttempt(spell + " - SpellException: " + e.getMessage());
            }

            System.out.println();
        }
    }

    public static void logAttempt(String entry) {

        try (PrintWriter writer = new PrintWriter(
                new FileWriter("spell_log.txt", true))) {

            writer.println(entry);

        }
        catch (IOException e) {
            System.out.println("Unable to write to spell_log.txt: " + e.getMessage());
        }
    }
}