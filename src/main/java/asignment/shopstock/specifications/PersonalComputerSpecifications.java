package asignment.shopstock.specifications;

import asignment.shopstock.entity.Model;
import asignment.shopstock.entity.PersonalComputer;
import org.springframework.data.jpa.domain.Specification;

public class PersonalComputerSpecifications {
    public static Specification<PersonalComputer> byModelType(String type) {
        return GeneralSpecifications.byFieldValue("modelType", type);
    }

    public static Specification<PersonalComputer> byProcessorType(String processorType) {
        return GeneralSpecifications.byFieldValue("processorType", processorType);
    }
}
