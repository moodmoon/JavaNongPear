package sit.int202.simple.entities;

import lombok.*;
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor

public class Subject {
    private String id;
    private String title;
    private double credit;
}
