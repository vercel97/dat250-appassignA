package dat250.appassignA.model;

import java.util.List;

// Child class Voter that inherits from User

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Voter extends User {
    private boolean hasVoted;

    // Constructors
    public Voter() {
    }
}