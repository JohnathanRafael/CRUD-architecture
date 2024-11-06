package crud.api.CRUD_architecture.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class DoctorController {

    @PostMapping
    public void register(@RequestBody String json) {
        System.out.println(json);
    }
}
