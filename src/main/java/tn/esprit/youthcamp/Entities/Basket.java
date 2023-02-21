package tn.esprit.youthcamp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Basket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Basket implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idBasket")
    private Integer idBasket; // Clé primaire
    private Integer quantity;
    private Float totalPrice;


}
