package crud.api.CRUD_architecture.model.common;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AdressModel {

    private String road;
    private String neighborhood;
    private String cep;
    private String city;
    private String state;
    private String number;
    private String complement;

}
