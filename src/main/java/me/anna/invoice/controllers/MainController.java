package me.anna.invoice.controllers;

import me.anna.invoice.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {


    @RequestMapping("/")
    public @ResponseBody String defaultPage()
    {
        return "This is the default page. Pype \"index\"";
    }

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


    @GetMapping("/addproduct")
    public String greetingForm(Model model) {
        model.addAttribute("Product", new Product());
        return "addproduct";
    }


    @RequestMapping("/listproducts")
    public String listProducts(Model model)
    {
        String dependency1 = "spring-boot-starter-thymeleaf";
        String dependency2 = "spring-boot-starter-web";
        String dependency3 = "spring-boot-starter-test";
        model.addAttribute("myMessage1", dependency1);
        model.addAttribute("myMessage2", dependency2);
        model.addAttribute("myMessage3", dependency3);
        return "listproducts";
    }

    @PostMapping("/addproduct")
    public String displayAddedProduct(@ModelAttribute Product product) {
        return "showproductdetails";
    }



    /*   Basic invoice app
    Remember to create a new project for each exercise.
    Using the information from exercise 2:

    The routes will be as follows:

            1. /index - this will display a welcome page
            2. /login - this will display the text "This is the login page"
            3. /addproduct - this will dispaly the text "Add a product here"
            4. /listproducts - this will display the text "This is a list of your products"

    First, decide which dependencies you will be using.
    On the /listproducts page, use the model to display the following text:
    "The dependencies used are: Dependency 1, Dependency 2, Dependency 3, etc",
    where each name is the artefact id of your dependency.

    You are not expected to list these automatically, you are expected to type the text.
    */


    /*  Basic Invoice - Addition
    Enhance the Basic Invoice App

    1. /addproduct - this should allow you to enter product details -
        create a product class and add price, description and item code information.
        Enter this information and display it to the /showproductdetails route.

    2. /showproductdetails - Create a route for this,
        and show information for the product you created
     */

}
