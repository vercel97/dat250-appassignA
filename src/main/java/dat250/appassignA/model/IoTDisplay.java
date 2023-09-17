package dat250.appassignA.model;

import jakarta.persistence.*;

@Entity
public class IoTDisplay {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private IoTDevice device;
}
