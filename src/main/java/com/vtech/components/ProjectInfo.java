package com.vtech.components;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ProjectInfo {

	@Value("${myapp.name}")
	private String appName;

	@Value("${myapp.version}")
	private String appVersion;

	@Value("${myapp.releasenotes}")
	private String releaseNotes;

	// Spring Expression Language (SpEL)
	@Value("#{5*10}")
	private int projectCost;

	// Default-Value
	@Value("${myapp.poweredBy:VTech-Solutions}")
	private String poweredBy;

	public void printProjectDetails() {
		System.out.println("Project Name :" + appName);
		System.out.println("Project Version :" + appVersion);
		System.out.println("Prject Release Notes :" + releaseNotes);
		System.out.println("Project Cost :" + projectCost + " $");
		System.out.println("Powered By :" + poweredBy);
	}
}
