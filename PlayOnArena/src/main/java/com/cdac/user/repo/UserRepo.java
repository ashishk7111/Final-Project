package com.cdac.user.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cdac.user.dto.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer> {

	


}
