package b12_day34_ArrayList_Constructor;

public class ConstructorPractice {
    public ConstructorPractice () {
        System.out.println("This is default constructor");
    }
    public ConstructorPractice(String str) {
        System.out.println("Hello Melek");
    }
    public ConstructorPractice(Integer i) {
        System.out.println("I'm Integer");
    }

    public static void main(String[] args) {
        ConstructorPractice obj = new ConstructorPractice();
        ConstructorPractice obj2 = new ConstructorPractice("Melek");
        method1();
    }
    public static void method1() {
        ConstructorPractice obj = new ConstructorPractice(10);
    }
}
