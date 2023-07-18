package com.app.expirytracker.model;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * Table: tbl_user
 */
@Data
public class TblUser implements UserDetails {
    /**
     * Column: id
     * Type: int4
     */
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

    /**
     * Column: create_time
     * Type: timetz
     */
    private Date createTime;

    /**
     * Column: expire_time
     * Type: timetz
     */
    private Date expireTime;

    /**
     * Column: last_login_time
     * Type: timetz
     */
    private Date lastLoginTime;

    /**
     * Column: attempt
     * Type: int4
     * Default value: 0
     */
    private Integer attempt;

    /**
     * Column: status
     * Type: char(1)
     */
    private Integer status;


    private List<TblRole> roles;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<SimpleGrantedAuthority> authorities= new ArrayList<>();
        for (TblRole r:roles){
            authorities.add(new SimpleGrantedAuthority(r.getName()));
        }
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}