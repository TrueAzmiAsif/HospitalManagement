package com.example.HospitalManagemet.Model;

public class Doctor {
    private int id;
    private String name;
    private String qual;
    private int exp;

    public Doctor(int id, String name, String qual, int exp) {
        this.id = id;
        this.name = name;
        this.qual = qual;
        this.exp = exp;
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

    public String getQual() {
        return qual;
    }

    public void setQual(String qual) {
        this.qual = qual;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
}
