package com.example.HospitalManagemet.Repositories;

import com.example.HospitalManagemet.Model.Doctor;
import com.example.HospitalManagemet.Model.Nurse;

import java.util.HashMap;

public class DoctorRepo {
    HashMap<Integer, Doctor> hm=new HashMap<>();
    public Doctor getByName(String name){
        //Nurse nurse=new Nurse();
        for(int x: hm.keySet()){
            if(hm.get(x).getName().equalsIgnoreCase(name))
                return hm.get(x);
        }
        return null;
    }
    public String add(Doctor doc){
        hm.put(doc.getId(),doc);
        return "Added Successfully";
    }
}
