package com.data.session_09.controller;

import com.data.session_09.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/category")
public class CategoryController {
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String showAllCategories(Model model) {
        categoryService.insertSampleData();
        model.addAttribute("categories", categoryService.getAll());
        return "categoryList";
    }
}
