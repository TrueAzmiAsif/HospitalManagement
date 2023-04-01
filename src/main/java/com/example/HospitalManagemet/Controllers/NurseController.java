package com.example.HospitalManagemet.Controllers;

import com.example.HospitalManagemet.Model.Nurse;
import com.example.HospitalManagemet.Services.NurseServices;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Nurse")
public class NurseController {
    NurseServices obj=new NurseServices();
    @GetMapping("/getByName")
    public Nurse getByName(@RequestParam("Name") String name){
        Nurse nurse=obj.getNurse(name);
        return nurse;
    }
    @PostMapping("/add")
    public String add(@RequestBody Nurse nurse){
        return obj.add(nurse);
    }
}
