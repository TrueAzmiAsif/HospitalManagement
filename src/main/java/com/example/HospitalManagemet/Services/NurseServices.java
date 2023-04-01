package com.example.HospitalManagemet.Services;

import com.example.HospitalManagemet.Model.Nurse;
import com.example.HospitalManagemet.Repositories.NurseRepo;
import org.springframework.stereotype.Service;

@Service
public class NurseServices {
    NurseRepo obj=new NurseRepo();
    public Nurse getNurse(String name){
        Nurse nurse=obj.getByName(name);
        return nurse;
    }
    public String add(Nurse nurse){
        return obj.add(nurse);
    }
}
