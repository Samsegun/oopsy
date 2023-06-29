package BillsBurger;

public class DeluxeBurger extends Hamburger {

    private final String additionalMessage = "Cannot not add additional items to a deluxe burger";

    public DeluxeBurger() {
        super("Deluxe", "Bacon & Cheese", 19.10, "Sesame Bun");
        super.addHamburgerAddition1("chips", 0);
        super.addHamburgerAddition2("drink", 0);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println(additionalMessage);
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println(additionalMessage);
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println(additionalMessage);
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println(additionalMessage);
    }
}
