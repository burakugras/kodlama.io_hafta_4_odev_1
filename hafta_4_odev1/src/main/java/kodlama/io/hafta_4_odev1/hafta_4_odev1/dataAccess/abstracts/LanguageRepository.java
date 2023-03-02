package kodlama.io.hafta_4_odev1.hafta_4_odev1.dataAccess.abstracts;

import java.util.List;

import kodlama.io.hafta_4_odev1.hafta_4_odev1.entities.concretes.Language;

public interface LanguageRepository {
    void addLanguage(Language language);
    void deleteLanguage(int id);
    void updateLanguage(Language language,Language updatedLanguage);
    List<Language> getAll();
    Language getById(int id);
}
