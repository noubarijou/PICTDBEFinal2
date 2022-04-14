package com.alucar.service;

import com.alucar.domain.AppUser;
import com.alucar.domain.Role;

import java.util.List;

public interface AppUserService {
    AppUser saveUser(AppUser user);
    Role saveRole(Role role);
    void addRoleToUser(String username, String roleName);
    AppUser getUser(String username);
    List<AppUser>getUsers();
}
