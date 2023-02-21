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
@Table(name = "TourReservation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TourReservation implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idTourReservation")
    private Integer idTourReservation; // Clé primaire
    private String locationNameR;
    private String descriptionR;
    //@Transient
   // @Temporal( TemporalType.DATE)
   private LocalDate durationR;
   // relation tourreservation et tour
   @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy="tourReservation")
    private Set<Tour> tours;






}
