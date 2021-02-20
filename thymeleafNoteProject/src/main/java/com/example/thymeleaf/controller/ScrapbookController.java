package com.example.thymeleaf.controller;

import com.example.thymeleaf.model.Note;
import com.example.thymeleaf.service.ScrapbookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ScrapbookController {
    @Autowired
    ScrapbookService service;
    @PostMapping("/write")
    public String displayNote(@ModelAttribute("note") Note note){

        return "displayPage";

    }

    /*@PostMapping("/write")
    public String displayNote(@ModelAttribute("note") Note note, BindingResult bindingResult, Model model, RedirectAttributes ra){
        service.save(note);
        if ( bindingResult.hasErrors() ) {
            return "readPage";
        }
        //model.addAttribute("note",note);
        // ra.addFlashAttribute("note", note);
        return "displayPage";
        // return "redirect:/displayNote" ;
    }*/
    @GetMapping("/scrapbook")
    public String readNote(Model model) {
        model.addAttribute("note",new Note());
        return "readPage";
    }

  /*  @GetMapping("/displayNote")
    public String readNote(@ModelAttribute("note")Note note,Model model) {
        return "displayPage";
    }

*/
}
