package tfe.videogamecenter.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "GameModes")
@IdClass(GameMode.class)
public class GameMode implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct", nullable = false)
    private int idProduct;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idMode", nullable = false)
    private int idMode;
}
