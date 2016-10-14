package com.audi.springmvc.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.audi.springmvc.model.User;
//PagingAndSortingRepository用法参考  http://www.ibm.com/developerworks/cn/opensource/os-cn-spring-jpa/
public interface UserDao extends PagingAndSortingRepository<User, String>{

	@Query("select u from User u where u.last_name like ?")  
    public List<User> findUsersByName(String name) throws Exception; 
	
	/**支持sql查询
	 * @param name
	 * @return
	 * @throws Exception
	 */
	@Query(value = "select * from t_user u where u.last_name like ?",nativeQuery = true)  
    public List<User> findUsersByNameBysql(String name) throws Exception; 
	
	/**支持存储过程
	 * @param name
	 * @return
	 * @throws Exception
	 */
	@Procedure("user_pro") 
    public int findUsersByNameByPro(String last_name) throws Exception; 
}
