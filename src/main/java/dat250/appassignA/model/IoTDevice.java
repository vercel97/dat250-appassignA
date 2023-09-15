package dat250.appassignA.model;

public class IoTDevice {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include

    private String id;
    private Integer redVotes;
    private Integer greenVotes;
    private Poll pairedPoll;
}
