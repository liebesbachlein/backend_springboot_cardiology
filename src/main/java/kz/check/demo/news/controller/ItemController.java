package kz.check.demo.news.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import kz.check.demo.news.model.NewsItem;
import kz.check.demo.news.repository.ItemRepository;
import java.util.*;


@RestController
@RequestMapping(path = "/api")
@CrossOrigin(origins = "http://localhost:5173")
public class ItemController {

@GetMapping
  public String hello() {
      return "API";
  }

@Autowired
  ItemRepository itemRepository;

  @GetMapping(value = "/news_items")
  public List<NewsItem> getAllItems() {
     return itemRepository.findAll();
  }


  @GetMapping(value = "/news_items/{id}")
  public NewsItem getItemById(@PathVariable("id") long id) {
      NewsItem idItem = itemRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Invalid user Id:" + id));;
      return idItem;

  }

  @PostMapping("/news_items")
  public void createItem(@RequestBody NewsItem item) {
    Optional<NewsItem> itemOptional = itemRepository.findItemByTitle(item.getTitle());
    if(itemOptional.isPresent()) {
      throw new IllegalStateException("title taken");
    }
    itemRepository.save(item);
}
}