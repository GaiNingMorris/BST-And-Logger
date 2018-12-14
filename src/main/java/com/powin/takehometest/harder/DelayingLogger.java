package com.powin.takehometest.harder;

public class DelayingLogger {
    private IImmediateLogger immediateLogger = new ImmediateLogger();

    public IImmediateLogger getImmediateLogger() {
        return immediateLogger;
    }

    public void setImmediateLogger(IImmediateLogger immediateLogger) {
        this.immediateLogger = immediateLogger;
    }

    /**
     * Called by this class when it's time to log the message.
     *
     * @param logLine
     *            the message to log.
     */
    protected final void logMessageImmediately(String logLine) {
        getImmediateLogger().logImmediately(logLine);
    }

    /**
     * Logs a message, with a delay.
     *
     * @param delayInMilliseconds
     *            the delay time to log message
     * @param logLine
     *            the message to log.
     */
    public void logMessage(int delayInMilliseconds, String logLine) {
    	try {
			Thread.sleep(delayInMilliseconds);
			logMessageImmediately(logLine);
		} catch (InterruptedException e) {
			immediateLogger.logImmediately(e.getMessage());
		}
    }
}