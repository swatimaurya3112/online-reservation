package in.cdac.dac.onlinereservation.repository;

import in.cdac.dac.onlinereservation.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by swati on 7/17/18.
 */
@Repository
public interface BookingRepository extends JpaRepository<Booking,Long>, CustomisedBookingRepository {

}
