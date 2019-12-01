package com.example.tasklet;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.model.Employee;

public class DbrowSetMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee e = new Employee();
		e.setEmployee_id(rs.getInt("employee_id"));
		e.setEmployee_name(rs.getString("employee_name"));
		e.setEmployee_relatives(rs.getString("employee_relatives"));
		e.setTransaction_id(rs.getInt("transaction_id"));
		return e;
	}



}
