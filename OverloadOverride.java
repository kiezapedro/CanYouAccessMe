class Animal {

    // Overloading is when you have the same method name but different parameters or
    // inputs

    // This method has one parameter (int)
    public void makeSound(int volume) {
        System.out.println("Animal makes a sound at volume level: " + volume);
    }

    // This method has two parameters (int and String)
    public void makeSound(int volume, String type) {
        System.out.println("The animal makes a " + type + " sound at volume level: " + volume);
    }

    // Overriding sound method in subclass
    public void sound() {
        System.out.println("This is a generic animal sound.");
    }
}

class Dog extends Animal {

    // Overriding sound method from Animal class
    @Override
    public void sound() {
        System.out.println("The dog barks!");
    }
}

// Main class tests overloading and overriding
public class OverloadOverride {

    public static void main(String[] args) {

        // Create objects of Animal and Dog
        Animal animal = new Animal();
        Dog dog = new Dog();

        // Overloading Method:
        System.out.println("Overloading examples:");
        animal.makeSound(5); // Calls first overloaded method (one parameter)
        animal.makeSound(10, "loud"); // Calls second overloaded method (two parameters)

        // Overriding Method:
        System.out.println("\nOverriding examples:");
        animal.sound(); // Calls sound() method from Animal class
        dog.sound(); // Calls overridden sound() method from Dog class
    }
}