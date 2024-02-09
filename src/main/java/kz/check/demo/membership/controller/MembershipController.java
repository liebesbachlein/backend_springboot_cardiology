package kz.check.demo.membership.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import kz.check.demo.membership.model.MembershipItem;
import kz.check.demo.membership.repository.MembershipRepository;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:5173")
public class MembershipController {
    
@GetMapping("/membership_items")
public String outputEducation() {
    return "Membership API";
}

@Autowired
MembershipRepository membershipRepository;

@PostMapping("/membership_items")
public void createItem(@RequestBody MembershipItem item) {
  //Optional<MembershipItem> itemOptional = itemRepository.findItemByEmail(item.getEmail());
  /*if(itemOptional.isPresent()) {
    throw new IllegalStateException("email taken");
  }*/
  membershipRepository.save(item);
}
}
