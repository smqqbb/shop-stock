package asignment.shopstock.entity;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

import javax.persistence.*;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME,
              property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = PersonalComputer.class, name = "personalcomputer"),
        @JsonSubTypes.Type(value = Refrigerator.class, name = "refrigerator"),
        @JsonSubTypes.Type(value = Smartphone.class, name = "smartphone"),
        @JsonSubTypes.Type(value = Television.class, name = "television") })
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.STRING,
                    name = "type")
public abstract class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String modelName;
    private String size;
    private String color;
    private boolean available;
    private long cost;

    @ManyToOne
    @JoinColumn
    private Item item;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public void setItem(Item item) {
        this.item = item;
    }
}
