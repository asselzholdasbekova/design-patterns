public class Main {
    public static void main(String[] args) {
        Combo combo = new Cola(new Fries(new MainFood("Super Chicken Combo")));

        System.out.println("Composition: " + combo.getComposition());
        System.out.println("Cost: " + combo.getCost());
    }
}
