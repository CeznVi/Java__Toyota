package org.itstep.welcome_spring.app.models.toyota;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.itstep.welcome_spring.app.models.BaseEntity;

import java.util.Collection;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "toyota_car_engine")
public class CarEngine extends BaseEntity {

    private String type;
    private float engineCapacity;



}
