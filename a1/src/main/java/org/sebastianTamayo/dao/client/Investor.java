package org.sebastianTamayo.dao.client;

public class Investor extends Client {
    private int yearsOfExperience;

    public Investor() {
        setYearsOfExperience(0);
    }

    public Investor(long id, String username, String password, int yearsOfExperience) {
        super(id, username, password);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
