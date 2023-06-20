public class MainCustomer {

    public static void main(String[] args) {

        Customer johnDoe = new Customer();
        Customer jamesBond = new Customer(500, "bond@email.com");
        Customer samOye = new Customer("Sam Oye", 10000, "oye@email.com");

//        System.out.println(johnDoe.getCreditLimit());
//        System.out.println(johnDoe.getName());
//        System.out.println(johnDoe.getEmail());
//
//        System.out.println(jamesBond.getCreditLimit());
//        System.out.println(jamesBond.getName());
//        System.out.println(jamesBond.getEmail());
//
//        System.out.println(samOye.getCreditLimit());
//        System.out.println(samOye.getName());
//        System.out.println(samOye.getEmail());
//
//        samOye.setName("Samuel Oyebade");
//
//        System.out.println(samOye.getName());
        System.out.println(johnDoe);
        System.out.println(jamesBond);
        System.out.println(samOye);
    }
}
