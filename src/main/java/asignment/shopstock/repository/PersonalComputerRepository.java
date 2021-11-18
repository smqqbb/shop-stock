package asignment.shopstock.repository;

import asignment.shopstock.entity.PersonalComputer;
import asignment.shopstock.entity.Smartphone;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface PersonalComputerRepository extends CrudRepository<PersonalComputer, Long>,
                                                    JpaSpecificationExecutor<PersonalComputer> {
}
