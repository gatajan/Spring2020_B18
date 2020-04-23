package b12_day37_Instance_Variables_Methods_Class;

public class Dog_Objects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();

        dog1.Breed = "Husky";
        dog1.Size = "Small";
        dog1.Color = "White";
        dog1.Age = 3;
        dog1.Gender = 'M';
        dog1.Name = "Rex";

        dog1.getInfo();

        Dog dog2 = new Dog();

    }
}
