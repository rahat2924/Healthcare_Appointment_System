package com.rahat.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rahat.main.modal.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
