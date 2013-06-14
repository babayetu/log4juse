package com.karlliu.log.log4juse;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class PlainConfiguration {
	static Logger logger = Logger.getLogger(PlainConfiguration.class);

	public static void main(String args[]) {
		PropertyConfigurator.configure(PlainConfiguration.class.getClassLoader().getResource("plainlog4jconfig"));
		logger.debug("Here is some DEBUG");
		logger.info("Here is some INFO");
		logger.warn("Here is some WARN");
		logger.error("Here is some ERROR");
		logger.fatal("Here is some FATAL");
	}
}