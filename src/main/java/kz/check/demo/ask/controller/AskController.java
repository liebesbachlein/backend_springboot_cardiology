package kz.check.demo.ask.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import kz.check.demo.ask.model.AskItem;
import kz.check.demo.ask.repository.AskRepository;

@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:5173")
public class AskController {
    
@GetMapping("/ask_items")
public String outputAsk() {
    return "Ask API";
}

@Autowired
AskRepository askRepository;

@PostMapping("/ask_items")
public void createItem(@RequestBody AskItem item) {
  askRepository.save(item);
}
}
