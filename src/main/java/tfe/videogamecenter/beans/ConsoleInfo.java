package tfe.videogamecenter.beans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "ConsoleInfos")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idProduct",
        scope = ConsoleInfo.class)
public class ConsoleInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct", nullable = false)
    private int idProduct;

    @Column(name = "controllerNbr")
    private int controllerNbr;

    @Column(name = "stockage")
    private String stockage;

    @Column(name = "color")
    private String color;
}
