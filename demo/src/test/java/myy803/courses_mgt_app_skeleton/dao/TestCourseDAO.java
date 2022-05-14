package myy803.courses_mgt_app_skeleton.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

import myy803.courses_mgt_app_skeleton.entity.Course;

@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
public class TestCourseDAO {
	@Autowired 
	CourseDAO courseDAO;
	
	@Test
	void testEmployeeDAOJpaImplIsNotNull() {
		Assertions.assertNotNull(courseDAO);
	}

	@Test
	void testFindByIdReturnsEmployee() {
		Course storedCourse = courseDAO.findById(1);
		Assertions.assertNotNull(storedCourse);
		Assertions.assertEquals("christos", storedCourse.getInstructor_login());
		Assertions.assertEquals("Operating Systems", storedCourse.getName());
		Assertions.assertEquals("Concurrency, processes and threads, context switching, synchronization, scheduling, deadlock, memory management, linking, dynamic memory allocation, dynamic address translation, virtual memory, demand paging, storage devices.", storedCourse.getSyllabus());
		
		storedCourse = courseDAO.findById(3);
		Assertions.assertNotNull(storedCourse);
		Assertions.assertEquals("makis", storedCourse.getInstructor_login());
		Assertions.assertEquals("Calculus", storedCourse.getName());
		Assertions.assertEquals("Introduction to differential calculus of functions of one variable. Review of elementary functions (including exponentials and logarithms), limits, rates of change, the derivative and its properties, applications of the derivative.", storedCourse.getSyllabus());
		Assertions.assertNotEquals(6, storedCourse.getSemester());
		Assertions.assertEquals(5, storedCourse.getSemester());
	}

}
