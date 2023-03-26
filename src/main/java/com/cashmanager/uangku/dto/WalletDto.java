package com.cashmanager.uangku.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class WalletDto {
    @NotEmpty(message = "user id needed")
    private long userId;

    private double balance;
}
