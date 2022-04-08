package org.stepclass;

import java.io.File;
import java.util.ArrayList;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReportClass {

	public static void generateJvmReport(String json) {
		File f = new File("C:\\Users\\LOGU\\eclipse-workspace\\Test\\src\\test\\resources\\AllReports\\jvmReport");

		Configuration d = new Configuration(f, "Facebook Application");

		d.addClassifications("platfrom", "window");
		d.addClassifications("sprint", "java");

		java.util.List<String> l = new ArrayList<String>();
		l.add(json);

		ReportBuilder r = new ReportBuilder(l, d);
		r.generateReports();

	}

	

}
