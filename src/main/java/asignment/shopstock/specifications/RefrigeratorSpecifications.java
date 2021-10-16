package asignment.shopstock.specifications;

import asignment.shopstock.entity.Model;
import asignment.shopstock.entity.Refrigerator;
import org.springframework.data.jpa.domain.Specification;

public class RefrigeratorSpecifications {
    public static Specification<Refrigerator> byCompressorType(String compressorType) {
        return GeneralSpecifications.byFieldValue("compressorType", compressorType);
    }

    public static Specification<Refrigerator> byFromNumberOfDoors(Long numberOfDoors) {
        return GeneralSpecifications.byFromValue("numberOfDoors", numberOfDoors);
    }

    public static Specification<Refrigerator> byToNumberOfDoors(Long numberOfDoors) {
        return GeneralSpecifications.byToValue("numberOfDoors", numberOfDoors);
    }

}
