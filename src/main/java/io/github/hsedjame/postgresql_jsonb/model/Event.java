package io.github.hsedjame.postgresql_jsonb.model;

import lombok.Data;
import org.hibernate.annotations.Type;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.Collection;

/**
 * @Project POSTGRESQL_JSONB_SPRING_DATA
 * @Author Henri Joel SEDJAME
 * @Date 17/02/2019
 * @Class purposes : .......
 */
@Entity(name = "Event")
@Table(name = "event")
@Data
public class Event extends BaseEntity {

    @Column(columnDefinition = Const.JSON_B)
    @Type(type = Const.JSON_B)
    private Location location;

    @Column(columnDefinition = Const.JSON_B)
    @Type(type = Const.JSON_B)
    private Collection<Location> alternativeLocations = new ArrayList<>();
}
