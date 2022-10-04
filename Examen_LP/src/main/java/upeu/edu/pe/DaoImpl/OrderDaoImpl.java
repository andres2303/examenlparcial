package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.Order;

@Component
public class OrderDaoImpl implements Operaciones<Order> {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Order t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Order t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Order read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Order> reAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT OrderID,ShipCountry FROM ORDERS;",
				BeanPropertyRowMapper.newInstance(Order.class));
	}
	

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
}
