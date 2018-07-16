package in.cdac.dac.onlinereservation.repository;

import in.cdac.dac.onlinereservation.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by swati on 7/16/18.
 */

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {

}
