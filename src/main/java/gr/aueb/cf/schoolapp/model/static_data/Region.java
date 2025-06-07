package gr.aueb.cf.schoolapp.model.static_data;


import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "regions")
public class Region {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;        // ΣΥΝΗΘΩΣ ΟΙ ΠΑΡΑΜΕΤΡΙΚΟΙ ΠΙΝΑΚΕΣ ΟΠΩΣ ΤΟ REGIONS ΕΧΟΘΝ ΔΥΟ ΠΕΔΙΑ ΜΟΝΟ ID, NAME
    private String name;

    // ΣΥΝΗΘΩΣ ΕΝΑ REGION ΣΥΝΔΕΕΤΑΙ ΜΕ ΠΟΛΛΑ EDUCATIONAL UNITS
    @Getter(AccessLevel.PRIVATE)
    @OneToMany(mappedBy = "region")
    private Set<EducationalUnit> educationalUnits = new HashSet<>();    // ΠΡΟΤΙΜΟΥΜΕ HASHSET ΓΙΑ ΚΑΛΥΤΕΡΟΥΣ ΧΡΟΝΟΥΣ ΑΝΑΖΗΤΗΣΗΣ
}
