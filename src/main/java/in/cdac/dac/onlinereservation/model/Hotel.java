package in.cdac.dac.onlinereservation.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.util.List;

/**
 * Created by swati on 7/17/18.
 */
@Document(collection="hotel")
@JsonIgnoreProperties( allowGetters = true)
public class Hotel {

    @Id
    private String id;

    private String address;

    private List<Room> roomList;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }
}
