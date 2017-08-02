package me.anna.invoice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @RequestMapping("/index")
    public @ResponseBody String index()
    {
        return "Hello! Welcome to Invoice Application!";
    }

    @RequestMapping("/login")
    public @ResponseBody String login()
    {
        return "This is the login page";
    }


    @RequestMapping("/addproduct")
    public @ResponseBody String addProduct()
    {
        return "Add a product here";
    }

    @RequestMapping("/listproducts")
    public @ResponseBody String listProducts()
    {
        return "This is a list of your products";
    }


}
