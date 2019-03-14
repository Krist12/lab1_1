package pl.com.bottega.ecommerce.sales.domain.offer;

public class Discount {

    private String Cause;

    private Money amount;

    public Discount(String cause, Money amount) {
        super();
        Cause = cause;
        this.amount = amount;
    }

    public String getCause() {
        return Cause;
    }

    public void setCause(String cause) {
        Cause = cause;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }

}
