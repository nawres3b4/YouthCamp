package tn.esprit.youthcamp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Center")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LocationCenter implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idcenter")
    private Integer idcenter; // Clé primaire
    private Integer number;
    private String state;
    private String place;
    private Float Price;





}
