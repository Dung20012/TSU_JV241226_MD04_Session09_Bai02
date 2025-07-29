package com.data.session_09.controller;

import com.data.session_09.model.entity.Seed;
import com.data.session_09.service.ISeedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/seeds")
public class SeedController {
    @Autowired
    private ISeedService seedService;

    @GetMapping
    public String listSeeds(
            @RequestParam(name = "page", defaultValue = "1") int page,
            @RequestParam(name = "size", defaultValue = "3") int size,
            Model model) {

        if (page < 1) page = 1;
        if (size < 1) size = 3;

        List<Seed> seeds = seedService.findAll(page, size);

        model.addAttribute("seeds", seeds);
        model.addAttribute("currentPage", page);
        model.addAttribute("pageSize", size);

        return "seedList";
    }

    @GetMapping("/create")
    public String showCreateForm(Model model) {
        model.addAttribute("seed", new Seed());
        return "seedForm";
    }

    @PostMapping("/save")
    public String saveSeed(@ModelAttribute("seed") Seed seed) {
        if (seed.getId() == 0) {
            seedService.save(seed);
        } else {
            seedService.update(seed);
        }
        return "redirect:/seeds";
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam("id") long id, Model model) {
        Seed seed = seedService.findById(id);
        model.addAttribute("seed", seed);
        return "seedForm";
    }

    @GetMapping("/delete")
    public String deleteSeed(@RequestParam("id") long id) {
        seedService.delete(id);
        return "redirect:/seeds";
    }

}
