package b12_day46_superKeywords;

/*      Inheritance:     super and sub classes
        class       A        extends     B
*
*
* */

public class inhrtc extends inheritanceReview {
    public static void main(String[] args) {
        System.out.println("Public can be inherited in any package " + num1);
        System.out.println("Protected can be inherited in any package " + num2);
        System.out.println("Default can be inherited within the package " + num4);

        inheritanceReview obj = new inheritanceReview();
        System.out.println(obj.num5);
        System.out.println(obj.num6);
        System.out.println(obj.num8);
    }
}

class inheritanceReview {
    public static int num1 = 10;
    protected static int num2 = 20;
    private static int num3 = 30;
    static int num4 =40;

    public int num5 = 50;
    protected int num6 = 60;
    private int num7 = 70;
    int num8 =80;
}
