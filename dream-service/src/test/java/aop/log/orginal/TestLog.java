package aop.log.orginal;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class TestLog {
	/**
	 * Logger for this class
	 */
	private static final Logger logger = LogManager.getLogger(TestLog.class.getName());

	public static void main(String[] args) {
		OutPutLogging dl = new OutPutLogging();
		if (logger.isInfoEnabled()) {
			logger.info("main(String[]) - OutPutLogging dl={}", dl); //$NON-NLS-1$
		}

		dl.doLogging();
	}
}
