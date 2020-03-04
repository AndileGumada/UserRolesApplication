package com.andile.users.UserRolesApplication.repository;

import com.andile.users.UserRolesApplication.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
