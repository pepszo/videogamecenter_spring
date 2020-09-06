package tfe.videogamecenter.beans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "ModelInfos")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idProduct",
        scope = ModelInfo.class)
public class ModelInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProduct", nullable = false)
    private int idProduct;

    @Column(name = "label")
    private String label;

    @Column(name = "releaseDate")
    private Date releaseDate;

    @Column(name = "licence")
    private String licence;
}
