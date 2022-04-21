public class Sony extends Mobile{
    private String name = "Sony";
    private String company = "Sony";
    private String origin = "Japan";
    final int id = 2203;

    @Override
    void define(){
        System.out.println("Product Name: " + "Sony"
                + "\nCompany Name: " + company
                + "\nProduct ID: " + id
                + "\nOrigin: " + origin
        );
    }
}
