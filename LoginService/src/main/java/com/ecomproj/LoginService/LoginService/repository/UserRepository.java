package com.ecomproj.LoginService.LoginService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecomproj.LoginService.LoginService.entity.UserEntity;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserEntity,Long> {
}
