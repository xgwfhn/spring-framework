package com.audi.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.audi.springmvc.model.User;
import com.audi.springmvc.repository.UserDao;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public List<User> findUsers() throws Exception {
        List<User> users = (List<User>) userDao.findAll();  
        return users;
	}

	@Override
	public User find(String id) throws Exception {
		return userDao.findOne(id);
	}

    //@Transactional(propagation=Propagation.REQUIRED)  
	public void save(User user) throws Exception {
		userDao.save(user);
		
	}

	@Override
	public void delete(String id) throws Exception {
		userDao.delete(id);
	}

	@Override
	public List<User> findUsersByName(String name) throws Exception {
		return userDao.findUsersByName(name);
	}

}
