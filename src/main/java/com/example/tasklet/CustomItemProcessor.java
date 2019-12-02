package com.example.tasklet;

import org.springframework.batch.item.ItemProcessor;

import com.example.model.Employee;

public class CustomItemProcessor implements ItemProcessor<Employee, Employee>{

	@Override
	public Employee process(Employee item) throws Exception {
	
		return item;
	}

}
