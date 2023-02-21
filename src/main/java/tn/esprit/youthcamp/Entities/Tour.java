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
@Table(name = "Tour")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tour implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idTour")
    private Integer idTour; // Clé primaire
    private String locationName;
    private String description;
    //@Transient
   // @Temporal( TemporalType.DATE)
   private LocalDate duration;

    @JsonIgnore
   //relation tour et user
    @ManyToOne
    private User user ;
    @JsonIgnore
// relation tour reservation et tour
    @ManyToOne
    private TourReservation tourReservation ;








}
