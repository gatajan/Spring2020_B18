package b12_day38_classAndObjectCont;

public class Employee {

    String employeeName, employeeId, jobTitle;
    int age;
    long ssn;
    double salary;

    public Employee(String employeeName, String employeeId, String jobTitle,
                    int age, long ssn, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.jobTitle = jobTitle;
        this.age = age;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void getInfo() {
        System.out.println("Employee name: " + employeeName);
        System.out.println("Age: " + age);
        System.out.println("Job title: " + jobTitle);
        System.out.println("Salary: " + salary);
        System.out.println("Social Security Number: " + ssn);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("========================================================");
    }

}
