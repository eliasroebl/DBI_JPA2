package at.htl.demo.api;

import at.htl.demo.dto.PersonDTO;
import at.htl.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.springframework.transaction.annotation.Transactional;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RequestMapping("api/v1/person")
@RestController
public class PersonController {

    private final PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @PostMapping
    @Transactional
    public void addPerson(@Valid @NotNull @RequestBody PersonDTO person){
        personService.addPerson(person);
    }

    @GetMapping
    @Transactional(readOnly=true)
    public List<PersonDTO> getAllPeople(){
        return personService.getAllPeople();
    }
}
