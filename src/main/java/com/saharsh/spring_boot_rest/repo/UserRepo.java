package com.saharsh.spring_boot_rest.repo;


import com.saharsh.spring_boot_rest.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {
     Users findByUsername(String username);
}
