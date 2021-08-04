package demo.shopapi.vo.request;

import javax.validation.constraints.NotBlank;

import lombok.Data;

/**
 * Created By Zhu Lin on 1/1/2019.
 */
@Data
public class LoginForm {
    @NotBlank
    private String username;
    @NotBlank
    private String password;
}
