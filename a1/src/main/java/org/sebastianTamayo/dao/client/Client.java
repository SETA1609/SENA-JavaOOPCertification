package org.sebastianTamayo.dao.client;

public class Client {
    private long id;
    private String username;
    private String password;

    public Client() {
        setId(0);
        setUsername("");
        setPassword("");
    }

    public Client(long id, String username,String password) {
        setId(id);
        setPassword(password);
        setUsername(username);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
