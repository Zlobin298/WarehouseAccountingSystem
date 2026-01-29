package com.example.WarehouseAccountingSystem.service.impl;

import com.example.WarehouseAccountingSystem.dto.WarehouseAccountingSystemDTO;
import com.example.WarehouseAccountingSystem.service.WarehouseAccountingSystemService;

public class WarehouseAccountingSystemServiceImpl implements WarehouseAccountingSystemService {
    @Override
    public Long resultProductBalances(WarehouseAccountingSystemDTO dto) {
        return Long.parseLong(dto.getAllGoodsStock()) - Long.parseLong(dto.getComing()) - Long.parseLong(dto.getExpenditure());
    }
}
