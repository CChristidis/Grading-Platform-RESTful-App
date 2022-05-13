package myy803.courses_mgt_app_skeleton.service.statistics;

import org.apache.commons.math3.stat.descriptive.DescriptiveStatistics;

import myy803.courses_mgt_app_skeleton.entity.Course;
import myy803.courses_mgt_app_skeleton.entity.StudentRegistration;

public abstract class TemplateStatisticStrategy implements StatisticStrategy {
	
	public abstract double calculateStatistic(Course theCourse);
	
	public void prepareDataSet(Course theCourse) {
		
		DescriptiveStatistics descriptiveStatistics = new DescriptiveStatistics();
		
		for (StudentRegistration studentReg : theCourse.getStudentsRegistrations()) {
			double value = studentReg.getFinalGrade();
			descriptiveStatistics.addValue(value);
			
		}
		
		System.out.println(theCourse.getName());
		System.out.println(descriptiveStatistics.getMin());

	
	}
	public abstract void doActualCalculation();
	
	
}
