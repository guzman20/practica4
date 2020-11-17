package des.tienda_online.servicios;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import des.tienda_online.dao.ProductoDao;
import des.tienda_online.entidades.Producto;

@Transactional
@Service
public class ProductoServicioImpl implements ProductoServicio {
	
	@Autowired
	ProductoDao productoDao;

	@Override
	public Producto crearProducto(Producto producto) {
		return productoDao.create(producto);
	}

	@Override
	public Producto obtenerProducto(long idProducto) {
		return productoDao.find(idProducto);
	}

	@Override
	public void eliminarProducto(long idProducto) {
		productoDao.deleteById(idProducto);
		
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return productoDao.update(producto);
	}

	@Override
	public List<Producto> listarProductos(Integer maximo) {
		return productoDao.listarProductos(maximo);
	}
	
	@Override
	public List<Producto> buscarProductoPorNombre(String nombre){
		return productoDao.buscarProductoPorNombre(nombre);
	}

}
