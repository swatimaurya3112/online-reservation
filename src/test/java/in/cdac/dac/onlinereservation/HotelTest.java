package in.cdac.dac.onlinereservation;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import in.cdac.dac.onlinereservation.model.Booking;
import in.cdac.dac.onlinereservation.model.Customer;
import in.cdac.dac.onlinereservation.model.Hotel;
import in.cdac.dac.onlinereservation.model.Room;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by swati on 7/17/18.
 */
public class HotelTest {

    public static void main(String[] args) throws JsonProcessingException {
        /*Hotel hotel = new Hotel();

        hotel.setId("hotel123");


        Room room1 = new Room();
        room1.setRoomType(Room.Type.DELUX);
        List<String> amenities = new ArrayList<>();
        room1.setAmenities(amenities);
        List<String> images = new ArrayList<>();
        room1.setImages(images);

        Room room2 = new Room();
        room2.setRoomType(Room.Type.PREMIUM);
        room2.setAmenities(amenities);
        room2.setImages(images);

        List<Room> rooms = new ArrayList<>();
        rooms.add(room1);
        rooms.add(room2);

        hotel.setRoomList(rooms);

        ObjectMapper objectMapper = new ObjectMapper();

        String hotelString = objectMapper.writeValueAsString(hotel);

        System.out.println(hotelString);


        Booking booking1 = new Booking();
        booking1.setHotelId("hotel123");
        booking1.setRoomType(Room.Type.DELUX);
        booking1.setFrom(new Date());
        booking1.setTo(new Date());

        Customer customer = new Customer();
        customer.setPhoneNo("897968");
        customer.setPassword("123");
        customer.setEmail("abc@gmail.com");
        customer.setCustomerId(1L);
        customer.setUserName("abc");
        customer.setAddress("address");
        customer.setName("abc");

        booking1.setCustomer(customer);

        String bookingString = objectMapper.writeValueAsString(booking1);
        System.out.println(bookingString);

        String customerString = objectMapper.writeValueAsString(customer);
        System.out.println(customerString);*/


    }
}
