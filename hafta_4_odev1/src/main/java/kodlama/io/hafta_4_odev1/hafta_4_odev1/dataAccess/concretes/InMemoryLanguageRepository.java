package kodlama.io.hafta_4_odev1.hafta_4_odev1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.hafta_4_odev1.hafta_4_odev1.dataAccess.abstracts.LanguageRepository;
import kodlama.io.hafta_4_odev1.hafta_4_odev1.entities.concretes.Language;

@Repository
public class InMemoryLanguageRepository implements LanguageRepository{
    List<Language> languages;    

    public InMemoryLanguageRepository() {
        languages=new ArrayList<Language>();
        languages.add(new Language(1, "Java"));
        languages.add(new Language(2, "C#"));
        languages.add(new Language(3, "Python"));
        languages.add(new Language(4, "JavaScript"));
    }

    @Override
    public void addLanguage(Language language) {
        languages.add(language);        
    }

    @Override
    public void deleteLanguage(int id) {
        languages.remove(id);        
    }

    @Override
    public void updateLanguage(Language language, Language updatedLanguage) {
        languages.set(language.getId(), updatedLanguage);
    }

    @Override
    public List<Language> getAll() {
        return languages;
    }

    @Override
    public Language getById(int id) {
        return languages.get(id);
    }
}
