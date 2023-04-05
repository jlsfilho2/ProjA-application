package projA.security;

import projA.interfaces.IAuthentication;
import projA.model.configuration.SecurityConfiguration;

public class SecurityTicketImpl implements IAuthentication {
	
	SecurityConfiguration configuration;

	public void setConfiguration(SecurityConfiguration configuration) {
		this.configuration = configuration;
		
	}

	@Override
	public boolean valid(String key) {
		// TODO Auto-generated method stub
		return false;
	}

}
