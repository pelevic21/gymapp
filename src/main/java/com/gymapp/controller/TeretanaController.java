package com.gymapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.gymapp.model.SpisakClanova;
import com.gymapp.model.Teretana;
import com.gymapp.service.SpisakClanovaService;
import com.gymapp.service.TeretanaService;

@Controller
public class TeretanaController {
	@Autowired
	private SpisakClanovaService clanoviService;
	@Autowired
	private TeretanaService teretanaService;
	
	@GetMapping("/home")
    public String welcomeConvert(Model model) {
        return "home";
    }
	
	@GetMapping("/lokacije")
    public String lokacije(Model model) {
		List<Teretana> lokacije = teretanaService.getAll();
		model.addAttribute("lokacije" , lokacije);
        return "lokacije";
    }
	
	@GetMapping("/galerija")
    public String galerija(Model model) {
        return "galerija";
    }
	@GetMapping("/kontakt")
    public String kontakt(Model model) {
        return "kontakt";
    }
	@GetMapping("/clanovi")
    public String clanovi(Model model) {
		List<SpisakClanova> clanovi = clanoviService.getAll();
		model.addAttribute("clanovi" , clanovi);
        return "clanovi";
    }
	@GetMapping("/novi_clan")
    public String noviClan(Model model) {
		SpisakClanova clan = new SpisakClanova();
		model.addAttribute("clan" , clan);
        return "novi_clan";
    }
	@PostMapping("/novi_clan")
    public String noviClan1(@ModelAttribute("clan") SpisakClanova clan ) {
		clanoviService.addNewClan(clan);
        return "redirect:/clanovi";
    }
	
	 @GetMapping("/login")
	    public String login(Model model, String error, String logout) {
	    	 	
	        if (error != null)
	            model.addAttribute("error", "Your username and password is invalid.");

	        if (logout != null)
	            model.addAttribute("message", "You have been logged out successfully.");

	        return "login";
	    }
}
