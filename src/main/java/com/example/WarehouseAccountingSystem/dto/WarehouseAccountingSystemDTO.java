package com.example.WarehouseAccountingSystem.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class WarehouseAccountingSystemDTO {
    @NotNull(message = "Поле весь товар на складе не должно быть пустым")
    @Min(value = 0, message = "Поле должно быть меньше или равно нулю")
    private Long allGoodsStock;

    @NotNull(message = "Поле приход не должно быть пустым")
    @Min(value = 0, message = "Поле должно быть меньше или равно нулю")
    private Long coming;

    @NotNull(message = "Поле расход не должно быть пустым")
    @Min(value = 0, message = "Поле должно быть меньше или равно нулю")
    private Long expenditure;
}
