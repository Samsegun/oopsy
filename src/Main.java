public class Main {

    public static void main(String[] args) {

//        BankAccount account1 = new BankAccount(190623, 20000,
//                "sam segun", "lulu@email.com", "07022222");
        BankAccount account1 = new BankAccount("ayo", "ayo@email", "8188181");

//        account1.setAccountBalance(20000);
//        account1.setAccountNumber(190623);
//        account1.setCustomerName("sam segun");
//        account1.setEmail("lulu@email.com");
//        account1.setPhoneNumber("07022222");
//        System.out.println(account1.getAccountBalance());
//        System.out.println(account1.getCustomerName());
//        System.out.println(account1.getAccountNumber());
//        System.out.println(account1.getEmail());
//        System.out.println(account1.getPhoneNumber());
//
//        account1.deposit(3000.58);
//        account1.withdraw(9500.40);
//        account1.withdraw(13500.19);

        Printer printer = new Printer(50, true);
        System.out.println(printer.addToner(50));
        System.out.println("initial page count = " +printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = "
                + printer.getPagesPrinted());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted +" new total print count for printer = " +
                printer.getPagesPrinted());
    }
}
