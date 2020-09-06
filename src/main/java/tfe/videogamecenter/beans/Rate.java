package tfe.videogamecenter.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Rates")
@IdClass(Rate.class)
public class Rate implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idUser", nullable = false)
    private int idUser;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct", nullable = false)
    private int idProduct;

    @Column(name = "note")
    private float note;

    @Column(name = "commentary")
    private String commentary;
}
