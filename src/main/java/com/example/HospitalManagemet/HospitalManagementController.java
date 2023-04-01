package com.example.HospitalManagemet;

import com.example.HospitalManagemet.Model.Patient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/Hospital")
public class HospitalManagementController {
    HashMap<Integer, Patient> hm=new HashMap<>();
    @PostMapping("/addPatient")
    public String addP(@RequestParam("id")Integer id, @RequestParam("Name")String name, @RequestParam("Disease")String disease){
        Patient p=new Patient(id,name,disease);
        hm.put(id,p);
        return "Patient added successfully";
    }
    @GetMapping("/getByName")
    public Patient get(@RequestParam("id") Integer id){
        return hm.get(id);
    }
}
