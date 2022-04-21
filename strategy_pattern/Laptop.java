abstract class Laptop {
    private Graphics graphics;
    private Storage storage;

    public Laptop(Graphics graphics, Storage storage){
        this.graphics = graphics;
        this.storage = storage;
    }

    public void setCPU(){
        System.out.println("CPU is set.");
    }

    public void setRAM(){
        System.out.println("RAM is set.");
    }

    public void setMotherboard(){
        System.out.println("Motherboard is set.");
    }

    public void setGraphics(){
        System.out.println(graphics.cardType());
    }

    public void setStorage(){
        System.out.println(storage.storageType());
    }

    public void changeGraphics(Graphics graphics){
        this.graphics = graphics;
    }

    public void changeStorage(Storage storage){
        this.storage = storage;
    }

    abstract void create();

}
