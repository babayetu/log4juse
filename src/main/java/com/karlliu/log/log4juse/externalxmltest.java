package com.karlliu.log.log4juse;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class externalxmltest {
	static Logger logger = Logger.getLogger(externalxmltest.class);

	public static void main(String args[]) {
		DOMConfigurator.configure(externalxmltest.class.getClassLoader().getResource("xmllog4jconfig.xml"));
		logger.debug("Here is some DEBUG");
		logger.info("Here is some INFO");
		logger.warn("Here is some WARN");
		logger.error("Here is some ERROR");
		logger.fatal("Here is some FATAL");
	}
}