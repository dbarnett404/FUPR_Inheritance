// Subclass
public class Dog extends Animal {
    private String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call superclass constructor
        this.breed = breed;
    }
    
    public void bark() {
        System.out.println(name + " is barking!");
    }
    
    public String getBreed() {
        return breed;
    }
}
