package sit.int202.preexampractice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
@Table(name = "employees")
@NamedQueries({
        //[... your query here]
})
@ToString
public class Employee {

    @Id
    @Column(name = "employeeNumber", nullable = false)
    private Integer id;
    private String firstName;
    private String lastName;
    private String extension;
    private String email;
    @ManyToOne
    @JoinColumn(name = "officeCode")
    private Office office;
    private String password;
}
