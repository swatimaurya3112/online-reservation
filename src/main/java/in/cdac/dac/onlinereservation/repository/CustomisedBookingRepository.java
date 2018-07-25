package in.cdac.dac.onlinereservation.repository;

import in.cdac.dac.onlinereservation.model.Booking;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * Created by swati on 7/18/18.
 */
public interface CustomisedBookingRepository extends CrudRepository<Booking,Long> {

    @Query("Select b from Booking b where " +
                  "b.hotelId = :hotelId "+
                  "and b.from <= :endDate " +
                  "and b.to >= :startDate ")
    public List<Booking> findBookingsForHotelWithinRange(@Param("hotelId") String hotelId,
                                                  @Param("startDate") Date startDate,
                                                  @Param("endDate") Date endDate);
}
