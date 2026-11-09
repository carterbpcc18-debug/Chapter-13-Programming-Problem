import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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

        System.out.println("===== SPELL CASTING HISTORY =====");
        readLog("spell_log.txt");

        System.out.println();
        System.out.println("===== TESTING MISSING FILE =====");
        readLog("missing_grimoire.txt");
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

    public static void readLog(String fileName) {

        try (Scanner reader = new Scanner(new File(fileName))) {

            while (reader.hasNextLine()) {
                System.out.println(reader.nextLine());
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Unable to find file: " + fileName);
        }
    }
}