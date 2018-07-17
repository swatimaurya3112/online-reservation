package in.cdac.dac.onlinereservation.controller;

import in.cdac.dac.onlinereservation.model.Booking;
import in.cdac.dac.onlinereservation.model.BookingRequest;
import in.cdac.dac.onlinereservation.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by swati on 7/17/18.
 */
@RestController
@RequestMapping("/api")
public class BookingController  {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/bookings")
    public List<Booking> getAllBookings() {

        return bookingService.getAllBooking();
    }

    @PostMapping("/bookings/{customerId}/booking")
    public Booking createBooking(@PathVariable (value = "customerId") Long customerId,
                                 @Valid @RequestBody Booking booking) {
        return bookingService.createBooking(customerId, booking);

    }

    @PostMapping("bookings")
    public List<Booking> getAllBookingsForHotelWithinRange(@Valid @RequestBody BookingRequest request) {
        return bookingService.getAllBookingWithInPeriod(request.getHotelId(),request.getStartDate(),request.getEndDate());
    }
}
