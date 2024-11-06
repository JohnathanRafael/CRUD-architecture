package crud.api.CRUD_architecture.controller;

import crud.api.CRUD_architecture.dto.PatientDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("patients")
public class PatientController {

    @PostMapping
    public void register(@RequestBody PatientDTO patient){
        System.out.println(patient);
    }
}
