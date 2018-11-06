package kz.ihlaslife.site.domain.core.action;

import kz.ihlaslife.site.domain.core.BaseEntity;
import kz.ihlaslife.site.domain.core.section.Section;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
public class Action extends BaseEntity {

    @NotNull
    @ManyToOne
    private Section section;

    @NotNull
    private LocalDateTime createdOn;

    @NotNull
    private String image;

    @NotNull
    @Lob
    private String description;

    @NotNull
    private Integer targetAmount;

    private Integer paidAmount;

    public Integer getLeftAmount() {
        return targetAmount - paidAmount;
    }
}
