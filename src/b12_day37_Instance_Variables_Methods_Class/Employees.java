package b12_day37_Instance_Variables_Methods_Class;

public class Employees {

    String name;
    long ID;
    String JobTitle;
    long SSN;
    char Gender;
    double Salary;


    public void getInfo() {
        System.out.println(name + " with " + ID + " as " + JobTitle + " has a yearly salary of " + Salary);
    }

    public static void main(String[] args) {
        Employees obj = new Employees();
        obj.name = "Annaly";
        obj.ID = 346901501;
        obj.JobTitle ="MWD Field Engineer";
        obj.SSN = 3469015012l;
        obj.Gender = 'M';
        obj.Salary = 100000;

        obj.getInfo();
    }
}
