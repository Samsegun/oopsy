package inheritance;

public class Main  {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        Dog dog = new Dog();

        doAnimalStuff(animal, "slow");
        doAnimalStuff(dog, "slow");

        Dog yorkie = new Dog("yorkie", 40);
        doAnimalStuff(yorkie, "fast");

        Dog wolf = new Dog("wolf", 50);
        doAnimalStuff(wolf, "slow");

        Fish fishy = new Fish("shark", 200, 2, 1000);
        doAnimalStuff(fishy, "fast");

        Student stud = new Student("matt");
        System.out.println(stud);
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _ _");
    }
}

class Student {
    private String name;

    Student(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}