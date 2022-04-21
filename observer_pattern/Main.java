public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        Employee e = new Employee("Assel Zholdasbekova", 190103084);
        Employee e1 = new Employee("Nurbakyt Nuradinova", 190103085);
        Employee e2 = new Employee("Ismailova Maida", 190103086);
        Employee e3 = new Employee("Sansyzbayeva Aidana", 190103087);

        company.employ(e);
        company.employ(e1);
        company.employ(e2);
        company.employ(e3);

        company.report();
    }
}
