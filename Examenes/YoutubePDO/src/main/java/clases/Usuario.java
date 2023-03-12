package clases;

public class Usuario extends Cuenta{

	public Usuario(String alias, String email) {
		super(alias, email);
	}

	@Override
	public String toString() {
		return super.toString() + "Usuario [getAlias()=" + getAlias() + ", getEmail()=" + getEmail() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	
	
}
