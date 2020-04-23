package b12_day45_inheritance;


public class multiClassPractices {
    public static void main(String[] args) {
        Data obj1 = new Data();
        System.out.println(obj1.name);
        //System.out.println(obj1.age); // Compile error as it is private
        System.out.println(obj1.ID); // default access modifier is visible to the classes in a same package.

        obj1.Hello();
        obj1.Aloha();

    }




}

class Data {
    public String name;
    private int age;
    String ID;
    protected String DOB; // it is like a Default AM, but it can be inherited.

    public void Hello() {          // public method
        //Hola(); can be called only within the class
        System.out.println("Hello");
    }

    private void Hola() {           // private method
        System.out.println("Hola");
    }

    void Aloha() {                  // default method
        System.out.println("Aloha");
        //Hola(); can be called only within the class
    }
}


