package com.vinod.TimeSheetApp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vinod.TimeSheetApp.entity.User;

public interface UserRepository extends JpaRepository<User,Long> {
    public User findByEmail(String email);

    public User findByName(String name);
}
