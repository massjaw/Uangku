package com.cashmanager.uangku.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class CashFlowDto {
    @NotEmpty(message = "Must assign user id")
    private String userId;
    @NotEmpty(message = "Must assign category")
    private String categoryId;
    @NotEmpty(message = "amount shouldn't be empty")
    private String amount;
}
