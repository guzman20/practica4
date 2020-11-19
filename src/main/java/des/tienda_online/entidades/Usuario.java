package des.tienda_online.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Usuario")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 8411214895952782937L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_usuario")
	private Long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellidos")
	private String apellidos;
	
	@Column(name = "contrasena")
	private String contrasena;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "fecha_nacimiento")
	private String fecha_nacimiento;
	
	@Column(name = "numero_tarjeta")
	private Integer numero_tarjeta;
	
	public Usuario() {
		
	}
	
	public Usuario(Long id, String nombre, String apellidos, String contrasena, String email, String fecha_nacimiento,
			Integer numero_tarjeta, String titular, Integer codigo_seguridad, String direccion_facturacion) {
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrasena = contrasena;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.numero_tarjeta = numero_tarjeta;
		this.titular = titular;
		this.codigo_seguridad = codigo_seguridad;
		this.direccion_facturacion = direccion_facturacion;
	}

	
	
	public Usuario(String nombre, String apellidos, String contrasena, String email, String fecha_nacimiento,
			Integer numero_tarjeta, String titular, Integer codigo_seguridad, String direccion_facturacion) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.contrasena = contrasena;
		this.email = email;
		this.fecha_nacimiento = fecha_nacimiento;
		this.numero_tarjeta = numero_tarjeta;
		this.titular = titular;
		this.codigo_seguridad = codigo_seguridad;
		this.direccion_facturacion = direccion_facturacion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public Integer getNumero_tarjeta() {
		return numero_tarjeta;
	}

	public void setNumero_tarjeta(Integer numero_tarjeta) {
		this.numero_tarjeta = numero_tarjeta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Integer getCodigo_seguridad() {
		return codigo_seguridad;
	}

	public void setCodigo_seguridad(Integer codigo_seguridad) {
		this.codigo_seguridad = codigo_seguridad;
	}

	public String getDireccion_facturacion() {
		return direccion_facturacion;
	}

	public void setDireccion_facturacion(String direccion_facturacion) {
		this.direccion_facturacion = direccion_facturacion;
	}

	@Column(name = "titular")
	private String titular;

	@Column(name = "codigo_seguridad")
	private Integer codigo_seguridad;
	
	@Column(name = "direccion_facturacion")
	private String direccion_facturacion;
}
