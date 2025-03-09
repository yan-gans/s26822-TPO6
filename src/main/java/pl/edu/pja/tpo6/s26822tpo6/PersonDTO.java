package pl.edu.pja.tpo6.s26822tpo6;

import java.util.HashMap;
import java.util.List;

public class PersonDTO {
    private List<Person> personList;
    private HashMap<String,String[]> headers;
    private String lang;
    private String[] languagedesc= {
            "en",
            "fr",
            "de",
            "es",
            "it",
            "ja",
            "pt",
            "ru",
            "ar",
            "id"};
    private String[] codedesc= {
            "Address",
            "University",
            "Country of origin",
            "Gender",
            "Blood type",
            "Job",
            "MBTI",
            "Phone number"};
    public PersonDTO(List<Person> personList, HashMap<String,String[]> labels,String lang) {
        this.personList = personList;
        this.headers = labels;
        this.lang=lang;
    }

    public String[] getLanguagedesc() {
        return languagedesc;
    }

    public void setLanguagedesc(String[] languagedesc) {
        this.languagedesc = languagedesc;
    }

    public String[] getCodedesc() {
        return codedesc;
    }

    public void setCodedesc(String[] codedesc) {
        this.codedesc = codedesc;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public HashMap<String,String[]> getHeaders() {
        return headers;
    }

    public void setHeaders(HashMap<String,String[]> labels) {
        this.headers= labels;
    }
}
