package worker;

public class SalariedEmployee extends Employee {

    private double annualSalary;
    private boolean isRetired;

//    public SalariedEmployee(String name, String birthDate, String endDate,
//                            double annualSalary, boolean isRetired) {
//        super(name, birthDate, endDate);
//        this.annualSalary = annualSalary;
//        this.isRetired = isRetired;
//    }

    public SalariedEmployee(String name, String birthDate, String endDate,
                            String hireDate,
                            double annualSalary, boolean isRetired) {
        super(name, birthDate, endDate, hireDate);
        this.annualSalary = annualSalary;
        this.isRetired = isRetired;
    }

    @Override
    public String toString() {
        return "SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                "} " + super.toString();
    }

    public void retire() {
        System.out.println("retired");
    }

}
