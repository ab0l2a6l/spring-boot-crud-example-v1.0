package org.abolfazl.api;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.abolfazl.entity.Person;
import org.abolfazl.service.PersonService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
@RequiredArgsConstructor
@Slf4j
public class PersonAPI {
    private final PersonService personService;

    //@GetMapping("/save")
    @RequestMapping("/save")
    public Object save(@ModelAttribute Person person) {
        log.info("invoke saved . . .");
        personService.save(person);
        return person;
    }

    //@PostMapping("/update")
    @RequestMapping("/update")
    public Object update(@ModelAttribute Person person) {
        log.info("invoke update . . .");
        personService.update(person);
        return person;
    }

    @RequestMapping("/remove")
    public Object delete(@ModelAttribute Person person) {
        log.info("invoke remove . . .");
        personService.delete(person);
        return person;
    }

    @RequestMapping("/findAll")
    public Object findAll(){
        log.info("invoke findAll . . .");
       return personService.findAll();
    }
}