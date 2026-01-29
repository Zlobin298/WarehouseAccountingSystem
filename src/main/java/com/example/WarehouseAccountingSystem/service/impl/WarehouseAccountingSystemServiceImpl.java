package com.example.WarehouseAccountingSystem.service.impl;

import com.example.WarehouseAccountingSystem.dto.WarehouseAccountingSystemDTO;
import com.example.WarehouseAccountingSystem.service.WarehouseAccountingSystemService;
import org.springframework.stereotype.Service;

@Service
public class WarehouseAccountingSystemServiceImpl implements WarehouseAccountingSystemService {
    @Override
    public Long resultProductBalances(WarehouseAccountingSystemDTO dto) {
        return Long.parseLong(dto.getAllGoodsStock()) - Long.parseLong(dto.getExpenditure()) + Long.parseLong(dto.getComing());
    }
}
