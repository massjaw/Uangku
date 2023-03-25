package com.cashmanager.uangku.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CategoryDto {
    @NotEmpty(message = "Category name shouldn't empty")
    private String name;
}
