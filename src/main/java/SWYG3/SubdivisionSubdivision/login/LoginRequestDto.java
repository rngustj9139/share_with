package SWYG3.SubdivisionSubdivision.login;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter @Setter
@NoArgsConstructor
public class LoginRequestDto {

    @NotBlank(message = "이메일은 필수 입력입니다.")
    @Email
    private String email;

    @NotBlank(message = "비밀번호는 필수 입력입니다.")
    private String password;

}
