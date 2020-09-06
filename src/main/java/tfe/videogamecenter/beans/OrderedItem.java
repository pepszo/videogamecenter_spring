package tfe.videogamecenter.beans;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "OrderedItems")
@IdClass(OrderedItem.class)
public class OrderedItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idItem", nullable = false)
    private int idItem;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrder", nullable = false)
    private int idOrder;
}
