package org.itstep.welcome_spring.app.models.toyota;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.itstep.welcome_spring.app.models.BaseEntity;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "toyota_car_complect")
public class CarComplect extends BaseEntity {



}
