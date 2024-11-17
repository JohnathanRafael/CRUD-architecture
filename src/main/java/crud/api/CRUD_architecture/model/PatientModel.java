package crud.api.CRUD_architecture.model;

import crud.api.CRUD_architecture.model.common.AdressModel;
import crud.api.CRUD_architecture.model.common.PeopleModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Table(name = "patients")
@Entity(name = "Patient")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class PatientModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Embedded
    private AdressModel adress;

    @Embedded
    private PeopleModel people;

}
