public class Wizard {
    
    String name;
    Spell spell;

    public Wizard(String name, Spell spell) {
        this.name = name;
        this.spell = spell;
    }

    public void performSpell() {
        this.spell.spell();
    }

    public void setSpell(Spell spell) {
        this.spell = spell;
    }

}
