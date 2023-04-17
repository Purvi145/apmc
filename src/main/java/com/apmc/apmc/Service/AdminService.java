package com.apmc.apmc.Service;

import com.apmc.apmc.Entity.Admin;
import com.apmc.apmc.Respository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    private AdminRepo adminRepo;
    public ResponseEntity<?>AddAdmin(Admin admin)
    {
        adminRepo.save(admin);
        return new ResponseEntity<>("Added Successfully", HttpStatus.CREATED);
    }

    public ResponseEntity<?>GetAdmin()
    {
        return new ResponseEntity<>(adminRepo.findAll(),HttpStatus.OK);
    }
}
