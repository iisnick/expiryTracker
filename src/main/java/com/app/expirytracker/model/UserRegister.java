package com.app.expirytracker.model;

import lombok.Data;

@Data
public class UserRegister {

    private Integer id;

    /**
     * Column: username
     * Type: varchar(100)
     */
    private String username;

    /**
     * Column: password
     * Type: varchar(100)
     */
    private String password;

    /**
     * Column: role_id
     * Type: int4
     */
    private Integer role;

    /**
     * Column: icon
     * Type: varchar(100)
     */
    private String icon;

    /**
     * Column: email
     * Type: varchar(100)
     */
    private String email;

    /**
     * Column: nickname
     * Type: varchar(100)
     */
    private String nickname;

    /**
     * Column: first_name
     * Type: varchar(100)
     */
    private String firstName;

    /**
     * Column: last_name
     * Type: varchar(100)
     */
    private String lastName;

    /**
     * Column: note
     * Type: varchar(200)
     */
    private String note;
}
