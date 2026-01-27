public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Shadow", 4, "Whippet Greyhound");
        myDog.eat();    // Inherited from Animal
        myDog.sleep();  // Inherited from Animal
        myDog.bark();   // Specific to Dog
    }
}