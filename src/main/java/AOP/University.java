package AOP;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class University {
	private List<Student> students = new ArrayList<>();

	public void addStudents() {
		Student st1 = new Student("Zaur Tregulow", 4, 7.5);
		Student st2 = new Student("Marina Khutorova", 2, 9.5);
		Student st3 = new Student("Gleb Sidorov", 1, 5.7);
		students.add(st1);
		students.add(st2);
		students.add(st3);
	}

	public List<Student> getStudents() {
		System.out.println("BEGIN GETSTUDENTS");
		System.out.println("-----------------------------------");
		System.out.println(students.get(3));
		System.out.println("Information from methods students :");
		System.out.println(students);
		System.out.println("-----------------------------------");

		return students;

	}
}
