package com.karlliu.log.log4juse;

import java.io.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.WriterAppender;

public class htmlandwrite {
	static Logger logger = Logger.getLogger(htmlandwrite.class);

	public static void main(String args[]) {
		HTMLLayout layout = new HTMLLayout();
		WriterAppender appender = null;
		try {
			FileOutputStream output = new FileOutputStream("output2.html");
			appender = new WriterAppender(layout, output);
		} catch (Exception e) {
		}
		logger.addAppender(appender);
		logger.setLevel((Level) Level.DEBUG);
		logger.debug("Here is some DEBUG");
		logger.info("Here is some INFO");
		logger.warn("Here is some WARN");
		logger.error("Here is some ERROR");
		logger.fatal("Here is some FATAL");
	}
}