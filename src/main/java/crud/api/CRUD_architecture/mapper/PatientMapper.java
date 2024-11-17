package crud.api.CRUD_architecture.mapper;

import crud.api.CRUD_architecture.dto.PatientDTO;
import crud.api.CRUD_architecture.model.PatientModel;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel="spring")
public interface PatientMapper {

    PatientModel toModel(PatientDTO dto);
    PatientDTO toDto(PatientModel model);
    List<PatientDTO> toDto(List<PatientModel> list);

}
