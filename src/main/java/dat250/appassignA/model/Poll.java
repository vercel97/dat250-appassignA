package dat250.appassignA.model;

public class Poll {
    private int id;
    private boolean isPrivate;
    private int duration;
    private PollData pollData;
    private IoTDevice pairedIoT;

    // Constructors
    public Poll() {
    }

    public Poll(int id, boolean isPrivate, int duration, PollData pollData, IoTDevice pairedIoT) {
        this.id = id;
        this.isPrivate = isPrivate;
        this.duration = duration;
        this.pollData = pollData;
        this.pairedIoT = pairedIoT;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

    public void setPrivate(boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public PollData getPollData() {
        return pollData;
    }

    public void setPollData(PollData pollData) {
        this.pollData = pollData;
    }

    public IoTDevice getPairedIoT() {
        return pairedIoT;
    }

    public void setPairedIoT(IoTDevice pairedIoT) {
        this.pairedIoT = pairedIoT;
    }
}

