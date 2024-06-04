package com.lberou.crud.dto;

public class LanguagesDTO {
    private Long id;
    private String language;
    private String level;

    public LanguagesDTO() {
    }

    public LanguagesDTO(Long id, String language, String level) {
        this.id = id;
        this.language = language;
        this.level = level;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
