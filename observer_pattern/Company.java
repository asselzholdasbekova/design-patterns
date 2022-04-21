import java.util.ArrayList;

public class Company implements Subject{
    private String name = "KATEV";
    private ArrayList<Observer> employees = new ArrayList();
    private Observer employee;
    private int result;

    @Override
    public void employ(Observer observer) {
        employees.add(observer);
    }

    @Override
    public void unemploy(Observer observer) {
        employees.remove(observer);
    }

    public String getName(){
        return name;
    }

    public void announce(){
        employee.update(employee.getId());
    }

    @Override
    public void report(){
        for(Observer emp: employees){
            if(emp.getFlex() > result) {
                employee = emp;
                result = emp.getFlex();
            }
        }
        announce();
    }
}
