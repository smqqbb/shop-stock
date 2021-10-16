package asignment.shopstock.specifications;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;

import java.util.Locale;

public class GeneralSpecifications {
    public static <T> Specification<T> byFieldValue(String field, String value) {
        return (root, query, criteriaBuilder) -> {
            if(value != null) {
                return criteriaBuilder.equal(criteriaBuilder.lower(root.get(field)),
                        value.toLowerCase(Locale.ROOT));
            } else {
                return criteriaBuilder.isTrue(criteriaBuilder.literal(true));
            }
        };
    }

    public static <T> Specification<T> byFromValue(String field, Long fromCost) {
        return (root, query, criteriaBuilder) -> {
            if(fromCost != null) {
                return criteriaBuilder.greaterThanOrEqualTo(root.get(field),
                        fromCost);
            } else {
                return criteriaBuilder.isTrue(criteriaBuilder.literal(true));
            }
        };
    }
    public static <T> Specification<T> byToValue(String field, Long toCost) {
        return (root, query, criteriaBuilder) -> {
            if (toCost != null) {
                return criteriaBuilder.lessThanOrEqualTo(root.get(field),
                        toCost);
            } else {
                return criteriaBuilder.isTrue(criteriaBuilder.literal(true));
            }
        };
    }
}
