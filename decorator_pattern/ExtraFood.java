abstract class ExtraFood implements Combo{

    protected Combo combo;

    public ExtraFood(Combo newCombo){
        this.combo = newCombo;
    }

    public String getComposition(){
        return combo.getComposition();
    }

    public double getCost(){
        return combo.getCost();
    }

}
