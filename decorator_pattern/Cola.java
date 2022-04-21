public class Cola extends ExtraFood{

    public Cola(Combo newCombo) {
        super(newCombo);
        System.out.println("Cola is added");
    }

    public String getComposition(){
        return combo.getComposition() + " Cola";
    }

    public double getCost(){
        return combo.getCost() + 200.00;
    }

}
