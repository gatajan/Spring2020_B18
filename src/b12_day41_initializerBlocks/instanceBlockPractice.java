package b12_day41_initializerBlocks;

public class instanceBlockPractice {

    public String name = "Shirin";

    public instanceBlockPractice() {
        this(10);
       name = "Dinara";
    }

    public instanceBlockPractice(int a) {
        name = "Muhtar";
    }

    {
        name = "Melek";
    }

    {
        name = "Hatyja";
    }

    public static void main(String[] args) {
        instanceBlockPractice obj1 = new instanceBlockPractice();
        obj1.name = "Ayjemal";
        System.out.println(obj1.name);

        instanceBlockPractice obj2 = new instanceBlockPractice();
        System.out.println(obj2.name);

        instanceBlockPractice obj3 = new instanceBlockPractice(10);
        System.out.println(obj3.name);
    }
}
