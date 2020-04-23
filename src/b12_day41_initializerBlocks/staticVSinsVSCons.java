package b12_day41_initializerBlocks;

public class staticVSinsVSCons {

    static {
        System.out.println("static block, does not depend on object creation");
    }

    {
        System.out.println("Execution depends on creation of object");
    }

    public staticVSinsVSCons() {
        System.out.println("This is construction, depends on object creation");
    }



    public static void main(String[] args) {
        staticVSinsVSCons obj1 = new staticVSinsVSCons();
        staticVSinsVSCons obj2 = new staticVSinsVSCons();

    }
}
