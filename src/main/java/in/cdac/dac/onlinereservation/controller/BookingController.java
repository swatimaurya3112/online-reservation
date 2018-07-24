package in.cdac.dac.onlinereservation.controller;

import in.cdac.dac.onlinereservation.model.Booking;
import in.cdac.dac.onlinereservation.model.BookingRequest;
import in.cdac.dac.onlinereservation.model.Room;
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
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Booking> getAllBookings() {

        return bookingService.getAllBooking();
    }

    @PostMapping("/bookings/{customerId}/booking")
    @CrossOrigin(origins = "http://localhost:4200")
    public Booking createBooking(@PathVariable (value = "customerId") Long customerId,
                                 @Valid @RequestBody Booking booking) {
        return bookingService.createBooking(customerId, booking);

    }

    @PostMapping("/availability")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Room> getAvailableRooms(@Valid @RequestBody BookingRequest request) {
        return bookingService.getAvailableRooms(request.getHotelId(),request.getFrom(),request.getTo());
    }


}
