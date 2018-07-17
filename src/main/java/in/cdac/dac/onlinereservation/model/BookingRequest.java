package in.cdac.dac.onlinereservation.model;

import java.util.Date;

/**
 * Created by swati on 7/18/18.
 */
public class BookingRequest {
    private String hotelId;
    private Date startDate;
    private Date endDate;

    public String getHotelId() {
        return hotelId;
    }

    public void setHotelId(String hotelId) {
        this.hotelId = hotelId;
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
