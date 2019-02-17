package io.github.hsedjame.postgresql_jsonb.model;

import com.vladmihalcea.hibernate.type.array.IntArrayType;
import com.vladmihalcea.hibernate.type.array.StringArrayType;
import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeBinaryType;
import com.vladmihalcea.hibernate.type.json.JsonNodeStringType;
import com.vladmihalcea.hibernate.type.json.JsonStringType;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;

import javax.persistence.*;

/**
 * @Project POSTGRESQL_JSONB_SPRING_DATA
 * @Author Henri Joel SEDJAME
 * @Date 17/02/2019
 * @Class purposes : .......
 */
@TypeDefs({
        @TypeDef(name = Const.STRING_ARRAY, typeClass = StringArrayType.class),
        @TypeDef(name = Const.INT_ARRAY, typeClass = IntArrayType.class),
        @TypeDef(name = Const.JSON, typeClass = JsonStringType.class),
        @TypeDef(name = Const.JSON_B, typeClass = JsonBinaryType.class),
        @TypeDef(name = Const.JSON_B_NODE, typeClass = JsonNodeBinaryType.class),
        @TypeDef(name = Const.JSON_NODE, typeClass = JsonNodeStringType.class)
})
@MappedSuperclass
public class BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Version
    private Integer version;
}
