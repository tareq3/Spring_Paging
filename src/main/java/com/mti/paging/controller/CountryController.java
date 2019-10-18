package com.mti.paging.controller;

import com.mti.paging.domains.Country;
import com.mti.paging.repository.CountryRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * CountryController
 */
@Controller
public class CountryController {

    @Autowired
    CountryRepo countryRepo;

    @GetMapping("/")
    private String showPage(Model model, @RequestParam(defaultValue = "0") int page) {
        model.addAttribute("data", countryRepo.findAll(new PageRequest(page, 4)));
        model.addAttribute("currentPage", page);
        return "index";
    }

    @PostMapping("/save")
    public String save(Country country) {
        countryRepo.save(country);
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(Long id) {
        countryRepo.deleteById(id);
        return "redirect:/";
    }

    @GetMapping("/findOne")
    @ResponseBody
    public Country findOne(Long id) {
       
        return countryRepo.findById(id).get();
    }

}