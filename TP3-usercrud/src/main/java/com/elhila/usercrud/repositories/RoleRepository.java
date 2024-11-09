package com.elhila.usercrud.repositories;

import com.elhila.usercrud.entities.Role;
import com.elhila.usercrud.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
