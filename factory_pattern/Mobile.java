abstract class Mobile {
    private int id;
    private String company;
    private String origin;

    abstract void define();

    final String getCompany(){
        return company;
    }
    final String getOrigin(){
        return origin;
    }
    final int getId(){
        return id;
    }

}
