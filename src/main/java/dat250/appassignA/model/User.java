package dat250.appassignA.model;

import java.util.List;

// Parent class User
public class User {
    private String username;
    private String email;
    private String password;
    private List<Poll> polls;

    // Constructors
    public User() {
    }

    public User(String username, String email, String password, List<Poll> polls) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.polls = polls;
    }

    // Getters and setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Poll> getPolls() {
        return polls;
    }

    public void setPolls(List<Poll> polls){
        this.polls = polls;
    }
}