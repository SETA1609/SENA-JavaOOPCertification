package org.sebastianTamayo.dao.client.employee;

import org.sebastianTamayo.dao.client.Client;

public class Employee extends Client {
private int startingYear;
private Position position;
private int vacationDays;

    public Employee() {
        super();
        setPosition(null);
        setStartingYear(0);
        setVacationDays(0);
    }

    public Employee(long id, String username, String password, int startingYear, Position position, int vacationDays) {
        super(id, username, password);
        this.startingYear = startingYear;
        this.position = position;
        this.vacationDays = vacationDays;
    }

    public int getStartingYear() {
        return startingYear;
    }

    public void setStartingYear(int startingYear) {
        this.startingYear = startingYear;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public int getVacationDays() {
        return vacationDays;
    }

    public void setVacationDays(int vacationDays) {
        this.vacationDays = vacationDays;
    }
}
