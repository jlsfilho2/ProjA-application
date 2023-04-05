package projA.model;
import java.util.Collection;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MapKeyColumn;

import org.hibernate.annotations.Type;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import projA.enums.OauthAuthenticationService;

/*
 * Classe de Organização
 * */
public class User extends ProjAModel implements UserDetails {
	
	
	private static final long serialVersionUID = 1L;

	@Column
	String userName;
	
	@Column
	String password;
	
	@Column
	@Type(type = "true_false")
	boolean accountNonExpired;
	
	@Column
	@Type(type = "true_false")
	boolean accountNonLocked;
	
	@Column
	@Type(type = "true_false")
	boolean credentialsNonExpired;
	
	@Column
	@Type(type = "true_false")
	boolean enabled;
	
	@ManyToMany 
    @JoinTable( 
        name = "users_roles", 
        joinColumns = @JoinColumn(
          name = "user_id", referencedColumnName = "id"), 
        inverseJoinColumns = @JoinColumn(
          name = "role_id", referencedColumnName = "id")) 
	List<Role> roles;
	
	@ManyToOne
	@JoinColumn
	Organization organization;
	
	
	@ElementCollection
	@CollectionTable(name = "user_oauth_mapping", joinColumns = {
			@JoinColumn(name = "oauth_id", referencedColumnName = "id") })
	@MapKeyColumn(name = "server")
	@Column(name = "userId")
	Map<OauthAuthenticationService, String> registers;


	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setUsername(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public boolean isAccountNonExpired() {
		return accountNonExpired;
	}


	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}


	public boolean isAccountNonLocked() {
		return accountNonLocked;
	}


	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}


	public boolean isCredentialsNonExpired() {
		return credentialsNonExpired;
	}


	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}


	public boolean isEnabled() {
		return enabled;
	}


	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}


	public Organization getOrganization() {
		return organization;
	}


	public void setOrganization(Organization organization) {
		this.organization = organization;
	}


	public Map<OauthAuthenticationService, String> getRegisters() {
		return registers;
	}


	public void setRegisters(Map<OauthAuthenticationService, String> registers) {
		this.registers = registers;
	}


	public String getUsername() {
		return userName;
	}


	
	
	
	
}
