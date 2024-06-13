package Manager_c.controllers;

import Manager_c.entity.Customer;
import Manager_c.service.ServiceCustomer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/admin")
public class CustomerController {
    @Autowired
    private ServiceCustomer service;



    @GetMapping(value = "/home")
    public ModelAndView home() {
        ModelAndView model = new ModelAndView("home");
        model.addObject("customer", service.findAll());
        return model;
    }

    @GetMapping(value = "/customer/{id}")
    public ModelAndView getCustomerById(@PathVariable int id) {
        ModelAndView model = new ModelAndView("customer");
        model.addObject("customer", service.findById(id));
        return model;
    }

    @GetMapping(value = "/create")
    public ModelAndView createCustomer() {
        ModelAndView model = new ModelAndView("create");
        model.addObject("customer", new Customer());
        return model;
    }

    @PostMapping(value = "/create")
    public String create(@ModelAttribute Customer customer) {
        service.save(customer);
        return "customer";
    }

    @GetMapping(value = "/edit/{id}")
    public String editCustomer(@PathVariable int id , ModelMap modelMap) {
        Customer customerList = service.findById(id);
        if (customerList == null){
            modelMap.addAttribute("message", "Customer not found");
            return "home";
        } else {
            modelMap.addAttribute("customer", customerList);
            return "edit";
        }
    }

    @PostMapping(value = "/edit/{id}")
    public String edit(@PathVariable int id , @ModelAttribute Customer customer) {
        service.update(id, customer);
        return "customer";
    }

    @PostMapping(value = "/delete/{id}")
    public String delete(@PathVariable int id) {
        service.delete(id);
        return "home";
    }
}
