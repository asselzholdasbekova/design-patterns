public class Samsung extends Mobile{
    private String company = "Samsung";
    private String origin = "South Korea";
    final int id = 2201;

    @Override
    void define(){
        System.out.println("Product Name: " + "Samsung"
                + "\nCompany Name: " + company
                + "\nProduct ID: " + id
                + "\nOrigin: " + origin
        );
    }
}
