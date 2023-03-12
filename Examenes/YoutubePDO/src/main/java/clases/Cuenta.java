package clases;

public class Cuenta {
	
	private String alias;
	private String email;
	
	public Cuenta(String alias, String email) {
		super();
		this.alias = alias;
		this.email = email;
	}
	
	public Cuenta() {
		
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Cuenta [alias=" + alias + ", email=" + email + "]";
	}

}
