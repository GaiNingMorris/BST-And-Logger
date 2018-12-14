package com.powin.takehometest.easier;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.anarsoft.vmlens.concurrent.junit.ConcurrentTestRunner;
import com.anarsoft.vmlens.concurrent.junit.ThreadCount;
import com.powin.takehometest.harder.DelayingLogger;

@RunWith(ConcurrentTestRunner.class)
public class DelayingLoggerTest {

	// the count of threads
	private final static int THREAD_COUNT = 10;
	// the delay time
	private final static int DELAY_TIME = 6000;
	// thousand 
	private final static int THOUSAND = 1000;
	// zero
	private final static int ZERO = 0;

	@Test
	@ThreadCount(THREAD_COUNT)
	public void LogMessage() {
		long startTime = System.currentTimeMillis();
		
		DelayingLogger logger = new DelayingLogger();
		logger.logMessage(DELAY_TIME, Thread.currentThread() 
				+ " is logging messages");
		
		// runtime should be very close to delay time
        long runtime = System.currentTimeMillis() - startTime;
        Assert.assertEquals((runtime - DELAY_TIME) / THOUSAND, ZERO); 
	}
}