package projA.interfaces;

import projA.model.configuration.EmbbebedConfiguration;

public interface IConfigured <T extends EmbbebedConfiguration> {
	
	void setConfiguration(T configuration);
	

}

