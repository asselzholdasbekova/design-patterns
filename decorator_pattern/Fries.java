public class Fries extends ExtraFood{

    public Fries(Combo newCombo) {
        super(newCombo);
        System.out.println("Fries are added" );
    }

    public String getComposition(){
        return combo.getComposition() + " Fries";
    }

    public double getCost(){
        return combo.getCost() + 300.00;
    }
}
