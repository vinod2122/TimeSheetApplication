package com.vinod.TimeSheetApp.repository;

import com.vinod.TimeSheetApp.entity.Role;
import com.vinod.TimeSheetApp.entity.User;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {

    Role findByName(String name);
}
