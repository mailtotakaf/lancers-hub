package com.example.lancershub;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HeloController {
    @Autowired
    EmployeeRepository empRepository;
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
//        List<Employee> emplist=empRepository.findAll();
//        model.addAttribute("emplist", emplist);
        return "index";
    }
}