package com.andile.users.UserRolesApplication.repository;

import com.andile.users.UserRolesApplication.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, String> {

}
