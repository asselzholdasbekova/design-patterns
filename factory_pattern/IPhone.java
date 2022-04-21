public class IPhone extends Mobile{
    private String company = "Apple";
    private String origin = "United States";
    final int id = 2201;

    @Override
    void define(){
        System.out.println("Product Name: " + "iPhone"
                + "\nCompany Name: " + company
                + "\nProduct ID: " + id
                + "\nOrigin: " + origin
        );
    }
}
