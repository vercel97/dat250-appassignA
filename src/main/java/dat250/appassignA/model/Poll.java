package dat250.appassignA.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class Poll {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private int id;

    private boolean isPrivate;

    private int duration;

    //@OneToOne
    //private PollData pollData;

    @OneToOne(mappedBy = "pairedPoll")
    //@JoinColumn(name = "iot_device_id")
    private IoTDevice pairedIoT;

}

