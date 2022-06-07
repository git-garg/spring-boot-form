package ec.com.empresa.app.controlador;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ec.com.empresa.app.modelo.dominio.Usuario;

@Controller
public class FormularioControlador {

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Formulario usuario");
		return "form";
	}

	@PostMapping("/form")
	public String procesar(Usuario usuario, Model model/*, @RequestParam String username, @RequestParam String password,
			@RequestParam String email*/) {

		model.addAttribute("titulo", "Resultado formulario");
//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		model.addAttribute("email", email);
		
		
//		Usuario usuario = new Usuario();
//		usuario.setEmail(email);
//		usuario.setPassword(password);
//		usuario.setUsername(username);
		
		
		
		model.addAttribute("usuario", usuario);

		return "resultado";
	}

}
