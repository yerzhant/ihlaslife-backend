package kz.ihlaslife.site.domain.core;

import lombok.Data;
import org.springframework.hateoas.Identifiable;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Data
public abstract class BaseEntity implements Identifiable<Long> {

    @Id
    @GeneratedValue
    private Long id;
}
