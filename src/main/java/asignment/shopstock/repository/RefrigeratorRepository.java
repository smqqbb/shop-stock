package asignment.shopstock.repository;

import asignment.shopstock.entity.Refrigerator;
import asignment.shopstock.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface RefrigeratorRepository extends CrudRepository<Refrigerator, Long>,
                                                JpaSpecificationExecutor<Refrigerator> {
}
