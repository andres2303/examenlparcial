package upeu.edu.pe.DaoImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import upeu.edu.pe.Dao.Operaciones;
import upeu.edu.pe.Entity.Suppliers;


@Component
public class SuppliersDaoImpl implements Operaciones<Suppliers>{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int create(Suppliers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Suppliers t) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Suppliers read(int id) {
		// TODO Auto-generated method stub
		try {
			Suppliers Sup = jdbcTemplate.queryForObject("SELECT * FROM suppliers WHERE SupplierID=?",
		    BeanPropertyRowMapper.newInstance(Suppliers.class), id);
			return Sup;
			}catch(IncorrectResultSizeDataAccessException e){
				return null;
			}
	}

	@Override
	public List<Suppliers> reAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("SELECT * FROM SUPPLIERS;",
				BeanPropertyRowMapper.newInstance(Suppliers.class));
	}

	@Override
	public List<Map<String, Object>> readAll2() {
		// TODO Auto-generated method stub
		return null;
	}

}
