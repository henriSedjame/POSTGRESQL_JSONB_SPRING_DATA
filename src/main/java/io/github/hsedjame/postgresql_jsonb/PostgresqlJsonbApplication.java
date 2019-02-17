package io.github.hsedjame.postgresql_jsonb;

import io.github.hsedjame.postgresql_jsonb.model.Event;
import io.github.hsedjame.postgresql_jsonb.model.Location;
import io.github.hsedjame.postgresql_jsonb.repository.EventRepository;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Objects;
import java.util.stream.Stream;

@SpringBootApplication
public class PostgresqlJsonbApplication {

    public static void main(String[] args) {
        SpringApplication.run(PostgresqlJsonbApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(EventRepository repository){
        return args -> {
            repository.deleteAll();
            Event event = new Event();
            event.setLocation(Location.builder()
                    .country("Italia")
                    .city("Rome")
                    .build());
            Stream.of(
                    Pair.of("France", "Paris"),
                    Pair.of("Romania", "ClujNapoca"),
                    Pair.of("US", "New-York"),
                    Pair.of("UK", "London")
            )
            .map(pair -> Location.builder()
                    .country(pair.getKey())
                    .city(pair.getValue())
                    .build()
            ).forEach(event.getAlternativeLocations()::add);

            repository.save(event);
        };
    }

}
