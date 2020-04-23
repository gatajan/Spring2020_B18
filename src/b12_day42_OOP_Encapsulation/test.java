package b12_day42_OOP_Encapsulation;

// Private: the feature is only visible within the CLASS
// getter and setter:  allows to grant an access to private data for other classes.

////////////////////////////// GETTER (Read only) - IS AN INSTANCE METHOD ///////////////////////////////
// returns Private data from other classes.

///////////////////////////// SETTER (modify) -

public class test {
    public static void main(String[] args) {
        testData obj1 = new testData();
        //System.out.println(obj1.name); // due to the "private" access modifier
        System.out.println(obj1.getname());
        System.out.println(obj1.getID());
        int a = obj1.getID();

        obj1.setName("Melek"); // calls setter method and changes name to Melek.
        System.out.println(obj1.getname());

        obj1.setID(345);
        System.out.println(obj1.getID());
    }
}
