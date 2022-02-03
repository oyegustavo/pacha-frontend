package ar.com.factorit.fescobar.service.interfaces;

import java.util.List;

import ar.com.factorit.fescobar.dto.UserDto;

public interface IUserService {

	public List<UserDto> getUsuarios();
	public UserDto getById(int id);
	public boolean save(UserDto usuario);
	public boolean update(UserDto usuario);
	public void delete(int id);
}
