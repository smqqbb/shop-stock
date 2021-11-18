package asignment.shopstock.specifications;

import asignment.shopstock.entity.Smartphone;
import org.springframework.data.jpa.domain.Specification;

public class SmartphoneSpecifications {
    public static Specification<Smartphone> byFromStorageInGigs(Long storageInGigs) {
        return GeneralSpecifications.byFromValue("storageInGigs", storageInGigs);
    }

    public static Specification<Smartphone> byToStorageInGigs(Long storageInGigs) {
        return GeneralSpecifications.byToValue("storageInGigs", storageInGigs);
    }

    public static Specification<Smartphone> byFromNumberOfCameras(Long numberOfCameras) {
        return GeneralSpecifications.byFromValue("numberOfCameras", numberOfCameras);
    }

    public static Specification<Smartphone> byToNumberOfCameras(Long numberOfCameras) {
        return GeneralSpecifications.byToValue("numberOfCameras", numberOfCameras);
    }


}
