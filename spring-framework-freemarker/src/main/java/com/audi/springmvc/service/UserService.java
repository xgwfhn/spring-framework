package com.audi.springmvc.service;

import java.util.List;

import com.audi.springmvc.model.User;

public interface UserService {
	public List<User> findUsers() throws Exception;  
        
    public User find(String id)throws Exception;  
      
    public void save(User user) throws Exception;  
      
    public void delete(String id) throws Exception;  
    public List<User> findUsersByName(String name) throws Exception; 
}
