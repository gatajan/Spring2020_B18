package b12_day38_classAndObjectCont;

public class EmployeeObjects {
    public static void main(String[] args) {
        Employee obj1 = new Employee("Bekir", "1234",
                "CEO", 45, 3435, 200000);
        obj1.getInfo();

        Employee obj2 = new Employee("Annaly", "6756",
                "Manager", 34, 465756, 150000);
        obj2.getInfo();
    }
}
