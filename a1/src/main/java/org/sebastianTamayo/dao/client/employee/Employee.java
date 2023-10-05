package org.sebastianTamayo.dao.client.employee;

import org.sebastianTamayo.dao.client.Client;

public class Employee extends Client {
private int startingYear;
private Position position;

    public Employee() {
        super();
        setPosition(null);
        setStartingYear(0);
    }

    public Employee(long id, String username, String password, int startingYear, Position position ) {
        super(id, username, password);
        this.startingYear = startingYear;
        this.position = position;

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


}
