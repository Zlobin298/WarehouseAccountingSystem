package com.example.WarehouseAccountingSystem;

import com.example.WarehouseAccountingSystem.dto.WarehouseAccountingSystemDTO;
import com.example.WarehouseAccountingSystem.service.WarehouseAccountingSystemService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class WarehouseAccountingSystemApplicationTests {
    @Mock
    WarehouseAccountingSystemService service;

    static Stream<Arguments> objectDto() {
        WarehouseAccountingSystemDTO dto1 = new WarehouseAccountingSystemDTO();
        dto1.setAllGoodsStock(200L);
        dto1.setComing(50L);
        dto1.setExpenditure(100L);

        WarehouseAccountingSystemDTO dto2 = new WarehouseAccountingSystemDTO();
        dto2.setAllGoodsStock(500L);
        dto2.setComing(100L);
        dto2.setExpenditure(100L);

        WarehouseAccountingSystemDTO dto3 = new WarehouseAccountingSystemDTO();
        dto3.setAllGoodsStock(10L);
        dto3.setComing(0L);
        dto3.setExpenditure(5L);

        WarehouseAccountingSystemDTO dto4 = new WarehouseAccountingSystemDTO();
        dto4.setAllGoodsStock(100L);
        dto4.setComing(0L);
        dto4.setExpenditure(200L);


        return Stream.of(
                Arguments.of(dto1, 150L),
                Arguments.of(dto2, 500L),
                Arguments.of(dto3, 5L),
                Arguments.of(dto4, -100L)
        );
    }

    @ParameterizedTest
    @MethodSource("objectDto")
    void resultProductBalances(WarehouseAccountingSystemDTO dto, Long expectedResult) {
        when(service.resultProductBalances(dto)).thenReturn(expectedResult);
        assertEquals(expectedResult, service.resultProductBalances(dto));
    }

    @Test
    void resultProductBalancesNotNull() {
        WarehouseAccountingSystemDTO dto = new WarehouseAccountingSystemDTO();
        dto.setAllGoodsStock(400L);
        dto.setComing(100L);
        dto.setExpenditure(200L);

        when(service.resultProductBalances(dto)).thenReturn(300L);

        assertNotNull(service.resultProductBalances(dto));
    }
}
