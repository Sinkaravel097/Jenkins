package org.jvmreport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
	
	public static void generateJvmReport(String json) {
		
		// 1. Mention the target folder for store the jvm report
		File f = new File("D:\\NewMaven\\Cucumber11.30am\\JvmReports");
		
		// 2. To add the details to the report
		Configuration c = new Configuration(f, "Facebook & Amazon");
		c.addClassifications("Platform Name", "Windows");
		c.addClassifications("Platform Version", "10");
		c.addClassifications("Browser Name ", "Chrome");
		c.addClassifications("Browser Version", "89.0");
		c.addClassifications("Sprint No ", "4");
		
		// 3. To add the Json report file in list
		List<String> li = new ArrayList<String>();
		li.add(json);
		
		// 4. Generate Report
		ReportBuilder r = new ReportBuilder(li, c);
		r.generateReports();				
				
	}

}
