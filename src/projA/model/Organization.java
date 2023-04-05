package projA.model;
import javax.persistence.Column;
import javax.persistence.Id;
import org.hibernate.annotations.Type;
/*
 * Classe de Organização
 * */
public class Organization extends ProjAModel  {

	
	@Column
	String url;
	
	@Column
	String identify;
	
	@Column
	String configurationId;
	
	@Column
	String publicKey;
	
	@Column
	String urlToPostProcess;
	
	@Column
	String urlToGetProcess;
	


	public String getIdentify() {
		return identify;
	}

	public void setIdentify(String identify) {
		this.identify = identify;
	}


	public String getUrlToPostProcess() {
		return urlToPostProcess;
	}

	public void setUrlToPostProcess(String urlToPostProcess) {
		this.urlToPostProcess = urlToPostProcess;
	}

	public String getUrlToGetProcess() {
		return urlToGetProcess;
	}

	public void setUrlToGetProcess(String urlToGetProcess) {
		this.urlToGetProcess = urlToGetProcess;
	}


	
	
}
