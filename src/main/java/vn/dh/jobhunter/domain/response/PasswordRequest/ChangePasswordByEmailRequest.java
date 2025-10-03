package vn.dh.jobhunter.domain.response.PasswordRequest;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ChangePasswordByEmailRequest {
    @Email(message = "Email không hợp lệ")
    @NotBlank(message = "Email không được để trống")
    private String email;

    @NotBlank(message = "Mật khẩu mới không được để trống")
    private String newPassword;

    private String oldPassword; // optional: nếu muốn bắt buộc thì thêm @NotBlank
}
