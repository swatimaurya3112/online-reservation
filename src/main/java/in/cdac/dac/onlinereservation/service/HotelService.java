package in.cdac.dac.onlinereservation.service;

import in.cdac.dac.onlinereservation.model.Hotel;
import in.cdac.dac.onlinereservation.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by swati on 7/17/18.
 */
@Service
public class HotelService {

    @Autowired
    private HotelRepository hotelRepository;

    public List<Hotel> getAllHotels(){
        return hotelRepository.findAll();
    }

    public Hotel createHotel(Hotel hotel){
        return hotelRepository.save(hotel);
    }

    public Hotel findHotelById(String hotelId){
        return hotelRepository.findById(hotelId).orElse(null);
    }
}
