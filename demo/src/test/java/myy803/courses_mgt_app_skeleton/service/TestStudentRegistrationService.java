package myy803.courses_mgt_app_skeleton.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;

@SpringBootTest
@TestPropertySource(
  locations = "classpath:application.properties")
public class TestStudentRegistrationService {
	@Autowired 
	StudentRegistrationService studentRegistrationService;
	
	@Test
	void testStudentRegistrationServiceJpaImplIsNotNull() {
		Assertions.assertNotNull(studentRegistrationService);
	}
}
