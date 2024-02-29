package org.itstep.welcome_spring.app.models.toyota;


import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.itstep.welcome_spring.app.models.BaseEntity;
import org.itstep.welcome_spring.app.models.auth.Admin;

import java.util.Collection;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "toyota_car_complect")
public class CarComplect extends BaseEntity {

    private String thumb;

    private String description;

    @ManyToMany
    private Collection<CarEngine> carEngine;

    @ManyToMany
    private Collection<CarColor> carColor;

    private String linkToImage;
}
