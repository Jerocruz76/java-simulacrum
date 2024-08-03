package entities;

public class hire {
    private int id;
    private int coder_id;
    private int vacant_id;
    private int company_id;

    public hire(int id, int coder_id, int vacant_id, int company_id) {
        this.id = id;
        this.coder_id = coder_id;
        this.vacant_id = vacant_id;
        this.company_id = company_id;
    }
    public hire(int coder_id, int vacant_id, int company_id) {
        this.coder_id = coder_id;
        this.vacant_id = vacant_id;
        this.company_id = company_id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCoder_id() {
        return coder_id;
    }

    public void setCoder_id(int coder_id) {
        this.coder_id = coder_id;
    }

    public int getVacant_id() {
        return vacant_id;
    }

    public void setVacant_id(int vacant_id) {
        this.vacant_id = vacant_id;
    }

    public int getCompany_id() {
        return company_id;
    }

    public void setCompany_id(int company_id) {
        this.company_id = company_id;
    }
}
