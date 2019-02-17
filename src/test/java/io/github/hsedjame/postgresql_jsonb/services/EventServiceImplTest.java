package io.github.hsedjame.postgresql_jsonb.services;

import io.github.hsedjame.postgresql_jsonb.model.Event;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Project POSTGRESQL_JSONB_SPRING_DATA
 * @Author Henri Joel SEDJAME
 * @Date 17/02/2019
 * @Class purposes : .......
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EventServiceImplTest {

    @Autowired
    EventService eventService;

    @Test
    public void findByCity() {
        final List<Event> events = this.eventService.findByCity("Rome");
        Assert.assertTrue(events.size() == 1);
    }
}
