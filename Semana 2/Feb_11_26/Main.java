import Spell.ExpectroPatronum;
import Spell.Expelliarmus;
import Spell.OculusReparo;
import Spell.WingardumLeviosa;

public class Main {
    
    public static void main(String[] args) {

        Wizard HarryPotter = new Wizard("Harry Potter", new ExpectroPatronum());
        System.out.print("Harry Potter: ");
        HarryPotter.performSpell();

        Wizard RonWeasley = new Wizard("Ron Weasley", new Expelliarmus());
        System.out.print("Ron Weasley: ");
        RonWeasley.performSpell();

        Wizard HermioneGranger = new Wizard("Hermione Granger", new WingardumLeviosa());
        System.out.print("Hermione Granger: ");
        HermioneGranger.performSpell();
        HermioneGranger.setSpell(new OculusReparo());
        System.out.print("Hermione Granger: Hey Harry ");
        HermioneGranger.performSpell();
        
    }
}