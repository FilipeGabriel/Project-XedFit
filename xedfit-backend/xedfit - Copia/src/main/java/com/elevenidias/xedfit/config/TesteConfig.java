package com.elevenidias.xedfit.config;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.elevenidias.xedfit.entities.Student;
import com.elevenidias.xedfit.repositories.StudentRepository;

@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Student s1 = new Student(null, "112.019.554-32", "Filipe Gabriel", "Sucupira", "(81)98494-6724", "filipe@gmail.com",LocalDate.parse("1997-04-18"), 1.81, 65.5f);
		Student s2 = new Student(null, "112.019.554-32", "Filipe Gabriel", "Sucupira", "(81)98494-6724", "filipe@gmail.com",LocalDate.parse("1997-04-18"), 1.81, 65.5f);
		Student s3 = new Student(null, "112.019.554-32", "Filipe Gabriel", "Sucupira", "(81)98494-6724", "filipe@gmail.com",LocalDate.parse("1997-04-18"), 1.81, 65.5f);
		Student s4 = new Student(null, "112.019.554-32", "Filipe Gabriel", "Sucupira", "(81)98494-6724", "filipe@gmail.com",LocalDate.parse("1997-04-18"), 1.81, 65.5f);
		Student s5 = new Student(null, "112.019.554-32", "Filipe Gabriel", "Sucupira", "(81)98494-6724", "filipe@gmail.com",LocalDate.parse("1997-04-18"), 1.81, 65.5f);
		
		studentRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5));
		
	}

}