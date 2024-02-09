package kz.check.demo.education.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kz.check.demo.education.model.EducationItem;
import kz.check.demo.education.repository.EducationRepository;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:5173")
public class EducationController {
    
@GetMapping("/education_items")
public String outputMembership() {
    return "Education API";
}

@Autowired
EducationRepository educationRepository;

@PostMapping("/education_items")
public void createItem(@RequestBody EducationItem item) {
  //Optional<MembershipItem> itemOptional = itemRepository.findItemByEmail(item.getEmail());
  /*if(itemOptional.isPresent()) {
    throw new IllegalStateException("email taken");
  }*/
  educationRepository.save(item);
}
}
