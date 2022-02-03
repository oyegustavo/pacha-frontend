package ar.com.factorit.fescobar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.factorit.fescobar.dto.UserDto;
import ar.com.factorit.fescobar.service.interfaces.IRoleService;
import ar.com.factorit.fescobar.service.interfaces.IUserService;

@Controller
@RequestMapping(value = "/usuarios")
public class UsuarioController {

	@Autowired
	IUserService usuarioService;
	
	@Autowired
	IRoleService rolService;

	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public String getUsuarios(Model model) {
		model.addAttribute("usuarios", usuarioService.getUsuarios());
		return "usuarios";
	}
	
	@RequestMapping(value = "/agregar", method = RequestMethod.GET)
	public String agregar(Model model) {
		model.addAttribute("usuario", new UserDto(1, "gust", "vald", "sa@sa.co", "123", rolService.getRoles()));
		model.addAttribute("listaRoles", rolService.getRoles());
		return "usuarioFormulario";
	}

	@RequestMapping(value = "/guardar", method = RequestMethod.POST)
	public String guardar(@ModelAttribute("usuario") UserDto usuario) {
		usuarioService.save(usuario);
		return "redirect:/usuarios/all";
	}
	
	@RequestMapping(value = "/editar", method = RequestMethod.GET)
	public String editar(@RequestParam("id") int id, Model model) {
		model.addAttribute("usuario", usuarioService.getById(id));
		model.addAttribute("listaRoles", rolService.getRoles());
		return "usuarioFormulario";
	}

	@RequestMapping(value = "/eliminar", method = RequestMethod.GET)
	public String eliminar(@RequestParam("id") int id) {
		usuarioService.delete(id);
		return "redirect:/usuarios/all";
	}
}
