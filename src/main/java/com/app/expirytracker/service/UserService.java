package com.app.expirytracker.service;

import com.app.expirytracker.dao.UserDao;
import com.app.expirytracker.model.TblRole;
import com.app.expirytracker.model.TblUser;
import com.app.expirytracker.model.UserRegister;
import jakarta.annotation.Resource;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserDetailsService {
    @Resource
    UserDao userDao;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        TblUser user = userDao.loadUserByUsername(username);
        if(user == null){
            throw new UsernameNotFoundException("Account does not exists");
        }
        user.setRoles(userDao.getUserRolesByUid(user.getId()));
        return user;
    }
    public String addUserByUsername(UserRegister userRegister){
        TblUser newuser = userDao.loadUserByUsername(userRegister.getUsername());
        if (newuser != null){
            return "Account exists!";
        }else {
            userRegister.setPassword(new BCryptPasswordEncoder(10).encode(userRegister.getPassword()));
            int adduser = userDao.addUserByUsername(userRegister);
            if(adduser > 0){
                TblUser getUser =userDao.loadUserByUsername(userRegister.getUsername());
                int addRole = userDao.addRole(getUser.getId(),userRegister.getRole());
                if (addRole > 0){
                    return "Account registered，Role registered!";
                }else{
                    return "Account registered，Role registered failed！";
                }
            }else {
                return "Account registered failed！";
            }
        }
    }
    public List<TblRole> getAllRole(){
        return userDao.getAllRole();
    }

}
