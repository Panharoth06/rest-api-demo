package co.istad.restapi;

import lombok.*;

@Getter
@AllArgsConstructor
public class User {
    private Integer id;
    private String username;
    private String email;
    private String password;
    private String imgUrl;
}
