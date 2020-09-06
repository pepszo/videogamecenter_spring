package tfe.videogamecenter.beans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "GamePublishers")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idGamePublisher",
        scope = GamePublisher.class)
public class GamePublisher {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idGamePublisher", nullable = false)
    private int idGamePublisher;

    @Column(name = "label")
    private String label;
}
