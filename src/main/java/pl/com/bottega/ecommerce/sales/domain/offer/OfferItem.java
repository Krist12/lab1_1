/*
 * Copyright 2011-2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Objects;

public class OfferItem {

    private Money totalcost;

    private Product product;

    private Discount discount;

    private int quantity;

    private String currency;

    public OfferItem(Money totalcost, Product product, Discount discount, int quantity, String currency) {
        super();
        this.totalcost = totalcost;
        this.product = product;
        this.discount = discount;
        this.quantity = quantity;
        this.currency = currency;
    }

    public OfferItem(Product product, BigDecimal productPrice, int quantity, Discount discount, Money totalcost) {
        this.product = product;
        this.quantity = quantity;
        this.discount = discount;
        this.totalcost = totalcost;

        BigDecimal discountValue = new BigDecimal(0);
        if (discount != null) {
            discountValue = discountValue.add(discount);
        }


    public Money getTotalcost() {
        return totalcost;
    }

    public Product getProduct() {
        return product;
    }

    public Discount getDiscount() {
        return discount;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getCurrency() {
        return currency;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        OfferItem other = (OfferItem) obj;
        return Objects.equals(currency, other.currency)
               && Objects.equals(discount, other.discount)
               && Objects.equals(product, other.product)
               && quantity == other.quantity
               && Objects.equals(totalcost, other.totalcost);
    }


    /**
     *
     * @param item
     * @param delta
     *            acceptable percentage difference
     * @return
     */
    public boolean sameAs(OfferItem other, double delta) {
        if (productPrice == null) {
            if (other.productPrice != null) {
                return false;
            }
        } else if (!productPrice.equals(other.productPrice)) {
            return false;
        }
        if (product == null) {
            if (other.product != null) {
                return false;
            }
        }

        if (quantity != other.quantity) {
            return false;
        }

        BigDecimal max;
        BigDecimal min;
        if (totalcost.compareTo(other.totalcost) > 0) {
            max = totalcost;
            min = other.totalcost;
        } else {
            max = other.totalcost;
            min = totalcost;
        }

        BigDecimal difference = max.subtract(min);
        BigDecimal acceptableDelta = max.multiply(BigDecimal.valueOf(delta / 100));

        return acceptableDelta.compareTo(difference) > 0;
    }

}
