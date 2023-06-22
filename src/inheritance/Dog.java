package inheritance;

public class Dog extends Animal {

    private String earShape;
    private String tailShape;

    public Dog() {
        super("Mutt", "medium", 10);
    }

    public Dog(String type, double weight) {
        this(type, weight, "yorkie", "curled");
    }

    public Dog(String type, double weight, String earShape, String tailShape) {
        super(type, weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }

    public void makeNoise() {
        if(type == "wolf") {
            System.out.println("ow Woooo!");
        }

        bark();
        System.out.println();
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        if(speed == "slow") {
            walk();
            wagTail();
        } else {
            run();
            bark();
        }
    }

    private void bark() {
        System.out.println("woof!");
    }

    private void run() {
        System.out.println("Dog running");
    }

    private void walk() {
        System.out.println("Dog walking");
    }

    private void wagTail() {
        System.out.println("Tail wagging");
    }
}
