package com.audi.springmvc.repository;

import java.util.List;

import com.audi.springmvc.model.User;

public interface UserDaoPro {
    public List<User> findUsersByNameByPro(String last_name) throws Exception; 
    
    /**模糊查询
     * @param last_name
     * @return
     * @throws Exception
     */
    public List<User> findUsersByNameByLike(String last_name) throws Exception; 
    
}
