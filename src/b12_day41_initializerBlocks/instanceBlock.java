package b12_day41_initializerBlocks;



public class instanceBlock {

    {
        System.out.println("instance block2");
    }

    {
        System.out.println("instance block1");
    }

    {
        System.out.println("instance block3");
    }

    public instanceBlock() {
        System.out.println("This is constructor");
    }


    public static void main(String[] args) {

        instanceBlock obj1 = new instanceBlock();// this is with default constructor
        instanceBlock obj2 = new instanceBlock();
        instanceBlock obj3 = new instanceBlock();

    }
}
