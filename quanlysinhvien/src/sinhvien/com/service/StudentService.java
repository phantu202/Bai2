package sinhvien.com.service;

import sinhvien.com.model.Student;

public interface StudentService {
	void create(Student student);

	void update(Student student);

	void readAll();

	void delete(String msv);

}
