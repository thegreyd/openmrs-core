package org.openmrs.validator;

public class LogFieldValidator {

	public static String filterLogField (String field) {
		String regex = "INFO|DEBUG|SEVERE|ERROR";
		String filteredField = field.replaceAll(regex, "");
		return filteredField;
	}
	
}
