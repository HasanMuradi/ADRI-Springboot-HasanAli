package com.adri.AdriInternship_Hasan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    //inject repository
    @Autowired
    private UserRepository repository;

    public User findByName(String user_name){
        return repository.findByUserName(user_name);
    }

    public User AddUser( User user){
        return repository.save(user);
    }
}
