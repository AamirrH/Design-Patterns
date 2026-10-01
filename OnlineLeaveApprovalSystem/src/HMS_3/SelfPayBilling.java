package HMS_3;

public class SelfPayBilling implements BillingStrategy {
    @Override
    public double calculateBill(double amount) {
        return amount;
    }
}
