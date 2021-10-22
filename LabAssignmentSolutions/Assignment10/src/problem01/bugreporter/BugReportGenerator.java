package problem01.bugreporter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import java.util.logging.Logger;

import problem01.classfinder.ClassFinder;

/**
 * This class scans the package problem01.javapackage
 * for classes with annotation @BugReport. It then generates a bug report
 * bugreport.txt, formatted like this:
 * 
 * Joe Smith
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 * Tom Jones
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 *     
 *     reportedBy:
 *     classname:
 *     description:
 *     severity:
 * 
 *
 */
public class BugReportGenerator {
	private static final Logger LOG = Logger.getLogger(BugReportGenerator.class.getName());
	private static final String PACKAGE_TO_SCAN = "problem01.javapackage";
	private static final String REPORT_NAME = "bug_report.txt";
	private static final String REPORTED_BY = "reportedBy: ";
	private static final String CLASS_NAME = "classname: ";
	private static final String DESCRIPTION = "description: ";
	private static final String SEVERITY = "severity: ";
	public void reportGenerator() {
		List<Class<?>> classes = ClassFinder.find(PACKAGE_TO_SCAN);
		StringBuilder allReport = new StringBuilder("");
		
		//sample code for reading annotations -- you will need to change
		//this quite a bit to solve the problem
		//Sample code below obtains a list of names of developers assigned to bugs
		List<String> names = new ArrayList<String>();
		List<String[]> infoList;
		HashMap< String, List<String[]> > infoMap = new HashMap< String, List<String[]>>();
		for(Class<?> cl : classes) {
			if(cl.isAnnotationPresent(BugReport.class)) {
				BugReport annotation = (BugReport)cl.getAnnotation(BugReport.class);
				String name = annotation.assignedTo();
				String[] singleInfo = new String[] {annotation.reportedBy(), cl.getName(), annotation.description(), Integer.toString(annotation.severity())};
				if(infoMap.containsKey(name)) {
					infoMap.get(name).add(singleInfo);
				} else {
					names.add(name);
					infoList = new ArrayList<String[]>();
					infoList.add(singleInfo);
					infoMap.put(name, infoList);
				}
			}
		}
		for(String name: names) {
			allReport.append(name+"\n");
			infoList = infoMap.get(name);
			for(String[] singleInfo: infoList) {
				allReport.append("\t"+REPORTED_BY+ singleInfo[0]+"\n");
				allReport.append("\t"+CLASS_NAME+ singleInfo[1]+"\n");
				allReport.append("\t"+DESCRIPTION+ singleInfo[2]+"\n");
				allReport.append("\t"+SEVERITY+ singleInfo[3]+"\n");
				allReport.append("\n");
			}
		}
			System.out.println(allReport);
			
			// Write to a file
		    File file = new File ("C:/Users/tooet/Desktop/"+REPORT_NAME);
		    PrintWriter printWriter = null;
			try {
				printWriter = new PrintWriter (file);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		    printWriter.println (allReport);
		    printWriter.close ();  
	}
	
	
}
