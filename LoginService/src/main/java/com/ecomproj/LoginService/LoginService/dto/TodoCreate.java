package com.ecomproj.LoginService.LoginService.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoCreate {
 
    @NotNull(message = "title is compulsory.")
    @NotEmpty(message = "title can not null")

    public String title;

    @NotEmpty(message = "Status can not null.")
    @NotNull(message = "Status is compulsory.")
    public String status;
}
