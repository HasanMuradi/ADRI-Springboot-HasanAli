package com.adri.AdriInternship_Hasan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    
    //inject service
    @Autowired
    private UserService service;

    @GetMapping("/hello")
    public String hello(){
        return "Hello Adri";
    }

    @GetMapping("/User/{user_name}")
    public User findUserByName(@PathVariable("user_name") String user_name){
        return service.findByName(user_name);
    }

    @PostMapping("/AddUser")
    public User addUser(@RequestBody User user){
        return service.AddUser(user);
    }
}
