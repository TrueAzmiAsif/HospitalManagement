package com.example.HospitalManagemet.Services;

import com.example.HospitalManagemet.Model.Patient;
import com.example.HospitalManagemet.Repositories.PatientRepo;
import org.springframework.stereotype.Service;

@Service
public class PatientServices {
    PatientRepo obj=new PatientRepo();
    public String add(int id,String name, String disease){
        return obj.add(id,name,disease);
    }
    public Patient get(String name){
        return obj.getByName(name);
    }
}
