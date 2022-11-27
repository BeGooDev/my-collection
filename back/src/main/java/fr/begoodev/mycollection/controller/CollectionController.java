package fr.begoodev.mycollection.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("collection")
public class CollectionController {
    
    
    @GetMapping()
    public String list() {
        return "Hello world";
    }
}
