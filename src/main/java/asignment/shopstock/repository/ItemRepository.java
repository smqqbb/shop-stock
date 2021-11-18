package asignment.shopstock.repository;

import asignment.shopstock.entity.Item;
import org.springframework.data.repository.CrudRepository;


public interface ItemRepository extends CrudRepository<Item, Long> {

}
