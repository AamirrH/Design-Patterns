package HMS_3;

public class Billing extends Department {
    private BillingStrategy strategy;
    private double amount;

    public Billing(BillingStrategy strategy, double amount) {
        super("Billing");
        this.strategy = strategy;
        this.amount = amount;
    }

    public void setStrategy(BillingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double calculateBill() {
        return strategy.calculateBill(amount);
    }

    public void process(Patient patient, String billType) {
        System.out.printf("Billing: Total amount: %.2f%n", amount);
        System.out.printf("Billing: Patient pays: %.2f%n", calculateBill());
        System.out.println(name + ": Processed " + billType + " for " + patient.getPatientName());
        System.out.println(name + ": Discharged " + patient.getPatientName());
    }
}
