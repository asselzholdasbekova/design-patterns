public class Main {
    public static void main(String[] args) {
        MobileFactory factory = new MobileFactory();
        try{
            Mobile mobile = factory.createMobile("2209");
            mobile.define();
        }
        catch (Exception e){
            System.out.println("No matching mobile in the factory");
        }
    }
}
