package com.mousephone.model.dto.user;

import com.mousephone.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserLoginDTO {
    private Long id;

    @NotBlank(message = "Vui lòng nhập email.")
    @Email(message = "Email không đúng định dạng.")
    private String username;

    @NotBlank(message = "Vui lòng nhập mật khẩu.")
    private String password;

    public UserLoginDTO(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public User toUser() {
        return new User()
                .setId(id)
                .setUsername(username)
                .setPassword(password);
    }
}
