package ar.com.factorit.fescobar.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.factorit.fescobar.dto.RoleDto;
import ar.com.factorit.fescobar.service.interfaces.IRoleService;

@Controller
@RequestMapping(value = "/roles")
public class RolController {

	@Autowired
	IRoleService rolService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String getRoles(Model model) {
		model.addAttribute("roles", rolService.getRoles());
		return "roles";
	}

	@RequestMapping(value = "/agregar", method = RequestMethod.GET)
	public String agregar(Model model) {
		model.addAttribute("rol", new RoleDto(1, "admin", "administrador", new Date(), true));
		return "rolFormulario";
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@ModelAttribute("rol") RoleDto rol) {
		rolService.save(rol);
		return "redirect:/roles/all";
	}

	@RequestMapping(value = "/editar", method = RequestMethod.GET)
	public String editar(@RequestParam("id") int id, Model model) {
		model.addAttribute("rol", rolService.getById(id));
		return "rolFormulario";
	}

	@RequestMapping(value = "/eliminar", method = RequestMethod.GET)
	public String eliminar(@RequestParam("id") int id) {
		rolService.delete(id);
		return "redirect:/roles/all";
	}
}
