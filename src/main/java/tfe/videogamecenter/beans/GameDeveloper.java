package tfe.videogamecenter.beans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "GameDevelopers")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idGameDeveloper",
        scope = GameDeveloper.class)
public class GameDeveloper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGameDeveloper", nullable = false)
    private int idGameDeveloper;

    @Column(name = "label")
    private String label;
}
