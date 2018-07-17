package in.cdac.dac.onlinereservation.service;

import in.cdac.dac.onlinereservation.model.Booking;
import in.cdac.dac.onlinereservation.repository.BookingRepository;
import in.cdac.dac.onlinereservation.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * Created by swati on 7/17/18.
 */
@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private CustomerRepository customerRepository;

    public Booking createBooking(Long customerId, Booking booking) {

        return customerRepository.findById(customerId).map(customer -> {
            booking.setCustomer(customer);
            return bookingRepository.save(booking);
        }).orElse(null);
    }

    public List<Booking> getAllBooking() {
        return bookingRepository.findAll();
    }

    public List<Booking> getAllBookingWithInPeriod(String hotelId,Date startDate,Date endDate) {
        return bookingRepository.findBookingsForHotelWithinRange(hotelId,startDate,endDate);
    }

}
