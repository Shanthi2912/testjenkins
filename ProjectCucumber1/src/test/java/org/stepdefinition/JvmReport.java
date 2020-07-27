package org.stepdefinition;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class JvmReport {
 public static void generateJVMReport(String json) {
	File f=new File(System.getProperty("user.dir")+"\\src\\test\\resources\\Reports\\JvmReport");

	Configuration con=new Configuration(f,"FaceBook App");
	con.addClassifications("platform name", "windows 10");
	con.addClassifications("Browser name", "Chrome");
	con.addClassifications("Browser version", "83.0");
	con.addClassifications("Sprint", "38");
 List<String> jsonFiles=new ArrayList<String>();
 jsonFiles.add(json);
 ReportBuilder r=new ReportBuilder(jsonFiles,con);
 r.generateReports();
 }
	
	
	
	
}

