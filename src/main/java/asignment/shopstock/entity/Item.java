package asignment.shopstock.entity;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Item{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;

    private String itemName;
    private String country;
    private String brand;

    private boolean orderOnline;
    private boolean installmentOption;

    public Set<Model> getModels() {
        return models;
    }

    @OneToMany(mappedBy = "item")
    private Set<Model> models;


    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isOrderOnline() {
        return orderOnline;
    }

    public void setOrderOnline(boolean orderOnline) {
        this.orderOnline = orderOnline;
    }

    public boolean isInstallmentOption() {
        return installmentOption;
    }

    public void setInstallmentOption(boolean installmentOption) {
        this.installmentOption = installmentOption;
    }
}
