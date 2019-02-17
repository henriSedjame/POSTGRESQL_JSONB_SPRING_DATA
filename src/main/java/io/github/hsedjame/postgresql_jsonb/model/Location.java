package io.github.hsedjame.postgresql_jsonb.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

/**
 * @Project POSTGRESQL_JSONB_SPRING_DATA
 * @Author Henri Joel SEDJAME
 * @Date 17/02/2019
 * @Class purposes : .......
 */
@Data
@Builder
public class Location implements Serializable {
    private String country;
    private String city;
}
