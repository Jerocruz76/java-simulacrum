package entities;

public class coder {
    private int id;
    private String name;
    private String lastname;
    private String document_id;
    private int company_id;
    private float salary;

    public coder(int id, String name, String lastname, String document_id, int company_id, float salary){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.document_id = document_id;
        this.company_id = company_id;
        this.salary = salary;
    }
    public coder(String name, String lastname, String document_id, int company_id, float salary) {
        this.name = name;
        this.lastname = lastname;
        this.document_id = document_id;
        this.company_id = company_id;
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

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocument_id() {
        return document_id;
    }

    public void setDocument_id(String document_id) {
        this.document_id = document_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "coder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", document_id='" + document_id + '\'' +
                ", company_id=" + company_id +
                ", salary=" + salary +
                '}';
    }
}
