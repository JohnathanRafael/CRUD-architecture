package crud.api.CRUD_architecture.model.common;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PeopleModel {

    private String name;
    private String email;
    private String fone;
    private String cpf;
}
