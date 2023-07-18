package com.app.expirytracker.dao.impl;

import com.app.expirytracker.dao.UserDao;
import com.app.expirytracker.mapper.TblRoleMapper;
import com.app.expirytracker.mapper.TblUserMapper;
import com.app.expirytracker.mapper.TblUserRoleMapper;
import com.app.expirytracker.model.*;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @Resource
    TblUserMapper userMapper;

    @Resource
    TblRoleMapper roleMapper;

    @Resource
    TblUserRoleMapper userRoleMapper;

    public int AddUserByUsername(TblUser user) {
        return userMapper.insert(user);
    }

    @Override
    public TblUser loadUserByUsername(String username) {
        TblUser user = userMapper.loadUserByUsername(username);
        user.setRoles(roleMapper.getRoleByUsername(username));
        return user;
    }

    @Override
    public List<TblRole> getUserRolesByUid(Integer id) {
        List<TblRole> roles = roleMapper.getRoleByUserId(id);
        return roles;
    }

    @Override
    public int addUserByUsername(UserRegister userRegister) {
        TblUser user = new TblUser();
        user.setUsername(userRegister.getUsername());
        user.setPassword(userRegister.getPassword());
        user.setAttempt(0);
        user.setCreateTime(new Date());
        user.setStatus(0);
        return userMapper.insert(user);
    }

    @Override
    public List<TblRole> getAllRole() {
        return roleMapper.selectAllRole();
    }

    @Override
    public int addRole(Integer uid, Integer rid) {
        TblUserRole tblUserRole = new TblUserRole();
        tblUserRole.setUserId(uid);
        tblUserRole.setRoleId(rid);
        return userRoleMapper.insert(tblUserRole);

    }

//    @Bean
//    PasswordEncoder getPasswordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
}
