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
            throw new UsernameNotFoundException("账户不存在！！！");
        }
        user.setRoles(userDao.getUserRolesByUid(user.getId()));
        return user;
    }
    public String addUserByUsername(UserRegister userRegister){
        TblUser newuser = userDao.loadUserByUsername(userRegister.getUsername());
        if (newuser != null){
            return "账户存在，注册失败！";
        }else {
            //新用户密码采用BCryptPasswordEncoder(10)格式存入数据库
            userRegister.setPassword(new BCryptPasswordEncoder(10).encode(userRegister.getPassword()));
            //设置用户状态可用，没有锁定
            //执行用户注册
            int adduser = userDao.addUserByUsername(userRegister);
            //用户成功注册后，添加用户角色
            if(adduser > 0){
                TblUser getUser =userDao.loadUserByUsername(userRegister.getUsername());
                int addRole = userDao.addRole(getUser.getId(),userRegister.getRole());
                if (addRole > 0){
                    return "账户注册成功，角色注册成功！";
                }else{
                    return "账户注册成功！角色注册失败！";
                }
            }else {
                return "账户注册失败！";
            }
        }
    }
    public List<TblRole> getAllRole(){
        return userDao.getAllRole();
    }

}
