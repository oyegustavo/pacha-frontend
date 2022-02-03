package ar.com.factorit.fescobar.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class UserDto implements Serializable{
	private static final long serialVersionUID = -5317313675420579957L;
	private Integer id;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private List<RoleDto> roles = new ArrayList<RoleDto>();
	
	public UserDto(Integer id, String nombre, String apellido, String email, String password, List<RoleDto> roles) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.roles = roles;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public List<RoleDto> getRoles() {
		return roles;
	}
	public void setRoles(List<RoleDto> roles) {
		this.roles = roles;
	}

}
