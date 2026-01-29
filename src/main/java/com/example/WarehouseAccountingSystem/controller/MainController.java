package com.example.WarehouseAccountingSystem.controller;

import com.example.WarehouseAccountingSystem.dto.WarehouseAccountingSystemDTO;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class MainController {

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @PostMapping("/result")
    public String result(@Valid WarehouseAccountingSystemDTO dto) {
        return "redirect:/home";
    }
}
