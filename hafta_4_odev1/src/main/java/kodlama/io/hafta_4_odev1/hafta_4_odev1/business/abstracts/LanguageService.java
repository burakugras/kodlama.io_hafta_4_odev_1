package kodlama.io.hafta_4_odev1.hafta_4_odev1.business.abstracts;

import java.util.List;

import kodlama.io.hafta_4_odev1.hafta_4_odev1.entities.concretes.Language;

public interface LanguageService {
    void addLanguage(Language language)throws Exception;
    void deleteLanguage(int id);
    Language getById(int id);
    List<Language> getAll();
    void updateLanguage(Language language,Language updatedLanguage)throws Exception ;
}
