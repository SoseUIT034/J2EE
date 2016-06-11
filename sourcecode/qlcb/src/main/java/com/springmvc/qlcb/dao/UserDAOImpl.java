package com.springmvc.qlcb.dao;

import java.util.List;

import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.springmvc.qlcb.model.User;

@Repository
public class UserDAOImpl extends HibernateUtils implements UserDAO {

	@Override
	public void addUser(User user) {
		getSession().save(user);
	}

	@Override
	public void editUser(User user) {
		getSession().update(user);
	}

	@Override
	public void deleteUser(int userId) {
		getSession().delete(findUser(userId));
	}

	@Override
	public User findUser(int userId) {
		return (User) getSession().get(User.class, userId);
	}

	@Override
	public User findUserByName(String username) {
		return (User) getSession().createCriteria(User.class).add(Restrictions.eq("username",username)).uniqueResult();
	}

	@Override
	public List<User> getAllUsers() {
		return getSession().createQuery("from User").list();
	}

}
