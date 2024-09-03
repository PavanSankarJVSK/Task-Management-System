package com.wipro.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @NoArgsConstructor @AllArgsConstructor
public class UserDto {
	@NotNull
    private Integer id;
	 @NotEmpty(message = "Email cannot be empty")
	    @Email(message = "Email should be valid")
	private String email;
	 @NotEmpty(message = "Password cannot be empty")
	    @Size(min = 8, message = "Password must be at least 8 characters long")
	private String password;
	 @NotEmpty(message = "Role cannot be empty")
	private String role;
	
}