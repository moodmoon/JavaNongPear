package sit.int202.preexam.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "Offices")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@NamedQueries(
        {
                @NamedQuery(name = "OFFICE.FIND_ALL", query = "select o from Office o"),
                @NamedQuery(name = "OFFICE.FIND_BY_COUNTRY", query = "select o from Office o where o.country like :country"),
                @NamedQuery(name = "OFFICE.FIND_BY_CITY_OR_COUNTRY", query = "select o from Office o where lower(o.city) like :city or lower(o.country) like :country")
        }
)
public class Office {
    @Id
    private String officeCode;
    private String addressLine1;
    private String addressLine2;
    private String city;
    private String state;
    private String country;
    private String postalCode;
    private String phone;
    private String territory;
    @OneToMany(mappedBy = "officeCode" )
    private List<Employee> employeeList;
}

