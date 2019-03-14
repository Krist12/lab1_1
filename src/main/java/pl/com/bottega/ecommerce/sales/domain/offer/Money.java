package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;

public class Money {

    private String currency;

    private BigDecimal Cost;

    public Money(String currency, BigDecimal cost) {
        super();
        this.currency = currency;
        Cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getCost() {
        return Cost;
    }

    public void setCost(BigDecimal cost) {
        Cost = cost;
    }

}
