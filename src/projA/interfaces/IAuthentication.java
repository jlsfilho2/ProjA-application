package projA.interfaces;

import projA.model.configuration.SecurityConfiguration;

public interface IAuthentication extends IConfigured <SecurityConfiguration> {
	
	boolean valid(String key);
	
	

}
