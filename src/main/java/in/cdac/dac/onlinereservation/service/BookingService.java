package in.cdac.dac.onlinereservation.service;

import in.cdac.dac.onlinereservation.model.Booking;
import in.cdac.dac.onlinereservation.model.SearchRequest;
import in.cdac.dac.onlinereservation.model.Hotel;
import in.cdac.dac.onlinereservation.model.Room;
import in.cdac.dac.onlinereservation.repository.BookingRepository;
import in.cdac.dac.onlinereservation.repository.CustomerRepository;
import in.cdac.dac.onlinereservation.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by swati on 7/17/18.
 */
@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private HotelRepository hotelRepository;

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

    public List<Room> getAvailableRooms(String hotelId,Date startDate,Date endDate) {
        Hotel hotel = hotelRepository.findById(hotelId).get();
        List<Booking> bookings = getAllBookingWithInPeriod(hotelId,startDate,endDate);
        Map<String,Long> bookingCount = bookings.stream().collect(
                Collectors.groupingBy(Booking::getRoomType, Collectors.counting()));
        List<Room> result = new ArrayList<>();
        for(Room room:hotel.getRoomList()){
            if(!bookingCount.containsKey(room.getRoomType()) || room.getNumberOfRooms()>bookingCount.get(room.getRoomType())){
                result.add(room);
            }
        }
        return result;
    }

}
