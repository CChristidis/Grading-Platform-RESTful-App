package myy803.courses_mgt_app_skeleton.service.statistics;

import myy803.courses_mgt_app_skeleton.entity.Course;

public class MedianStatisticStrategy extends TemplateStatisticStrategy {
	
	public double calculateStatistic() {
		return descriptiveStatistics.getPercentile(50);
	}
	
}
