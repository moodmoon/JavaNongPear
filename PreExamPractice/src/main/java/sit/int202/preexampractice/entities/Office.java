package sit.int202.preexampractice.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "offices")
@Setter
@Getter
@NamedQueries({
        //[... your query here]
})
@ToString(exclude = "employees") //ไม่เอา
public class Office {
    @Id
    @Column(name = "officeCode", nullable = false)
    private String id;
    private String city;
    private String phone;
    private String addressLine1;
    private String addressLine2;
    private String state;
    private String country;
    private String postalCode;
    private String territory;
    @OneToMany(mappedBy = "office", cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
    List<Employee> employees;
}
