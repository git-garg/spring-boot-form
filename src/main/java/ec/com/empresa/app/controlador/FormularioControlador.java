package ec.com.empresa.app.controlador;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import ec.com.empresa.app.modelo.dominio.Usuario;

@Controller
@SessionAttributes("usuario")
public class FormularioControlador {

	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("titulo", "Formulario usuario");
		// model.addAttribute("usuarioModelAttribute", new Usuario());
		Usuario usuario = new Usuario();
		usuario.setIdentificador("123.369.987-GA");
		usuario.setNombre("Juan");
		usuario.setApellido("Pérez");
		model.addAttribute("usuario", usuario);
		return "form";
	}

	@PostMapping("/form")
	public String procesar(@Valid /* @ModelAttribute("usuarioModelAttribute") */ Usuario usuario,
			BindingResult resultado, Model model, SessionStatus estado
	// @RequestParam String username, @RequestParam String password,
	// @RequestParam String email
	) {
		model.addAttribute("titulo", "Resultado formulario");

		if (resultado.hasErrors()) {

//			Map<String, String> errores = new HashMap<>();
//			resultado.getFieldErrors().forEach(err -> {
//				errores.put(err.getField(),
//						"El campo ".concat(err.getField().concat(" ").concat(err.getDefaultMessage())));
//			});
//			model.addAttribute("error", errores);
			
			return "form";
		}

//		model.addAttribute("username", username);
//		model.addAttribute("password", password);
//		model.addAttribute("email", email);

//		Usuario usuario = new Usuario();
//		usuario.setEmail(email);
//		usuario.setPassword(password);
//		usuario.setUsername(username);

		model.addAttribute("usuario", usuario);
		estado.setComplete();
		

		return "resultado";
	}

}
