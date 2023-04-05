package projA.model;
import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/*
 * Classe de Organização
 * */
public class URL  extends ProjAModel{
	
	
	@Column
	String url;
	
	@Enumerated(EnumType.STRING)
	URLType type;
	
	
	@ManyToOne
	@JoinColumn
	Organization organization;
	
	
	@Column
	String configurationId;
	
	
	@ManyToOne
	@JoinColumn(name="alternative")
	Organization urlAlternative;
	
	enum URLType {
		INPUT,OUTPUT
	}

	
	
}
