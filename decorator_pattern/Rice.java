public class Rice extends ExtraFood{

    public Rice(Combo newCombo) {
        super(newCombo);
        System.out.println("Rice is added");
    }

    public String getComposition(){
        return combo.getComposition() + " Rice";
    }

    public double getCost(){
        return combo.getCost() + 500.00;
    }
}
