package com.attence.employee.service;

import com.attence.employee.dao.RoleMapper;
import com.attence.employee.dao.exp.UserExpMapper;
import com.attence.employee.domain.Role;
import com.attence.employee.domain.RoleExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private UserExpMapper userMapper;

    @Autowired
    private RoleMapper roleMapper;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {

        List<Role> list = roleMapper.selectByExample(new RoleExample());
        com.attence.employee.domain.User user = userMapper.getUserByUserName(userName);
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }
        String password = user.getPassword();
        List<GrantedAuthority> authorities = new ArrayList<>();
        return User.builder()
                .username(user.getUsername())
                .password(passwordEncoder.encode(password))
                .authorities(authorities)
                .build();
    }
}
