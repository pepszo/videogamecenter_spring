package tfe.videogamecenter.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GameGenres")
@IdClass(GameGenre.class)
public class GameGenre implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct", nullable = false)
    private int idProduct;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGenre", nullable = false)
    private int idGenre;
}
