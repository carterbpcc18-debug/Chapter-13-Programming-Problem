public class SpellCaster {

    public void castSpell(String spellName) throws SpellException {

        int result = (int) (Math.random() * 3);

        if (result == 0) {
            System.out.println(spellName + " was successfully cast!");
            System.out.println("The magical energy is stable.");
        }
        else if (result == 1) {
            throw new ManaLeakException(
                spellName + " caused a dangerous mana leak!"
            );
        }
        else {
            throw new FizzleException(
                spellName + " fizzled during casting!"
            );
        }
    }
}