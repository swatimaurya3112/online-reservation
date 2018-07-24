package in.cdac.dac.onlinereservation.model;

import java.util.List;
import java.util.Map;

/**
 * Created by swati on 7/17/18.
 */
public class Room {

    private String roomType;

    private List<String> images;

    private String description;

    private List<List<String>> details;

    private Map<String,String> amenities;

    private int numberOfRooms;

    private Double price;

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<List<String>> getDetails() {
        return details;
    }

    public void setDetails(List<List<String>> details) {
        this.details = details;
    }

    public Map<String, String> getAmenities() {
        return amenities;
    }

    public void setAmenities(Map<String, String> amenities) {
        this.amenities = amenities;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
