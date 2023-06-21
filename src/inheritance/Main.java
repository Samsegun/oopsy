package inheritance;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        Dog dog = new Dog();

        doAnimalStuff(animal, "slow");
        doAnimalStuff(dog, "fast");

        Dog yorkie = new Dog("yorkie", 40);
        doAnimalStuff(yorkie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}
