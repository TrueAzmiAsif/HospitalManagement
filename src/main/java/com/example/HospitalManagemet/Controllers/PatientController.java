package com.example.HospitalManagemet.Controllers;

import com.example.HospitalManagemet.Model.Patient;
import com.example.HospitalManagemet.Services.PatientServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Patient")
public class PatientController {
    PatientServices obj=new PatientServices();
    @PostMapping("/add")
    public String addP(@RequestParam("id")Integer id, @RequestParam("Name")String name, @RequestParam("Disease")String disease){
        return obj.add(id,name,disease);
    }
    @GetMapping("/getByName")
    public Patient getByName(@RequestParam("Name") String name){
        return obj.get(name);
    }
}
