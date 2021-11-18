package asignment.shopstock.repository;

import asignment.shopstock.entity.Television;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface TelevisionRepository extends CrudRepository<Television, Long>,
                                              JpaSpecificationExecutor<Television> {
}
