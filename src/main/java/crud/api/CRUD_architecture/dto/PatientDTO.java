package crud.api.CRUD_architecture.dto;

import crud.api.CRUD_architecture.dto.common.AdressDTO;
import crud.api.CRUD_architecture.dto.common.PeopleDTO;

public record PatientDTO(PeopleDTO people, AdressDTO adress) {
}
