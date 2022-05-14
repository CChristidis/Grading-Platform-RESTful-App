package myy803.courses_mgt_app_skeleton.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
public class TestStudentRegistrationDAO {
	@Autowired 
	StudentRegistrationDAO studentRegistrationDAO;
	
	@Test
	void testEmployeeDAOJpaImplIsNotNull() {
		Assertions.assertNotNull(studentRegistrationDAO);
	}
}
