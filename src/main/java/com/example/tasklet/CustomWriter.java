package com.example.tasklet;

import java.io.Closeable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.PreDestroy;

import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.file.FlatFileItemWriter;

import com.example.model.Employee;

public class CustomWriter implements ItemWriter<Employee>, Closeable{
private final PrintWriter writer;
OutputStream out;
public CustomWriter() {
	
	try {
		out = new FileOutputStream("outputs\\1.txt");		
	}catch(Exception e) {
		e.printStackTrace();
	}
	this.writer=new PrintWriter(out);
}

	@Override
	public void write(List<? extends Employee> items) throws Exception {
		for(Employee item:items) {
			writer.println(item.toString());
		}
		
	}
	@PreDestroy
	@Override
	public void close() throws IOException{
		writer.close();
	}

}
