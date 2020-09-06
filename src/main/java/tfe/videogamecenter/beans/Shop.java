package tfe.videogamecenter.beans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "Shops")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idShop",
        scope = Shop.class)
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idShop", nullable = false)
    private int idShop;

    @Column(name = "label")
    private String label;

    @Column(name = "address")
    private String address;

    @Column(name = "tel")
    private String tel;

}
