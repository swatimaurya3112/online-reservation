package in.cdac.dac.onlinereservation.controller;

import in.cdac.dac.onlinereservation.model.Hotel;
import in.cdac.dac.onlinereservation.repository.HotelRepository;
import in.cdac.dac.onlinereservation.service.HotelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by swati on 7/17/18.
 */
@RestController
@RequestMapping("/api")
public class HotelController {

    @Autowired
    private HotelService hotelService;

    @GetMapping("/hotels")
    public List<Hotel> getAllHotels() {
        return hotelService.getAllHotels();
    }

    @PostMapping("/hotels")
    public Hotel createHotel(@Valid @RequestBody Hotel hotel){
        return hotelService.createHotel(hotel);
    }

    @GetMapping("/hotels/{id}")
    public Hotel getHotelById(@PathVariable(value = "id") String id) {
        return hotelService.findHotelById(id);
    }
}
