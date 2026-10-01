package HMS_3;

public class InsuranceBilling implements BillingStrategy {
    @Override
    public double calculateBill(double amount) {
        return amount * 0.20;
    }
}
