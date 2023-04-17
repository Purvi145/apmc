package com.apmc.apmc.Controller;

import com.apmc.apmc.Entity.Admin;
import com.apmc.apmc.Service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @PostMapping("/Admin/AddAdmin")
    public ResponseEntity<?>CreateAdmin(@RequestBody Admin admin)
    {
        return adminService.AddAdmin(admin);
    }

    @GetMapping("/Admin/GetData")
    public ResponseEntity<?>GetAdmin()
    {
        return adminService.GetAdmin();
    }
}
