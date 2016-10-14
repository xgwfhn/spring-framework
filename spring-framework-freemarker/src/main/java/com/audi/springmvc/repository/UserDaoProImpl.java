package com.audi.springmvc.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.audi.springmvc.model.User;

@Repository
public class UserDaoProImpl  implements UserDaoPro{

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public List<User> findUsersByNameByPro(String last_name) throws Exception {
		Query query = em.createNativeQuery("{call getUserListByLastName(?)}", User.class); 
		query.setParameter(1, last_name);
		List<User> result = query.getResultList();
		return result;
	}

	@Override
	public List<User> findUsersByNameByLike(String last_name) throws Exception {
		Query query = em.createNativeQuery("{call findUsersByNameByLike(?)}", User.class); 
		query.setParameter(1, last_name);
		List<User> result = query.getResultList();
		return result;
	}

}
