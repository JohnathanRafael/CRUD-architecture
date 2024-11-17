package crud.api.CRUD_architecture.controller;

import crud.api.CRUD_architecture.dto.DoctorDTO;
import crud.api.CRUD_architecture.mapper.DoctorMapper;
import crud.api.CRUD_architecture.model.DoctorModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("doctors")
public class DoctorController {

    @Autowired
    protected DoctorMapper mapper;

    @PostMapping
    public void register(@RequestBody DoctorDTO json) {
        System.out.println(json);

        DoctorModel doctor = this.mapper.toModel(json);
        System.out.println(doctor.getCrm());

        DoctorDTO teste = this.mapper.toDTO(doctor);
        System.out.println("Mostrar o DTO CRM: " + teste.crm());
    }
}
