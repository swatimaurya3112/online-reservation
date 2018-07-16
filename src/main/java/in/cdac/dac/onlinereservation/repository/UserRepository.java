package in.cdac.dac.onlinereservation.repository;

import in.cdac.dac.onlinereservation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Locale;

/**
 * Created by swati on 7/16/18.
 */

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
