package com.microservicesspring.demoUser.user;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserId(Long userId);

}
