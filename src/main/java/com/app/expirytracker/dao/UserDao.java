package com.app.expirytracker.dao;

import com.app.expirytracker.model.TblRole;
import com.app.expirytracker.model.TblUser;
import com.app.expirytracker.model.UserRegister;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public interface UserDao {
//    TblUser loadUserByUsername(String username) throws UsernameNotFoundException;

    int AddUserByUsername(TblUser user);
    TblUser loadUserByUsername(String username);
    List<TblRole> getUserRolesByUid(Integer id);
    int addUserByUsername(UserRegister userRegister);
    List<TblRole> getAllRole();
    int addRole(Integer uid,Integer rid);
}
