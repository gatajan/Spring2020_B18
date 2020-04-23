package b12_day42_OOP_Encapsulation;

public class testData {

    //Encapsulation: hide instance variables (hiding the data) and is done by changing
                    //access modifier.

    private String name = "Bekir"; // private makes to hide the data to other class
    private int ID = 162;

    public String getname() { // Getter
        return name;
    }
    public int getID(){  // Getter
        return ID;
    }

    public void setName(String name) {  // Setter, no return, just changes.
        this.name = name;
    }

    public void setID(int ID) {   // Setter method
        this.ID = ID;
    }
}
