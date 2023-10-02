package com.dridi.videocall.user;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@Builder
@Getter
public class User {
    private String username;
    private String email;
    private String password;
    private String status;
}
