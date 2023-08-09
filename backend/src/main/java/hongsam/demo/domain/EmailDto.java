package hongsam.demo.domain;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;

@Getter
@Setter
public class EmailDto {

    @Email
    private String email;
}
