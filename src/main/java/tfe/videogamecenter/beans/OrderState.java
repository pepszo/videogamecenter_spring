package tfe.videogamecenter.beans;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import javax.persistence.*;

@Entity
@Table(name = "OrderStates")
@JsonIdentityInfo(
        generator = ObjectIdGenerators.PropertyGenerator.class,
        property = "idOrderState",
        scope = OrderState.class)
public class OrderState {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOrderState", nullable = false)
    private int idOrderState;

    @Column(name = "label")
    private String label;
}
