package com.example.HospitalManagemet.Services;

import com.example.HospitalManagemet.Model.Doctor;
import com.example.HospitalManagemet.Model.Nurse;
import com.example.HospitalManagemet.Repositories.DoctorRepo;
import com.example.HospitalManagemet.Repositories.NurseRepo;

public class DoctorServices {
    DoctorRepo obj=new DoctorRepo();
    public Doctor get(String name){
        Doctor doc=obj.getByName(name);
        return doc;
    }
    public String add(Doctor doc){
        return obj.add(doc);
    }
}
