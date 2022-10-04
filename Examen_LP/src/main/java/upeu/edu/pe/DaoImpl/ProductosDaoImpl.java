package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.Productos;


@Component

public class ProductosDaoImpl implements Operaciones<Productos>{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Productos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Productos t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Productos read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Productos> reAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM PRODUCTS",
				BeanPropertyRowMapper.newInstance(Productos.class));
	}
	
	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

}
