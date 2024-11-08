package com.hexaware.busfastx.service;

import java.util.List;

import com.hexaware.busfastx.entity.Admin;

public interface IAdminService {
	
	int createAdmin(Admin admin);
	int updateAdmin(Admin admin);
	int deleteAdmin(Admin admin);
	List<Admin> getAllList();

}
