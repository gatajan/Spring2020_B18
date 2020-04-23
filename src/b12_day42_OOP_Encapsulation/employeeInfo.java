package b12_day42_OOP_Encapsulation;

public class employeeInfo {

    /*
    * Name
    * SSN
    * Age
    * Salary
    * */

    private String Name;
    private long SSN;
    private byte age;
    private double salary;
////////////////////////////////////// Name //////////////////////////////////////////////
    public void setName (String name){
        this.Name = name;
    }
    public String getName() {
        return Name;
    }

/////////////////////////////////// SSN /////////////////////////////////////////////
    public long getSSN() {
        return SSN;
    }
    public void setSSN(long SSN) {
        this.SSN = SSN;
    }
/////////////////////////////////// Age //////////////////////////////////////////////

    public void setAge(byte age) {
        this.age = age;
    }
    public byte getAge() {
        return age;
    }
////////////////////////////////////// Salary ////////////////////////////////////////////////

    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }



    public void setInfo(String Name, long SSN, byte age, double salary) { // to set info at once
        setName(Name);
        setSSN(SSN);
        setAge(age);
        setSalary(salary);
    }

    /*public return getInfo () {
        getSSN();
        getSalary();
        getAge();
        getName();
    }*/
}
