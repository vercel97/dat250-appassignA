package dat250.appassignA.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

public class ThirdPartyApp {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id;

    @Getter
    @Setter
    private Integer pollID;

    private static void getPollStatus(Integer pollID){
        //TODO: implement
    }
}
