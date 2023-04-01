package com.example.HospitalManagemet.Repositories;

import com.example.HospitalManagemet.Model.Patient;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
@Repository
public class PatientRepo {
    HashMap<Integer, Patient> hm=new HashMap<>();
    public String add(int id, String name, String disease){
        Patient newp=new Patient(id,name,disease);
        hm.put(newp.getId(),newp);
        return "Patient added successfully";
    }
    public Patient getByName(String name){
        //Nurse nurse=new Nurse();
        for(int x: hm.keySet()){
            if(hm.get(x).getName().equalsIgnoreCase(name))
                return hm.get(x);
        }
        return null;
    }
}
