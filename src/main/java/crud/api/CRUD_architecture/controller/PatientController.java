package crud.api.CRUD_architecture.controller;

import crud.api.CRUD_architecture.dto.PatientDTO;
import crud.api.CRUD_architecture.mapper.PatientMapper;
import crud.api.CRUD_architecture.model.PatientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patients")
public class PatientController {

    @Autowired
    PatientMapper mapper;

    @PostMapping
    public void register(@RequestBody PatientDTO patient){
        System.out.println(patient);

        PatientModel patientModel = this.mapper.toModel(patient);
        System.out.println("MODELO " + patientModel.getPeople().getName());

        PatientDTO patientDTO = this.mapper.toDto(patientModel);
        System.out.println("DTO " + patientDTO.people().name());
    }
}
