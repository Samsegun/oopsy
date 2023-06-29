package BillsBurger;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name;
    private String healthyExtra2Name;
    private double healthyExtra1Price;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy hamburger", meat, price, "healthy bread");
    }

    public void addHealthyAddition1(String name, double price) {
        healthyExtra1Name = name;
        healthyExtra1Price = price;
        System.out.println("Added " + this.healthyExtra1Name + " for an extra "
                + this.healthyExtra1Price);
    }
    public void addHealthyAddition2(String name, double price) {
        healthyExtra2Name = name;
        healthyExtra2Price = price;
        System.out.println("Added " + this.healthyExtra2Name + " for an extra "
                + this.healthyExtra2Price);
    }

    @Override
    public double itemizeHamburger() {
        System.out.println("One order of Healthy hamburger on Healthy hamburger with "
                + healthyExtra1Name + " " + healthyExtra2Name);
        return (super.itemizeHamburger() + healthyExtra1Price + healthyExtra2Price);
    }
}
