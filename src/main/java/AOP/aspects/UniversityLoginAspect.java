package AOP.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import AOP.Student;

import java.util.ArrayList;
import java.util.List;

@Component
@Aspect
public class UniversityLoginAspect {

//	@Before("execution(* getStudents())")
//	public void beforeGetStudentsLogginAdvice() {
//		System.out.println("beforeGetStudentsLogginAdvice :" + "BEFORE_LOGGIROVANIE");
//	}
//
//	@AfterReturning(pointcut = "execution(* getStudents())"
//	, returning = "students")
//	public void afterGetStudentsLogginAdvice(List<Student> students) {
//		Student firstStudent = students.get(0);
//		String nameSurname = firstStudent.getNameSuname();
//		nameSurname = "Mr" + nameSurname;
//		firstStudent.setNameSuname(nameSurname);
//
//		double avgGrade = firstStudent.getAvgGrade();
//		avgGrade = avgGrade + 1;
//		firstStudent.setAvgGrade(avgGrade);
//
//		System.out.println("afterGetStudentsLogginAdvice :" + "AFTER_LOGGIROVANIE");
//	}

	@AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
	public void afterThrowingGetStudentsLogginAdvice(Throwable exception) {
		System.out.println("afterThrowingGetStudentsLogginAdvice :" + "EXCEPTION");
		System.out.println("-----------------------------------------------------");

	}
}
