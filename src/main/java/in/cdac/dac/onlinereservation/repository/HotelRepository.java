package in.cdac.dac.onlinereservation.repository;

import in.cdac.dac.onlinereservation.model.Hotel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by swati on 7/17/18.
 */
@Repository
public interface HotelRepository extends MongoRepository<Hotel,String> {
}
