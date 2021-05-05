package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService{

	@Override
	public void logExternal(String message) {

		JLoggerManager jLoggerManager = new JLoggerManager();
		jLoggerManager.log("JLoggerMessageAdaptor Works!!!!!!!!!!!");
		
	}

}
