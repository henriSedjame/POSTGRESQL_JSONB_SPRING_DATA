package io.github.hsedjame.postgresql_jsonb.repository;

import io.github.hsedjame.postgresql_jsonb.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Project POSTGRESQL_JSONB_SPRING_DATA
 * @Author Henri Joel SEDJAME
 * @Date 17/02/2019
 * @Class purposes : .......
 */
public interface EventRepository extends JpaRepository<Event, Long> {

    @Query(value = "SELECT * " +
            "FROM event " +
            "WHERE location ->> 'city' = :city",
            nativeQuery = true
    )
    List<Event> findByLocation_City(@Param("city") String city);

}
