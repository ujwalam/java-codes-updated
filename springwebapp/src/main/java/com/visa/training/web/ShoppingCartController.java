package com.visa.training.web;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes({"selectedBooks","selectedCars","selectedBikes"})
public class ShoppingCartController {
    
    @RequestMapping("/addbooks")
    public String handleAddBooks(@RequestParam("books")String[] books,Map model) {
        model.put("selectedBooks", books);
        return "carview";
    }

    @RequestMapping("/addcars")
    public String handleAddCars(@RequestParam("cars")String[] cars,Map model) {
        model.put("selectedCars", cars);
        return "bikeview";
    }
    
    @RequestMapping("/addbikes")
    public String handleAddBikes(@RequestParam("bikes")String[] bikes,Map model) {
        model.put("selectedBikes", bikes);
        return "cartview";
    }
}
