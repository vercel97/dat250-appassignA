package dat250.appassignA.model;

// Child class Voter that inherits from User

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Inheritance
public class Voter extends User {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private boolean hasVoted;

}