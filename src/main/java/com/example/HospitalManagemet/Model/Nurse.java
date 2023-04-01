package com.example.HospitalManagemet.Model;

import java.util.ArrayList;

public class Nurse {
    private int id;
    private String name;
    private String qualification;

    public Nurse(int id, String name, String qual) {
        this.id = id;
        this.name = name;
        qualification = qual;
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

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
