package ar.com.factorit.fescobar.service.interfaces;

import java.util.List;

import ar.com.factorit.fescobar.dto.RoleDto;

public interface IRoleService {

	public List<RoleDto> getRoles();
	public RoleDto getById(int id);
	public boolean save(RoleDto role);
	public boolean update(RoleDto role);
	public void delete(int id);
	
}
