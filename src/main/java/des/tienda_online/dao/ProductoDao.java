package des.tienda_online.dao;

import java.util.List;

import des.tienda_online.entidades.Producto;


public interface ProductoDao extends DaoGenerico<Producto> {
	
	public List<Producto> listarProductos();

}
