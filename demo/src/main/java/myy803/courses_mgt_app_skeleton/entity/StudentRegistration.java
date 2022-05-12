package myy803.courses_mgt_app_skeleton.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.lang.NonNull;


@Entity
@Table(name="student_registration")
public class StudentRegistration {
	// define fields
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@NonNull
	@Column(name="id")
	private int id;
		
	@Column(name="name")
	
	private String name;
		
	@Column(name="year_of_registration ")
	
	private int year_of_registration;
		
	@Column(name="semester")

	private int semester;
	
	@Column(name="project_grade")
	private double project_grade;
	
	@Column(name="final_exams_grade")
	private double final_exams_grade;
	
	
	@ManyToOne
	@JoinColumn(name = "idC")
	private Course course;
	
	

	public StudentRegistration() {
	}
	
	public StudentRegistration(int id, String name, int year_of_registration, int semester, double project_grade, 
			double final_exams_grade, Course course) {
		this.id = id;
		this.name = name;
		this.year_of_registration = year_of_registration;
		this.semester = semester;
		this.project_grade = project_grade;
		this.final_exams_grade = final_exams_grade;
		this.course = course;
	}


	public StudentRegistration(String name, int year_of_registration, int semester, double project_grade, 
			double final_exams_grade, Course course) {
		this.name = name;
		this.year_of_registration = year_of_registration;
		this.semester = semester;
		this.project_grade = project_grade;
		this.final_exams_grade = final_exams_grade;
		this.course = course;
	}
	
	public StudentRegistration(int id, String name, int year_of_registration, int semester, Course course) {
		this.id = id;
		this.name = name;
		this.year_of_registration = year_of_registration;
		this.semester = semester;
		this.course = course;
	}
	
	public StudentRegistration(String name, int year_of_registration, int semester, Course course) {
		this.name = name;
		this.year_of_registration = year_of_registration;
		this.semester = semester;
		this.course = course;
	}
	

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYear_of_registration() {
		return year_of_registration;
	}

	public int getSemester() {
		return semester;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setYear_of_registration(int year_of_registration) {
		this.year_of_registration = year_of_registration;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}
	
	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public double getProject_grade() {
		return project_grade;
	}

	public double getFinal_exams_grade() {
		return final_exams_grade;
	}

	public void setProject_grade(double project_grade) {
		this.project_grade = project_grade;
	}

	public void setFinal_exams_grade(double final_exams_grade) {
		this.final_exams_grade = final_exams_grade;
	}

	@Override
	public String toString() {
		return "StudentRegistration [id=" + id + ", name=" + name + ", year_of_registration=" + year_of_registration
				+ ", semester=" + semester + ", project_grade=" + project_grade + ", final_exams_grade="
				+ final_exams_grade + ", course=" + course + "]";
	}


	
	
	
	
	
	
	

		
}
