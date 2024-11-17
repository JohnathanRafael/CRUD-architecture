package crud.api.CRUD_architecture.dto;

import crud.api.CRUD_architecture.dto.common.AdressDTO;
import crud.api.CRUD_architecture.dto.common.PeopleDTO;
import crud.api.CRUD_architecture.utils.enums.Specialty;

public record DoctorDTO(PeopleDTO people, String crm, Specialty specialty, AdressDTO adress) {
}
