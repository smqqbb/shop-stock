package asignment.shopstock.repository;


import asignment.shopstock.entity.Model;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface ModelRepository<T extends Model> extends CrudRepository<T, Long>, JpaSpecificationExecutor<T> {
}
