package com.gk.combinereport;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	File reportOutputDirectory = new File("target");
    	List<String> jsonFiles = new ArrayList<String>();
    	jsonFiles.add("target/1.json");
    	jsonFiles.add("target/2.json");

    	String buildNumber = "1";
    	String projectName = "cucumberProject";
    	boolean runWithJenkins = false;
    	boolean parallelTesting = false;

    	Configuration configuration = new Configuration(reportOutputDirectory, projectName);
    	// optional configuration
    	configuration.setParallelTesting(parallelTesting);
    	configuration.setRunWithJenkins(runWithJenkins);
    	configuration.setBuildNumber(buildNumber);


    	ReportBuilder reportBuilder = new ReportBuilder(jsonFiles, configuration);
    	Reportable result = reportBuilder.generateReports();
    }
}
