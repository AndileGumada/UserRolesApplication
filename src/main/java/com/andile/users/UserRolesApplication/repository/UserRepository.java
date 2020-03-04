package com.andile.users.UserRolesApplication.repository;

import com.andile.users.UserRolesApplication.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
