package ec.com.empresa.app.modelo.dominio;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Usuario {

	private String identificador;

	//@NotEmpty(message = "campo requerido")
	@NotEmpty //Este mensaje es el de messages.properties
	private String nombre;

	@NotEmpty
	private String apellido;

	@NotEmpty
	@Size(min = 3, max = 8)
	private String username;

	@NotEmpty
	private String password;

	//@NotEmpty(message = "campo requerido")
	@NotEmpty
	//@Email(message = "correo incorrecto")
	@Email
	private String email;

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
