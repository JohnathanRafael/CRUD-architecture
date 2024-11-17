package crud.api.CRUD_architecture.model;

import crud.api.CRUD_architecture.model.common.AdressModel;
import crud.api.CRUD_architecture.model.common.PeopleModel;
import crud.api.CRUD_architecture.utils.enums.Specialty;
import jakarta.persistence.*;
import lombok.*;

@Table(name = "doctors")
@Entity(name = "Doctor")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class DoctorModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String crm;

    @Enumerated(EnumType.STRING)
    Specialty specialty;

    @Embedded
    private AdressModel adress;

    @Embedded
    private PeopleModel people;

}
