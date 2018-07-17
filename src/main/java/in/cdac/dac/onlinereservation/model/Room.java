package in.cdac.dac.onlinereservation.model;

import java.util.List;

/**
 * Created by swati on 7/17/18.
 */
public class Room {

    public enum Type {
        DELUX,
        PREMIUM
    }

    private Type roomType;

    private List<String> images;

    private List<String> amenities;

    private int numberOfRooms;

    private Double price;

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

    public Type getRoomType() {
        return roomType;
    }

    public void setRoomType(Type roomType) {
        this.roomType = roomType;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public List<String> getAmenities() {
        return amenities;
    }

    public void setAmenities(List<String> amenities) {
        this.amenities = amenities;
    }
}
