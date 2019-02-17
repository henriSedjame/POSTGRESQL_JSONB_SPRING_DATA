package io.github.hsedjame.postgresql_jsonb.services;

import io.github.hsedjame.postgresql_jsonb.model.Event;
import io.github.hsedjame.postgresql_jsonb.repository.EventRepository;

import java.util.List;

/**
 * @Project POSTGRESQL_JSONB_SPRING_DATA
 * @Author Henri Joel SEDJAME
 * @Date 17/02/2019
 * @Class purposes : .......
 */

public  interface  EventService<T extends EventRepository> {

    default List<Event> findByCity(String city){
        return this.getRepository().findByLocation_City(city);
    }

     T getRepository();
}
