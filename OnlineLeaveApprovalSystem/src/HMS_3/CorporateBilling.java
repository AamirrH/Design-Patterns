package HMS_3;

public class CorporateBilling implements BillingStrategy {
    @Override
    public double calculateBill(double amount) {
        return amount * 0.50;
    }
}
