package des.hibernate.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import des.hibernate.entidades.Producto;



@Repository
public class ProductoJdbc implements ProductoDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int save(Producto producto) {
		return jdbcTemplate.update("insert into productos (titulo, descripcion, precio, descuento) values(?,?,?,?)", producto.getTitulo(), producto.getDescripcion(), producto.getPrecio(), producto.getDescuento());
	}

	@Override
	public int update(Producto producto) {
		return jdbcTemplate.update("update productos set precio = ? where id = ?", producto.getPrecio(), producto.getId());
	}

	@Override
	public int deleteById(Long id) {
		return jdbcTemplate.update("delete from productos where id = ?", id);
	}

	@Override
	public List<Producto> findAll(int numero) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
