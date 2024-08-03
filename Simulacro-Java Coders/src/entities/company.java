package entities;

public class company {
    private int id;
    private String name;
    private String location;
    private int id_vacancies;

    public company(int id, String name, String location, int id_vacancies) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.id_vacancies = id_vacancies;
    }
    public company(String name, String location, int id_vacancies) {
        this.name = name;
        this.location = location;
        this.id_vacancies = id_vacancies;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getId_vacancies() {
        return id_vacancies;
    }

    public void setId_vacancies(int id_vacancies) {
        this.id_vacancies = id_vacancies;
    }
}
