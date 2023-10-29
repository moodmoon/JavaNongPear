package sit.int202.sitspacemanagement.model;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor

public class Student {
    private int id ;
    private String name;
    private double score ;
    private String grade;
}
