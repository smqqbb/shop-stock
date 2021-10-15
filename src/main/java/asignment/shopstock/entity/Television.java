package asignment.shopstock.entity;

public class Television extends Model{
    private long serialNumber;
    private String modelType;
    private String technology;

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }
}
