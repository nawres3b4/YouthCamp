package tn.esprit.youthcamp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "Transport")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Transport implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idTransport")
    private Integer idTransport; // Clé primaire
    private String departure;
    private String destination;
    private LocalDate DateT;
   





}
