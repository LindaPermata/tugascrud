package com.example.tugascrud.controller;

import com.example.tugascrud.model.dto.KtpAddRequest;
import com.example.tugascrud.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ktp")
public class KtpController {

    @Autowired
    private KtpService ktpService;

    @PostMapping
    public Object add(@RequestBody KtpAddRequest request){
        return ktpService.add(request);
    }

    @GetMapping
    public Object getAll(){
        return ktpService.getAll();
    }

    @GetMapping("/{id}")
    public Object getById(@PathVariable Integer id){
        return ktpService.getById(id);
    }

    @PutMapping("/{id}")
    public Object update(@PathVariable Integer id,
                         @RequestBody KtpAddRequest request){
        return ktpService.update(id, request);
    }

    @DeleteMapping("/{id}")
    public Object delete(@PathVariable Integer id){
        ktpService.delete(id);
        return "Data berhasil dihapus";
    }
}