public class Employee implements Observer{
    private String name;
    private int id;
    private int flex = (int)(Math.random()*100);
    private boolean winner = false;
    private int salary = 100_000;

    public Employee(String name, int id){
        this.name = name;
        this.id = id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getId(){
        return id;
    }

    @Override
    public int getFlex() {
        return flex;
    }

    @Override
    public void update(int id){
        winner = this.id == id;

        if (winner){
            salary += salary*0.1;
            System.out.println("Best worker of the month: " +
                                "\nname: " + name +
                                "\nscore: " + flex +
                                "\nsalary: " + salary);
        }
    }
}
