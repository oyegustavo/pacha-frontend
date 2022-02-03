package ar.com.factorit.fescobar.service.imple;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import ar.com.factorit.fescobar.dto.RoleDto;
import ar.com.factorit.fescobar.service.interfaces.IRoleService;

@Service
public class RoleServiceImple implements IRoleService{

	@Override
	public List<RoleDto> getRoles() {
		List<RoleDto> roles = new ArrayList<RoleDto>();
		RoleDto role = new RoleDto(1, "admin", "administrador", new Date(), true);
		roles.add(role);
		role = new RoleDto(2, "user", "usuario", new Date(), true);
		roles.add(role);
		return roles;
	}

	@Override
	public RoleDto getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(RoleDto role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(RoleDto role) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
