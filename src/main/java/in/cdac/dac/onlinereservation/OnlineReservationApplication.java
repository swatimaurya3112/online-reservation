package in.cdac.dac.onlinereservation;

import com.fasterxml.jackson.databind.ObjectMapper;
import in.cdac.dac.onlinereservation.model.Booking;
import in.cdac.dac.onlinereservation.model.Customer;
import in.cdac.dac.onlinereservation.model.Room;
import in.cdac.dac.onlinereservation.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class OnlineReservationApplication {

	@Autowired
	private BookingService bookingService;

	public static void main(String[] args) {
		SpringApplication.run(OnlineReservationApplication.class, args);

		OnlineReservationApplication application = new OnlineReservationApplication();

	}
}
