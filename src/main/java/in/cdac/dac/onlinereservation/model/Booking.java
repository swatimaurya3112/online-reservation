package in.cdac.dac.onlinereservation.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by swati on 7/17/18.
 */
@Entity
@Table(name="booking")
public class Booking implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long bookingId;

    @Column(name="hotel_id",nullable = false)
    private String hotelId;

    @ManyToOne(fetch = FetchType.LAZY,optional = false)
    @JoinColumn(name = "customer_id",nullable = false)
    @JsonIgnore
    private Customer customer;

    @Column(name ="room_type",nullable = false)
    private Room.Type roomType;

    @Column(name="start_date",nullable = false)
    private Date startDate;

    @Column(name="end_date",nullable = false)
    private Date endDate;

    public Long getBookingId() {
        return bookingId;
    }

    public void setBookingId(Long bookingId) {
        this.bookingId = bookingId;
    }

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Room.Type getRoomType() {
        return roomType;
    }

    public void setRoomType(Room.Type roomType) {
        this.roomType = roomType;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
