package des.tienda_online.servicios;

import des.tienda_online.entidades.Producto;

public interface ProductoServicio {

	public Producto crearProducto(Producto producto);

	public Producto obtenerProducto(long idProducto);
	
	public Producto actualizarProducto(Producto producto);
	
	public void eliminarProducto(long idProducto);
}
