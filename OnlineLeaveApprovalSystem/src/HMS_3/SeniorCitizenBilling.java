package HMS_3;

public class SeniorCitizenBilling implements BillingStrategy {
    @Override
    public double calculateBill(double amount) {
        return amount * 0.80;
    }
}
