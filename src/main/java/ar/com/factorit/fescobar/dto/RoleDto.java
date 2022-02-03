package ar.com.factorit.fescobar.dto;

import java.io.Serializable;
import java.util.Date;

public class RoleDto implements Serializable{
	private static final long serialVersionUID = 6842950183922158149L;
	private Integer id;
	private String nombre;
	private String descripcion;
	private Date fechaCreacion;
	private boolean estado;
	
	
	
	public RoleDto(Integer id, String nombre, String descripcion, Date fechaCreacion, boolean estado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaCreacion = fechaCreacion;
		this.estado = estado;
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
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFechaCreacion() {
		return fechaCreacion;
	}
	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
}
