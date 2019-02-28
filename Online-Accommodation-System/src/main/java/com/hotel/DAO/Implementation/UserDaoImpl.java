package com.hotel.DAO.Implementation;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hotel.DAO.UserDao;
import com.hotel.model.User;

@Repository
public class UserDaoImpl implements UserDao {

	@Autowired
	private SessionFactory session;

	public void add(User user) {
		session.getCurrentSession().save(user);
	}

	public void remove(String id) {
		session.getCurrentSession().remove(id);

	}

	public User viewUser(String id) {
		return (User) session.getCurrentSession().get(User.class, id);
	}

	public List<User> viewAll() {

		return (List<User>) session.getCurrentSession().createQuery("from User").list();
	}

	public void update(String id) {
		session.getCurrentSession().update(id);
	}

}
