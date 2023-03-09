package com.example.user.model;

public class Province {
    private int idP;
    private String nameP;

    public Province() {
    }

    public Province(int idP, String nameP) {
        this.idP = idP;
        this.nameP = nameP;
    }

    public int getIdP() {
        return idP;
    }

    public void setNameP(String nameP) {
        this.nameP = nameP;
    }

    public void setId(int id) {
        this.idP = id;
    }

    public String getNameP() {
        return nameP;
    }

    public void setName(String nameP) {
        this.nameP = nameP;
    }
}
