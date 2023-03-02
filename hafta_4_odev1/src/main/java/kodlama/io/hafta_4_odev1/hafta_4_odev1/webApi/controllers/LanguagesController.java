package kodlama.io.hafta_4_odev1.hafta_4_odev1.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import kodlama.io.hafta_4_odev1.hafta_4_odev1.business.abstracts.LanguageService;
import kodlama.io.hafta_4_odev1.hafta_4_odev1.entities.concretes.Language;

@RestController
@RequestMapping("api/languages")
public class LanguagesController {
    private LanguageService languageService;
    
    @Autowired
    public LanguagesController(LanguageService languageService) {
        this.languageService = languageService;
    }

    @GetMapping("/getall")
    public List<Language> getAll(){
        return languageService.getAll();
    }

    @PostMapping("/add")
    public void addLanguage(Language language)throws Exception{
        languageService.addLanguage(language);                
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLanguage(Language language){
        languageService.deleteLanguage(language.getId());
    }

    @GetMapping("/getbyid/{id}")
    public Language getByIdLanguage(Language language){
        return languageService.getById(language.getId());
    }

    @PutMapping("/update/{id}")
    public void updateLanguage(Language language,Language updatedLanguage)throws Exception{
        languageService.updateLanguage(language, updatedLanguage);
    }
}
