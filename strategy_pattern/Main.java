public class Main {
    public static void main(String[] args) {
        Graphics graphics1 = new Integrated();
        Graphics graphics2 = new Dedicated();
        Storage storage = new HDD();

        Laptop laptop = new Lenovo(graphics1, storage);
        laptop.changeGraphics(graphics2);

        laptop.create();
    }
}
