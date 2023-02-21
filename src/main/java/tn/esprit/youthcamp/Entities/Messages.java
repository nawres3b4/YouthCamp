package tn.esprit.youthcamp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Message")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Messages implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="idMessage")
    private Integer idMessage; // Clé primaire
    private String content;
    private MsType messageType;





}
