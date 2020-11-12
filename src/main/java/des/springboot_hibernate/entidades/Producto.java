package des.springboot_hibernate.entidades;


public class Producto {
	private Long id;
	private String titulo;
	private String descripcion;
	private Double precio;
	private Double descuento;
	
	public 	Producto() {
		
	}
	
	

	public Producto(Long id, String titulo, String descripcion, Double precio, Double descuento) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descuento = descuento;
	}

	public Producto(String titulo, String descripcion, Double precio, Double descuento) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descuento = descuento;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String gettitulo() {
		return titulo;
	}

	public void settitulo(String titulo) {
		this.titulo = titulo;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public Double getDescuento() {
		return descuento;
	}



	public void setDescuento(Double descuento) {
		this.descuento = descuento;
	}
	
	

}
