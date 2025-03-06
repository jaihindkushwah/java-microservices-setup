package com.ecomproj.LoginService.LoginService.services;


import com.ecomproj.LoginService.LoginService.dto.TodoCreate;
import com.ecomproj.LoginService.LoginService.entity.UserEntity;
import com.ecomproj.LoginService.LoginService.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;
    public List<UserEntity> getUserData(){
        List<UserEntity> userList= userRepository.findAll();
        System.out.println("list is printint");
        System.out.println(userList);
        return  userList;
    }
    public String createTodo(TodoCreate request){
        try {
            UserEntity userRequest=new UserEntity();
            userRequest.setDate(new Date());
            userRequest.setStatus(request.getStatus());
            userRequest.setTitle(request.getTitle());
            userRepository.save(userRequest);
            return  "Created Success fully";
        }
        catch (Exception err) {
                err.printStackTrace();
        }
        return null;
    }
    public String deleteAllTodo(){
        try{
            userRepository.deleteAll();
            return "All Todo Deleted successfully";
        }
        catch (Exception err){
            err.printStackTrace();
        }
        return "Failed to delete";

    }
}
