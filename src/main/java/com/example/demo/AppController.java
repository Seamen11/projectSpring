package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

    @Autowired
    private CargoService service;


    @RequestMapping("/login")
    public String showLoginPage() {
        return "authorization";
    }

    @RequestMapping("/")
    public String viewHomePage(Model model, @Param("keyword") String keyword){
        List<Cargo> listCargo = service.listAll(keyword);
        model.addAttribute("listCargo", listCargo);
        model.addAttribute("keyword", keyword);
        return "index";
    }
    @RequestMapping("/new")
    public String showNewTheatreForm(Model model){
        Cargo cargo = new Cargo();
        model.addAttribute("cargo", cargo);
        return "new_cargo";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveTheatre(@ModelAttribute("cargo") Cargo cargo){
        service.save(cargo);
        return "redirect:/";
    }

    @RequestMapping("/edit/{id}")
    public ModelAndView showEditTheatreFrom(@PathVariable(name="id") Long id){
        ModelAndView mav = new ModelAndView("edit_cargo");
        Cargo cargo = service.get(id);
        mav.addObject("Cargo", cargo);
        return mav;
    }
    @RequestMapping("/histogram")
    public String qist(Model model, @Param("keyword") String keyword){
        List<Cargo> listCargo = service.listAll(keyword);
        model.addAttribute("listCargo", listCargo);
        model.addAttribute("keyword", keyword);
        Cargo cargo = new Cargo();
        model.addAttribute("Cargo", cargo);
        return "histogram";
    }

    @RequestMapping("/delete/{id}")
    public String deleteTheatre(@PathVariable(name="id") Long id){
        service.delete(id);
        return "redirect:/";
    }

}
