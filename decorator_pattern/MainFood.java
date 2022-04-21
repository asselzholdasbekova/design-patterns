public class MainFood implements Combo{

    public MainFood(String comboName){
        System.out.println(comboName + ":");
        System.out.println("Chicken is added");
    }

    @Override
    public String getComposition() {
        return "Chicken";
    }

    @Override
    public double getCost() {
        return 600.00;
    }

}
