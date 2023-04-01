package com.example.HospitalManagemet.Repositories;

import com.example.HospitalManagemet.Model.Nurse;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class NurseRepo {
    HashMap<Integer, Nurse> hm=new HashMap<>();
    public Nurse getByName(String name){
        //Nurse nurse=new Nurse();
        for(int x: hm.keySet()){
            if(hm.get(x).getName().equalsIgnoreCase(name))
                return hm.get(x);
        }
        return null;
    }
    public String add(Nurse nurse){
        hm.put(nurse.getId(),nurse);
        return "Added Successfully";
    }
}
