package des.hibernate.entidades;

public class Producto {
	private Long id;
	private String titulo;
	private String descripcion;
	private Integer precio;
	private Integer descuento;
	
	public 	Producto() {
		
	}
	
	

	public Producto(Long id, String titulo, String descripcion, Integer precio, Integer descuento) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.precio = precio;
		this.descuento = descuento;
	}

	public Producto(String titulo, String descripcion, Integer precio, Integer descuento) {
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

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
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



	public Integer getDescuento() {
		return descuento;
	}



	public void setDescuento(Integer descuento) {
		this.descuento = descuento;
	}
	
	

}
