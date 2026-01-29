package com.example.WarehouseAccountingSystem.controller;

import com.example.WarehouseAccountingSystem.dto.WarehouseAccountingSystemDTO;
import com.example.WarehouseAccountingSystem.service.WarehouseAccountingSystemService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
@RequiredArgsConstructor
public class WarehouseAccountingSystemController {
    private final WarehouseAccountingSystemService SERVICE;

    private Long result;

    @GetMapping("/home")
    public String home(Model model) {
        try {
            model.addAttribute("result", result);
            model.addAttribute("isLessZero", result < 0);
        } catch (Exception e) {
            System.err.println("ERROR: " + e.getMessage());
        }

        return "index";
    }

    @PostMapping("/result")
    public String result(@Valid WarehouseAccountingSystemDTO dto) {
        result = SERVICE.resultProductBalances(dto);

        return "redirect:/home";
    }
}
