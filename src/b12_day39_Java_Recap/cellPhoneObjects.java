package b12_day39_Java_Recap;

public class cellPhoneObjects {
    public static void main(String[] args) {
        //classname  objname     constructor
        cellPhones phone1 = new cellPhones();

        System.out.println(phone1.brand);
        System.out.println(phone1.color);
        System.out.println(phone1.model);
        System.out.println(phone1.price);
        System.out.println(phone1.screenSize);

        cellPhones phone2 = new cellPhones("Samsung", 1000, "white", 10.8, "G50");
        phone2.getInfo();

        cellPhones phone3 = new cellPhones("Nokia", 850, "purple", 7.8, "M45");
        phone3.getInfo();

        cellPhones phone4 = new cellPhones("Motorolla", 550, "black", 11, "M450");
        phone3.getInfo();

        cellPhones[] phones = {phone1, phone2, phone3, phone4};

        //brand of phone3
        System.out.println(phones[2].brand);

        //get info phone3
        phones[2].getInfo();
    }
}

