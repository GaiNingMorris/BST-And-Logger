package com.powin.takehometest.harder;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ImmediateLogger implements IImmediateLogger {
	private final static Logger LOG = LogManager.getLogger();

	// @Override
	public void logImmediately(String message) {
		LOG.info("Log message : \"{}\".", message);
	}
}
