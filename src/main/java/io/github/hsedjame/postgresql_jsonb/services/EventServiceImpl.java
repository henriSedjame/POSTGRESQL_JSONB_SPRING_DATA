package io.github.hsedjame.postgresql_jsonb.services;

import io.github.hsedjame.postgresql_jsonb.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Project POSTGRESQL_JSONB_SPRING_DATA
 * @Author Henri Joel SEDJAME
 * @Date 17/02/2019
 * @Class purposes : .......
 */
@Service
public class EventServiceImpl implements EventService<EventRepository> {
    @Autowired
    private EventRepository repository;

    @Override
    public EventRepository getRepository() {
        return this.repository;
    }
}
