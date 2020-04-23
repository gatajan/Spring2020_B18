package b12_day45_inheritance;
//Inheritance: to build multiple relationship between multiple classes
/* It builds super and sub relationship between classes.
*   1. We use "extends" keyword to build super and sub relationship between classes.
*   2. public class A extends B
*                sub class   super class
*                child class  parent class
*
* 3. sub class: sub class can inherit some features that super class has
* 4. Not all the features are inheritable, only "visible" and "protected" features from super class
* Visible -
*
* 5. super class: it is only giver, it cant take (cannot inherit from any feature from subclass)
* 6. Public and Protected can be inherited always everywhere
* 7. Default can be only inherited within the package.
* 8. Private AM  - it never be inherited outside of the class
* 9. Protected access modifier is similar to default, only visible to the classes outside of the package.
* 10. Protected can be inherited from anywhere but not default.
* 11. Sub class can extend only to one class.
* */
public class inheritance extends TestBase{
              // sub                super
              public static void main(String[] args) {
                  System.out.println(chromeDriver);
                  TakeSnapshot();


              }
}

class TestBase {
    static String chromeDriver = "FireFox"; //default

    public static void TakeSnapshot() {
        System.out.println("Took screenshot");
    }

    private static void closeBrowser() { // private is not inheritable
        System.out.println("Browser closed");
    }
}

