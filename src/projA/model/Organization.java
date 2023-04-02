package projA.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.Type;
/*
 * Classe de Organização
 * */
public class Organization  {
	
	@Id
	@Column
	@Type(type = "org.hibernate.type.UUIDCharType")
	String id;
	
	@Column
	String coreId;
	
	@Column
	String 	identify;
	
	@Column
	String publicKey;
	
	@Column
	String urlToPostProcess;
	
	@Column
	String urlToGetProcess;
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
