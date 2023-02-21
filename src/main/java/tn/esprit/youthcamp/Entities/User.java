package tn.esprit.youthcamp.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "User")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="iduser")
    private Integer iduser; // Clé primaire
    private String firstName;
    private String lastName;
    private String age;
    private String sexe;
    private String email;
    private String password;
    private Integer phone;
@JsonIgnore
// relation tour reservation et user

@OneToMany(cascade = CascadeType.ALL)
private Set< TourReservation> tourReservations;

//relation tour et user
@JsonIgnore
@OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private Set <Tour> tours;

//relation user delivery
@JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="user")
    private Set <Delivery> deliveries;
}
