package asignment.shopstock.specifications;

import asignment.shopstock.entity.Model;
import org.springframework.data.jpa.domain.Specification;

public class ModelSpecifications {
    public static Specification<Model> byModelName(String name) {
        return GeneralSpecifications.byFieldValue("modelName", name);
    }

    public static Specification<Model> byColor(String color) {
        return GeneralSpecifications.byFieldValue("color", color);
    }

    public static Specification<Model> byType(String type) {
        return GeneralSpecifications.byFieldValue("type", type);
    }

    public static Specification<Model> byFromCost(Long fromCost) {
        return GeneralSpecifications.byFromValue("cost", fromCost);
    }

    public static Specification<Model> byToCost(Long toCost) {
        return GeneralSpecifications.byToValue("cost", toCost);
    }
}
