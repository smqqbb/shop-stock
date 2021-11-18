package asignment.shopstock.repository;

import asignment.shopstock.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface SmartphoneRepository extends CrudRepository<Smartphone, Long>,
                                              JpaSpecificationExecutor<Smartphone> {
}
