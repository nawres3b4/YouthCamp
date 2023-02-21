package tn.esprit.youthcamp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "Delivery")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Delivery implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idDelivery")
    private Integer idDelivery; // Clé primaire
    private String adress;

   private LocalDate deliveryDate;

   private DeliveryType deliveryType ;
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="delivery")
    private Set<Command> commands;

    //relation delivery et user
    @JsonIgnore
    @ManyToOne
    private User user ;
}
