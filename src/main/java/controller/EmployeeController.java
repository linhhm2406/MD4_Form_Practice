package controller;

import model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @GetMapping("/showform")
    public ModelAndView showForm(){
        ModelAndView modelAndView = new ModelAndView("create");
        modelAndView.addObject("employee",new Employee());
        return modelAndView;
    }

    @PostMapping("/addEmployee")
    public ModelAndView showInfor(@ModelAttribute Employee employee){
        ModelAndView modelAndView = new ModelAndView("user-info");
        modelAndView.addObject("employee",employee);
        return modelAndView;
    }
}
