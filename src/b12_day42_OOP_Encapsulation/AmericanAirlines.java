package b12_day42_OOP_Encapsulation;

public class AmericanAirlines {
    public static void main(String[] args) {

        employeeInfo emrah = new employeeInfo();
        emrah.setName("Emrah");
        System.out.println(emrah.getName());

        emrah.setSSN(23456756);
        System.out.println(emrah.getSSN());

        emrah.setAge((byte)31);
        System.out.println(emrah.getAge());

        emrah.setSalary(89000);
        System.out.println(emrah.getSalary());


        employeeInfo shirin = new employeeInfo(); // this is a new object, data have not been assigned
        System.out.println(shirin.getName()); // it shows null until data is assigned
        shirin.setName("Shirin");
        shirin.setAge((byte)29);
        shirin.setSSN(456658763);
        shirin.setSalary(13000);


        employeeInfo annaly = new employeeInfo();
            annaly.setInfo("Annaly", 434536, (byte)35, 145000);
        System.out.println(annaly.getName());
        System.out.println(annaly.getSalary());
        System.out.println(annaly.getAge());
        System.out.println(annaly.getSSN());

        employeeInfo melek = new employeeInfo();
        melek.setInfo("Melek", 3464567, (byte)21, 100000);
        /*melek.getInfo("Melek", 3454654, (byte)21, 234344);*/
    }
}
