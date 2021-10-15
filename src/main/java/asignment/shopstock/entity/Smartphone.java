package asignment.shopstock.entity;

import javax.persistence.Entity;

@Entity
public class Smartphone extends Model{
    private long serialNumber;
    private long storageInGigs;
    private long numberOfCameras;

    public long getStorageInGigs() {
        return storageInGigs;
    }

    public void setStorageInGigs(long storageInGigs) {
        this.storageInGigs = storageInGigs;
    }

    public long getNumberOfCameras() {
        return numberOfCameras;
    }

    public void setNumberOfCameras(long numberOfCameras) {
        this.numberOfCameras = numberOfCameras;
    }
}
