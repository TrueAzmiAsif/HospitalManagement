package com.example.HospitalManagemet.Controllers;

import com.example.HospitalManagemet.Model.Doctor;
import com.example.HospitalManagemet.Services.DoctorServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Doctor")
public class DoctorController {
    DoctorServices obj=new DoctorServices();
    @GetMapping("/getByName")
    public Doctor getByName(@RequestParam("Name") String name){
        Doctor doc=obj.get(name);
        return doc;
    }
    @PostMapping("/add")
    public String add(@RequestBody Doctor doc){
        return obj.add(doc);
    }
}
