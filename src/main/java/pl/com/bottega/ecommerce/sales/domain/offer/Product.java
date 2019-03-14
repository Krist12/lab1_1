package pl.com.bottega.ecommerce.sales.domain.offer;

import java.math.BigDecimal;
import java.util.Date;

public class Product {
    
    
    

    private String Id;

    private String Name;

    private Date SnapshotDate;

    private String Type;
    
    private Money Price;

    public Product(String id, String name, Date snapshotDate, String type, Money price) {
        super();
        Id = id;
        Name = name;
        SnapshotDate = snapshotDate;
        Type = type;
        Price = price;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((Id == null) ? 0 : Id.hashCode());
        result = prime * result + ((Name == null) ? 0 : Name.hashCode());
        result = prime * result + ((Price == null) ? 0 : Price.hashCode());
        result = prime * result + ((SnapshotDate == null) ? 0 : SnapshotDate.hashCode());
        result = prime * result + ((Type == null) ? 0 : Type.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Product other = (Product) obj;
        if (Id == null) {
            if (other.Id != null)
                return false;
        } else if (!Id.equals(other.Id))
            return false;
        if (Name == null) {
            if (other.Name != null)
                return false;
        } else if (!Name.equals(other.Name))
            return false;
        if (Price == null) {
            if (other.Price != null)
                return false;
        } else if (!Price.equals(other.Price))
            return false;
        if (SnapshotDate == null) {
            if (other.SnapshotDate != null)
                return false;
        } else if (!SnapshotDate.equals(other.SnapshotDate))
            return false;
        if (Type == null) {
            if (other.Type != null)
                return false;
        } else if (!Type.equals(other.Type))
            return false;
        return true;
    }


    public String getId() {
        return Id;
    }

    
    public void setId(String id) {
        Id = id;
    }

    
    public String getName() {
        return Name;
    }

    
    public void setName(String name) {
        Name = name;
    }

    
    public Date getSnapshotDate() {
        return SnapshotDate;
    }

    
    public void setSnapshotDate(Date snapshotDate) {
        SnapshotDate = snapshotDate;
    }

    
    public String getType() {
        return Type;
    }

    
    public void setType(String type) {
        Type = type;
    }

    
    public Money getPrice() {
        return Price;
    }

    
    public void setPrice(Money price) {
        Price = price;
    }
    

    
    
   

    
}
