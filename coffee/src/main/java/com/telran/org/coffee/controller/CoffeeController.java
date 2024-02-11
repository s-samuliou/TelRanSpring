package com.telran.org.coffee.controller;

import com.telran.org.coffee.model.Coffee;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//http://localhost:8080
@RestController
@RequestMapping("/coffee")  //http://localhost:8080 + /coffee
public class CoffeeController {

    private List<Coffee> coffeeList = new ArrayList<>();

    /*@GetMapping
    public String printHello() {
        return "Hello World!";
    }*/

    public CoffeeController() {
        init();
    }

    @GetMapping
    public Iterable<Coffee> getCoffees() {
        return coffeeList;
    }

    //http://localhost:8080/coffee/id
    @GetMapping("/{id}")
    public Coffee getCoffeeById(@PathVariable String id) {
        for (Coffee coffee : coffeeList) {
            if (coffee.getId().equals(id)) {
                return coffee;
            }
        }

        return null;
    }

    @PostMapping
    public Coffee addCoffee(@RequestBody Coffee coffee) {
        coffeeList.add(coffee);
        return coffee;
    }

    private void init() {
        coffeeList.addAll(List.of(
                new Coffee("Cafe Cappchino"),
                new Coffee("Cafe Lareno"),
                new Coffee("Cafe Espresso")
        ));
    }
}
