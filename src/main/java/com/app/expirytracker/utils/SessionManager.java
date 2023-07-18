package com.app.expirytracker.utils;

import com.app.expirytracker.model.TblUser;
import org.springframework.security.core.context.SecurityContextHolder;

public class SessionManager {
    public static TblUser getCurrentUser() {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (principal instanceof TblUser) {
            return (TblUser)principal;
        } else {
            return null;
        }
    }
}
