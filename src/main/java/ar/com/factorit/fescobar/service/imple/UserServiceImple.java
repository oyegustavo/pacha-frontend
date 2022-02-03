package ar.com.factorit.fescobar.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.factorit.fescobar.dto.UserDto;
import ar.com.factorit.fescobar.service.interfaces.IRoleService;
import ar.com.factorit.fescobar.service.interfaces.IUserService;

@Service
public class UserServiceImple implements IUserService{
	
	@Autowired
	private IRoleService roleService;

	@Override
	public List<UserDto> getUsuarios() {
		List<UserDto> users = new ArrayList<UserDto>();
		UserDto user = new UserDto(1, "gus", "vald", "sarasa@gmai.co", "123", roleService.getRoles());
		users.add(user);
		return users;
	}

	@Override
	public UserDto getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(UserDto usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(UserDto usuario) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
