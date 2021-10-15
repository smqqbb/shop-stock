package asignment.shopstock.entity;

import javax.persistence.Entity;

@Entity
public class PersonalComputer extends Model{
    private long serialNumber;
    private String modelType;
    private String processorType;

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getProcessorType() {
        return processorType;
    }

    public void setProcessorType(String processorType) {
        this.processorType = processorType;
    }
}
