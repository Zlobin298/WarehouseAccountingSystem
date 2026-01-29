package com.example.WarehouseAccountingSystem.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class WarehouseAccountingSystemDTO {
    @NotBlank(message = "поле весь товар на складе не должно быть пустым")
    @Size(min = 0, message = "Поле должно быть меньше или равно нулю")
    private String allGoodsStock;

    @NotBlank(message = "Поле приход не должно быть пустым")
    @Size(min = 0, message = "Поле должно быть меньше или равно нулю")
    private String coming;

    @NotBlank(message = "Поле расход не должно быть пустым")
    @Size(min = 0, message = "Поле должно быть меньше или равно нулю")
    private String expenditure;
}
