package com.example.WarehouseAccountingSystem.service.impl;

import com.example.WarehouseAccountingSystem.dto.WarehouseAccountingSystemDTO;
import com.example.WarehouseAccountingSystem.service.WarehouseAccountingSystemService;
import org.springframework.stereotype.Service;

@Service
public class WarehouseAccountingSystemServiceImpl implements WarehouseAccountingSystemService {
    @Override
    public Long resultProductBalances(WarehouseAccountingSystemDTO dto) {
        return dto.getAllGoodsStock() - dto.getExpenditure() + dto.getComing();
    }
}
