package crud.api.CRUD_architecture.mapper;

import crud.api.CRUD_architecture.dto.DoctorDTO;
import crud.api.CRUD_architecture.model.DoctorModel;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;


@Mapper(componentModel="spring")
public interface DoctorMapper {

    DoctorModel toModel(DoctorDTO dto);
    DoctorDTO toDTO(DoctorModel modelo);
    List<DoctorDTO> toDTO(List<DoctorModel> list);

}
