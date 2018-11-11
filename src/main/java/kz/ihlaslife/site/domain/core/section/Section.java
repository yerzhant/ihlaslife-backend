package kz.ihlaslife.site.domain.core.section;

import kz.ihlaslife.site.domain.core.BaseEntity;
import lombok.Data;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class Section extends BaseEntity {

    @NotNull
    private String name;

    private Integer priority;

    @NotEmpty
    private String quote;

    @NotEmpty
    private String quoteSource;
}
