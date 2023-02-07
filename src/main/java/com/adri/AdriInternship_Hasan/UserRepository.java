package com.adri.AdriInternship_Hasan;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

    User findByUserName(String user_name);
    
}
