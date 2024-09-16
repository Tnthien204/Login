package dao;

import java.util.List;

import models.UserModel;

public interface IUserDao {

	List<UserModel> findAll();
	
	UserModel findById(int id);
	void updatePassword(String password, String email);
	
	void insert(UserModel user);
	
	UserModel findByUserName(String username);
	
	boolean checkExistEmail(String email);
	boolean checkExistUsername(String username);
	boolean checkExistPhone(String phone);
}