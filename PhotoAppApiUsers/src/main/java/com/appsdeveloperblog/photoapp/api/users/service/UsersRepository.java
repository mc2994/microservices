package com.appsdeveloperblog.photoapp.api.users.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.appsdeveloperblog.photoapp.api.users.data.UserEntity;

@Repository
public interface UsersRepository extends JpaRepository<UserEntity, Long> {
	UserEntity findByEmail(String email);

	UserEntity findByUserId(String userId);
}
