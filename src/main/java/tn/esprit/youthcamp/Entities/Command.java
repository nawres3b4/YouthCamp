package tn.esprit.youthcamp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Command")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Command implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idCommand")
    private Integer commandNumber; // Clé primaire
    private Integer quantity;
    private Float weight;
    private PMType PaymentMethod ;
    private CmdType CommandType;
    private LocalDate duration;
// relation command et delivery
@JsonIgnore
    @ManyToOne
    private Delivery delivery ;


}
