package asignment.shopstock.specifications;

import asignment.shopstock.entity.Television;
import org.springframework.data.jpa.domain.Specification;

public class TelevisionSpecifications {

    public static Specification<Television> byModelType(String modelType) {
        return GeneralSpecifications.byFieldValue("modelType", modelType);
    }

    public static Specification<Television> byTechnology(String technology) {
        return GeneralSpecifications.byFieldValue("technology", technology);
    }


}
