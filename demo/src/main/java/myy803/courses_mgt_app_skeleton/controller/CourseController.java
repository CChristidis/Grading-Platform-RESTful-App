package myy803.courses_mgt_app_skeleton.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import myy803.courses_mgt_app_skeleton.entity.Course;
import myy803.courses_mgt_app_skeleton.service.CourseService;



@Controller
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	CourseService courseService;

	
	
	public CourseController(CourseService theCourseService) {
		courseService = theCourseService;
	}
	
	
	@RequestMapping("/list")
	public String listCourses(Model theModel) {
		
		// get employees from db
		List<Course> theCourses = courseService.findAll();
		theModel.addAttribute("courses", theCourses);
		
		return "courses/list-courses";
	}
	
	
	@RequestMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		// create model attribute to bind form data
		Course theCourse= new Course();
		
		theModel.addAttribute("course", theCourse);
		
		return "courses/course-save-form";
	}
	
	@RequestMapping("/save")
	public String saveCourse(@ModelAttribute("course") Course theCourse, Model theModel) {
		
		// save the employee
		courseService.save(theCourse);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/courses/list";
	}
	
	@RequestMapping("/showFormForUpdate")
	// actual parameter "registrationId" corresponds to <a th:href="@{/registrations/showFormForUpdate(registrationId=${tempRegistration.id})}"
	// "registrationId" of template list-registrations.html.
	public String showFormForUpdate(@RequestParam("courseId") int theId,
									Model theModel) {
		
		// get the employee from the service
		Course theCourse = courseService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("course", theCourse);
		
		// send over to our form
		return "courses/course-save-form";			
	}

	@RequestMapping("/delete")
	public String delete(@RequestParam("courseId") int theId) {
		// delete the registration
		courseService.delete(theId);
		// redirect to /registrations/list
		return "redirect:/courses/list";
	}
	
	
	
	
	

}
