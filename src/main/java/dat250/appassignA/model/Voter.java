package dat250.appassignA.model;

import java.util.List;

// Child class Voter that inherits from User
public class Voter extends User {
    private boolean hasVoted;

    // Constructors
    public Voter() {
    }

    public Voter(String username, String email, String password, List<Poll> polls, boolean hasVoted) {
        super(username, email, password, polls);
        this.hasVoted = hasVoted;
    }

    // Getters and setters
    public boolean isHasVoted() {
        return hasVoted;
    }

    public void setHasVoted(boolean hasVoted) {
        this.hasVoted = hasVoted;
    }
}