package tfe.videogamecenter.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Items")
@IdClass(Item.class)
public class Item implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idItem", nullable = false)
    private int idItem;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idShop", nullable = false)
    private int idShop;

    @Column(name = "materialized")
    private boolean materialized;

    @Column(name = "price")
    private float price;

    @Column(name = "dematKey")
    private String dematKey;
}
