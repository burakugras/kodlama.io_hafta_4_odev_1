package kodlama.io.hafta_4_odev1.hafta_4_odev1.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.hafta_4_odev1.hafta_4_odev1.business.abstracts.LanguageService;
import kodlama.io.hafta_4_odev1.hafta_4_odev1.dataAccess.abstracts.LanguageRepository;
import kodlama.io.hafta_4_odev1.hafta_4_odev1.entities.concretes.Language;

@Service
public class LanguageManager implements LanguageService{
    private LanguageRepository languageRepository;    

    @Autowired
    public LanguageManager(LanguageRepository languageRepository) {
        this.languageRepository = languageRepository;
    }


    @Override
    public void addLanguage(Language language)throws Exception {
        for (Language languageElement : languageRepository.getAll()) {
            if(language.getName().equals(languageElement.getName())){
                throw new Exception("bu isimde bir kurs zaten mevcut");
            }
        }
        if(language.getName().isEmpty()){
            throw new Exception("isim boş bırakılamaz");
        }

        languageRepository.addLanguage(language);
    }

    @Override
    public void deleteLanguage(int id) {
        languageRepository.deleteLanguage(id);
    }

    @Override
    public Language getById(int id) {
        return languageRepository.getById(id);
    }

    @Override
    public List<Language> getAll() {
        return languageRepository.getAll();
    }

    @Override
    public void updateLanguage(Language language, Language updatedLanguage)throws Exception {
        for(Language languageElement : languageRepository.getAll()){
            if(language.getName().equals(languageElement.getName())){
                throw new Exception("bu isimde bir kurs zaten mevcut");
            }
        }
        if(language.getName().isEmpty()){
            throw new Exception("isim boş bırakılamaz");
        }

        //languageRepository.set(language.getId(), updatedLanguage);
        languageRepository.updateLanguage(language, updatedLanguage);
    }
    
}
