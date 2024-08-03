package entities;

public class vacant {
    private int id;
    private String technological_profile;
    private int quantity;

    public vacant(int id, String technological_profile, int quantity) {
        this.id = id;
        this.technological_profile = technological_profile;
        this.quantity = quantity;
    }
    public vacant(String technological_profile, int quantity) {
        this.technological_profile = technological_profile;
        this.quantity = quantity;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getTechnological_profile() {
        return technological_profile;
    }

    public void setTechnological_profile(String technological_profile) {
        this.technological_profile = technological_profile;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
