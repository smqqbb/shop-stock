package asignment.shopstock.entity;

public class Refrigerator extends Model{
    private long serialNumber;

    private long numberOfDoors;
    private String compressorType;


    public long getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(long numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public String getCompressorType() {
        return compressorType;
    }

    public void setCompressorType(String compressorType) {
        this.compressorType = compressorType;
    }
}
