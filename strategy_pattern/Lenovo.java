public class Lenovo extends Laptop{
    public Lenovo(Graphics graphics, Storage storage) {
        super(graphics, storage);
    }

    @Override
    public void create(){
        System.out.println("The laptop from Lenovo is being created...");
        setCPU();
        setMotherboard();
        setRAM();
        setGraphics();
        setStorage();
    }
}
